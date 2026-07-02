package compiler;

import jhp.parser.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.*;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JhpVisitor extends JhpParserBaseVisitor<Void> {

    private PrintWriter out;
    private int indentLevel = 0;
    private int needStatic = 0; // 1=需要static，0=不需要static
    private final String mainClassName;          // 顶层 public class 的名字
    private final int mode;                      // 编译模式 1~3
    private boolean hasMain = true;              // 是否生成 main 方法（模式1/2需要 main）
    private boolean insideClass = false;   // 是否在类内部

    // 变量处理逻辑现在在这个独立的对象中
    private final VariableProcessor varProc;
    private final ExpressionProcessor exprProc;

    private final ClassProcessor classProcessor;

    private final EnumProcessor enumProcessor;

    private String currentNamespace = null;
    private Map<String, String> importMap = new HashMap<>();   // 短名 -> 全限定名

    public JhpVisitor(PrintWriter out, int mode, String className) {
        this.out = out;
        this.mode = mode;
        this.mainClassName = (className != null && !className.isEmpty()) ? className : "GeneratedClass";
        if(mode == 1 || mode == 2) {
            this.needStatic = 1; // 模式1和模式2需要 static 方法
        }
        this.varProc = new VariableProcessor(out, this::shortenClassName);
        this.exprProc = new ExpressionProcessor(varProc, out);
        this.exprProc.setVisitor(this);
        this.varProc.setExprProcessor(exprProc);  // 解决循环依赖
        this.classProcessor = new ClassProcessor(varProc, exprProc, this, out);
        this.enumProcessor = new EnumProcessor(varProc, exprProc, this, out);
    }

    private void indent() {
        for (int i = 0; i < indentLevel; i++) out.print("    ");
    }

    // 收集属性，传递给 processor
    @Override
    public Void visitAttributes(JhpParser.AttributesContext ctx) {
        varProc.setCurrentAttributes(ctx.attributeGroup());
        return null;
    }
    

    @Override
    public Void visitPhpFile(JhpParser.PhpFileContext ctx) {
        // 首先输出命名空间（如果有）
        if (ctx.namespaceDeclaration() != null) {
            visit(ctx.namespaceDeclaration()); // 生成 package xxx;
        }


        // 添加默认 import
        out.println("import runtime.JhpRuntime;");

        // 输出用户自定义的 import
        for (JhpParser.ImportStatementContext imp : ctx.importStatement()) {
            visit(imp);
        }

        if(mode == 3 || mode == 4) {
             clazzProcess(ctx);
        }else if(mode == 1 || mode == 2) {
            
            // 输出默认的 import
            out.println("import java.util.*;");
//            out.println("import runtime.JhpRuntime;");
            out.println("public class " + mainClassName + " {");
            indentLevel++;

            // 收集非函数声明的顶层语句，用于 main 方法
            List<ParseTree> mainStatements = new ArrayList<>();

            for (ParseTree child : ctx.children) {
                if (child instanceof JhpParser.TopStatementContext) {
                    JhpParser.TopStatementContext topCtx = (JhpParser.TopStatementContext) child;
                    // 遇到函数声明，立即生成
                    if (topCtx.functionDeclaration() != null) {
                        visit(topCtx.functionDeclaration());
                    } else {
                        mainStatements.add(topCtx);
                    }
                }
            }

            JhpUtils.printIndent(out, indentLevel);
            out.println("public static void main(String[] args) {");
            indentLevel++;
            for (ParseTree stmt : mainStatements) {
                visit(stmt);
            }
            indentLevel--;
            out.println("    }");
            indentLevel--;
            out.println("}");
        }
       
        
        return null;
    }

    @Override
    public Void visitExpressionStatement(JhpParser.ExpressionStatementContext ctx) {
        if (ctx.expression() instanceof JhpParser.AssignmentExpressionContext) {
            JhpParser.AssignmentExpressionContext assignCtx = (JhpParser.AssignmentExpressionContext) ctx.expression();
            JhpParser.ExpressionContext right = assignCtx.expression();

            // 多行闭包
            if (right instanceof JhpParser.LambdaFunctionExpressionContext) {
                JhpParser.LambdaFunctionExpressionContext lambdaCtx = (JhpParser.LambdaFunctionExpressionContext) right;
                // 判断是否多行闭包（有 blockStatement）
                if (lambdaCtx.lambdaFunctionExpr().blockStatement() != null) {
                    ClosureProcessor closureProc = new ClosureProcessor(varProc, exprProc, this, out, indentLevel);
                    closureProc.handleMultiLineClosureAssign(assignCtx, lambdaCtx);
                    return null;
                }
            }
            // 单行闭包：走正常赋值处理 (VariableProcessor)
            varProc.handleAssignment(assignCtx, indentLevel);
        }else {
            String exprCode = exprProc.generateExpression(ctx.expression(), indentLevel);
            JhpUtils.printIndent(out, indentLevel);
            out.println(exprCode + ";");
        }
        return null;
    }

    @Override
    public Void visitEchoStatement(JhpParser.EchoStatementContext ctx) {
        List<JhpParser.ExpressionContext> expressions = ctx.expressionList().expression();
        
        StringBuilder args = new StringBuilder();
        for (int i = 0; i < expressions.size(); i++) {
            if (i > 0) {
                args.append(", ");
            }
            args.append(exprProc.generateExpression(expressions.get(i), indentLevel));
        }
        
        indent();
        out.printf("JhpRuntime.echo(%s);%n", args.toString());
        return null;
    }

    @Override
    public Void visitChainExpression(JhpParser.ChainExpressionContext ctx) {
        // 单独的变量表达式不产出代码
        return null;
    }

    @Override
    public Void visitScalarExpression(JhpParser.ScalarExpressionContext ctx) {
        return null;
    }

    @Override
    public Void visitIfStatement(JhpParser.IfStatementContext ctx) {
        JhpParser.ExpressionContext condExpr = ctx.parentheses().expression();
        String condCode = exprProc.generateExpression(condExpr, indentLevel);

        JhpUtils.printIndent(out, indentLevel);
        if(ctx.innerStatementList() != null){
            out.println("if (" + condCode + "){");
            indentLevel++;
            visit(ctx.innerStatementList());
            indentLevel--;
            JhpUtils.printIndent(out, indentLevel);
            out.println("}");
            if(ctx.elseIfColonStatement() != null) {
                for (JhpParser.ElseIfColonStatementContext elseIf : ctx.elseIfColonStatement()){
                    String elseIfCond = exprProc.generateExpression(elseIf.parentheses().expression(), indentLevel);
                    JhpUtils.printIndent(out, indentLevel);
                    out.println("else if (" + elseIfCond + "){");
                    indentLevel++;
                    visit(elseIf.innerStatementList());
                    indentLevel--;
                    JhpUtils.printIndent(out, indentLevel);
                    out.println("}");
                }
            }
            if(ctx.elseColonStatement() != null) {
                JhpUtils.printIndent(out, indentLevel);
                out.println("else {");
                indentLevel++;
                visit(ctx.elseColonStatement().innerStatementList());
                indentLevel--;
                JhpUtils.printIndent(out, indentLevel);
                out.println("}");

            }
        }else {
            out.println("if (" + condCode + ")");
            visit(ctx.statement());

            if (ctx.elseIfStatement() != null) {
                for (JhpParser.ElseIfStatementContext elseIf : ctx.elseIfStatement()) {
                    String elseIfCond = exprProc.generateExpression(elseIf.parentheses().expression(), indentLevel);
                    JhpUtils.printIndent(out, indentLevel);
                    out.println("else if (" + elseIfCond + ")");
                    visit(elseIf.statement());
                }
            }

            if (ctx.elseStatement() != null) {
                JhpUtils.printIndent(out, indentLevel);
                out.println("else");
                visit(ctx.elseStatement().statement());
            }
        }

        return null;
    }

    @Override
    public Void visitBlockStatement(JhpParser.BlockStatementContext ctx) {
        // 用于独立语句块（非if分支）
        JhpUtils.printIndent(out, indentLevel);
        out.println("{");
        indentLevel++;
        visit(ctx.innerStatementList());
        indentLevel--;
        JhpUtils.printIndent(out, indentLevel);
        out.println("}");
        return null;
    }

    @Override
    public Void visitWhileStatement(JhpParser.WhileStatementContext ctx) {
        JhpParser.ExpressionContext condExpr = ctx.parentheses().expression();
        String condCode = exprProc.generateExpression(condExpr, indentLevel);

        JhpUtils.printIndent(out, indentLevel);
        out.println("while (" + condCode + ")");
        if(ctx.innerStatementList() != null){
            JhpUtils.printIndent(out, indentLevel);
            out.println("{");
            indentLevel++;
            visit(ctx.innerStatementList());
            indentLevel--;
            JhpUtils.printIndent(out, indentLevel);
            out.println("}");
        }else {
            visit(ctx.statement());
        }
        return null;
    }

    @Override
    public Void visitForStatement(JhpParser.ForStatementContext ctx) {
        String initCode = (ctx.forInit() != null && ctx.forInit().expressionList() != null) ? generateForInit(ctx.forInit().expressionList(), indentLevel) : "";
        String[] initCodes = initCode.split(",");
        // 只取最后一个表达式作为循环条件，默认 true
        String condCode = "true";
        if (ctx.expressionList() != null && !ctx.expressionList().expression().isEmpty()) {
            List<JhpParser.ExpressionContext> condExprs = ctx.expressionList().expression();
            // 只使用最后一个表达式
            condCode = exprProc.generateExpression(condExprs.get(condExprs.size() - 1), indentLevel);
            if (condExprs.size() > 1) {
                System.err.println("Warning: multiple expressions in for condition, only the last one is used as the loop condition.");
            }
        }

        String updateCode = (ctx.forUpdate() != null && ctx.forUpdate().expressionList() != null) ? exprProc.generateExpressionList(ctx.forUpdate().expressionList(), indentLevel) : "";
        
        if(initCodes.length > 1) {
            initCode = initCodes[0]; // 取第一个表达式作为循环初始化
            for (int i = 1; i < initCodes.length; i++) {
                String code = initCodes[i];
                if (!code.trim().isEmpty()) {
                    indent();
                    out.println(code.trim() + ";");
                }
            }
        }
        JhpUtils.printIndent(out, indentLevel);
        out.printf("for (%s; %s; %s)%n", initCode, condCode, updateCode);
        if(ctx.innerStatementList() != null){
            JhpUtils.printIndent(out, indentLevel);
            out.println("{");
            indentLevel++;
            visit(ctx.innerStatementList());
            indentLevel--;
            JhpUtils.printIndent(out, indentLevel);
            out.println("}");
        }else {
            visit(ctx.statement());
        }

        return null;
        
    }

    private String generateForInit(JhpParser.ExpressionListContext ctx, int indentLevel) {
        List<JhpParser.ExpressionContext> exprs = ctx.expression();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < exprs.size(); i++) {
            if (i > 0) sb.append(", ");
            
            JhpParser.ExpressionContext expr = exprs.get(i);
            if (expr instanceof JhpParser.AssignmentExpressionContext) {
                JhpParser.AssignmentExpressionContext assignCtx = (JhpParser.AssignmentExpressionContext) expr;
                String leftVar = JhpUtils.getAssignableVarName(assignCtx.assignable());
                String rightCode = exprProc.generateExpression(assignCtx.expression(), indentLevel);
                
                // 检查是否是首次声明
                if (!varProc.isVariableDeclared(leftVar)) {
                    String varType = exprProc.inferTypeFromExpression(assignCtx.expression());
                    varProc.setVariableType(leftVar, varType);
                    sb.append(varType).append(" ").append(leftVar).append(" = ").append(rightCode);
                } else {
                    sb.append(leftVar).append(" = ").append(rightCode);
                }
            } else {
                sb.append(exprProc.generateExpression(expr, indentLevel));
            }
        }
        return sb.toString();
    }

    @Override
    public Void visitDoWhileStatement(JhpParser.DoWhileStatementContext ctx) {
        JhpParser.ExpressionContext condExpr = ctx.parentheses().expression();
        String condCode = exprProc.generateExpression(condExpr, indentLevel);

        JhpUtils.printIndent(out, indentLevel);
        out.println("do");
        visit(ctx.statement());
        JhpUtils.printIndent(out, indentLevel);
        out.println("while (" + condCode + ");");
        return null;
    }


    @Override
    public Void visitSwitchStatement(JhpParser.SwitchStatementContext ctx) {
        // 1. 条件表达式
        JhpParser.ExpressionContext condExpr = ctx.parentheses().expression();
        String condCode = exprProc.generateExpression(condExpr, indentLevel);

        // 2. switch 头
        JhpUtils.printIndent(out, indentLevel);
        out.println("switch (" + condCode + ") {");
        indentLevel++;

        // 3. 遍历每个 switchBlock
        if (ctx.switchBlock() != null) {
            for (JhpParser.SwitchBlockContext block : ctx.switchBlock()) {
                System.err.println("DEBUG: Visiting switch block with text: " + block.getText());
                // 判断是 case 还是 default
                if (block.Case() != null) {
                    // case 标签
                    JhpParser.ExpressionContext expr = block.expression();
                    String caseCode = exprProc.generateExpression(expr, indentLevel);
                    JhpUtils.printIndent(out, indentLevel);
                    out.println("case " + caseCode + ":");
                } else if (block.Default() != null) {
                    // default 标签
                    JhpUtils.printIndent(out, indentLevel);
                    out.println("default:");
                }

                // 标签后的语句体（都包裹在 switchBlockBody 中）
                if (block.switchBlockBody() != null && block.switchBlockBody().innerStatementList() != null) {
                    indentLevel++;
                    visit(block.switchBlockBody().innerStatementList());
                    indentLevel--;
                }
            }
        }

        // 4. 闭合花括号
        indentLevel--;
        JhpUtils.printIndent(out, indentLevel);
        out.println("}");

        return null;
    }

    @Override
    public Void visitForeachStatement(JhpParser.ForeachStatementContext ctx) {
        // 1. 提取被遍历的数组部分
        String arrayCode;
        boolean isExpressionArray = ctx.expression() != null && !ctx.expression().isEmpty();
        if (isExpressionArray) {
            arrayCode = exprProc.generateExpression(ctx.expression(), indentLevel);
        } else if (!ctx.chain().isEmpty()) {
            // 第一个 chain 是数组变量
            arrayCode = exprProc.generateChainCode(ctx.chain(0), indentLevel);
        } else {
            exprProc.fatalError("Unsupported foreach syntax");
            return null;
        }

        // 2. 确定键/值变量
        JhpParser.AssignableContext leftAssignable = ctx.assignable();   // 单个
        String keyVar = null;
        String valueVar;
        boolean hasKey = ctx.chain().size() > 1;  // 是否有第二个 chain（键值对形式）

        if (hasKey) {
            keyVar = JhpUtils.getAssignableVarName(leftAssignable);
            valueVar = JhpUtils.getVarNameFromChain(ctx.chain(1));   // 第二个 chain 是值变量
        } else {
            valueVar = JhpUtils.getAssignableVarName(leftAssignable);
        }

        // 3. 获取数组类型，推断元素类型
        String arrayType;
        if (isExpressionArray) {
            arrayType = exprProc.inferTypeFromExpression(ctx.expression());
        } else {
            // System.err.println("Warning: inferring array type from chain for foreach, may be inaccurate: " + ctx.getText());
            arrayType = exprProc.inferTypeFromChain(ctx.chain(0));
            // System.err.println("Inferred array type: " + arrayType);
        }
        String elementType = JhpUtils.extractElementType(arrayType);
        String keyType = JhpUtils.extractKeyType(arrayType);

        // 4. 生成循环头
        JhpUtils.printIndent(out, indentLevel);
        if (hasKey) {
            if (JhpUtils.isListType(arrayType)) {
                out.printf("for (int %s = 0; %s < %s.size(); %s++) {%n", keyVar, keyVar, arrayCode, keyVar);
                indentLevel++;
                JhpUtils.printIndent(out, indentLevel);
                out.printf("%s %s = %s.get(%s);%n", elementType, valueVar, arrayCode, keyVar);
            } else if (JhpUtils.isMapType(arrayType)) {
                out.printf("for (Map.Entry<%s, %s> %s_entry : %s.entrySet()) {%n", keyType, elementType,keyVar, arrayCode);
                indentLevel++;
                JhpUtils.printIndent(out, indentLevel);
                out.printf("%s %s = %s_entry.getKey();%n", keyType, keyVar, keyVar);
                JhpUtils.printIndent(out, indentLevel);
                out.printf("%s %s = %s_entry.getValue();%n", elementType, valueVar, keyVar);
            } else {
                System.err.println("Warning: cannot provide key for unknown type in foreach");
                out.printf("for (%s %s : %s) {%n", elementType, valueVar, arrayCode);
                indentLevel++;
            }
        } else {
            if (JhpUtils.isMapType(arrayType)) {
                out.printf("for (%s %s : %s.values()) {%n", elementType, valueVar, arrayCode);
            } else {
                out.printf("for (%s %s : %s) {%n", elementType, valueVar, arrayCode);
            }
            indentLevel++;
        }

        if (keyVar != null && !varProc.isVariableDeclared(keyVar)) {
            varProc.setVariableType(keyVar, keyType);
        }
        if (valueVar != null && !varProc.isVariableDeclared(valueVar)) {
            varProc.setVariableType(valueVar, elementType);
        }

        // 5. 循环体
        if (ctx.statement() != null) {
            JhpParser.StatementContext bodyStmt = ctx.statement();
            if (bodyStmt.blockStatement() != null) {
                // 块语句：只访问内部，避免重复输出花括号
                visit(bodyStmt.blockStatement().innerStatementList());
            } else {
                // 单条语句：直接访问
                visit(bodyStmt);
            }
        } else if (ctx.innerStatementList() != null) {
            visit(ctx.innerStatementList());
        }

        indentLevel--;
        JhpUtils.printIndent(out, indentLevel);
        out.println("}");

        return null;
    }

    @Override
    public Void visitFunctionDeclaration(JhpParser.FunctionDeclarationContext ctx) {
        String funcName = ctx.identifier().getText();

        // 提取方法泛型参数
        List<String> methodTypeParams = new ArrayList<>();
        String genericString = "";
        if (ctx.typeParameterListInBrackets() != null) {
            genericString = JhpUtils.applyMethodTypeParameters(ctx.typeParameterListInBrackets(),varProc);
            if (ctx.typeParameterListInBrackets().typeParameterList() != null) {
                for (JhpParser.TypeParameterDeclContext decl :
                        ctx.typeParameterListInBrackets().typeParameterList().typeParameterDecl()) {
                    methodTypeParams.add(decl.identifier().getText());
                }
            }
        }

        // 推断返回类型
        String returnType = "void";
        if (ctx.typeHint() != null) {
            returnType = JhpUtils.mapTypeHint(ctx.typeHint());
            returnType = shortenClassName(returnType);
        }

        varProc.setFunctionReturnType(funcName, returnType);
        // 构建参数列表
        List<String> paramDecls = new ArrayList<>();
        JhpParser.FormalParameterListContext paramsCtx = ctx.formalParameterList();
        if (paramsCtx != null) {
            for (JhpParser.FormalParameterContext param : paramsCtx.formalParameter()) {
                String paramType = "Object"; // 缺省类型
                String annotation = JhpUtils.generateParameterAnnotations(param);
                Boolean isVarArg = param.Ellipsis() != null;
                if (param.typeHint() != null) {
                    paramType = JhpUtils.mapTypeHint(param.typeHint());
                    paramType = shortenClassName(paramType);
                }
                paramType = paramType + (isVarArg ? "..." : "");
                // variableInitializer 必须包含 VarName
                String varName = param.variableInitializer().VarName().getText();
                varName = varName.substring(1); // 去掉 $
                paramDecls.add(annotation+ " " + paramType + " " + varName);
                // 将参数类型注册到符号表（便于函数体内部使用）
                varProc.setVariableType(varName, paramType);
            }
        }

        // 输出方法签名
        JhpUtils.printIndent(out, indentLevel);
        String staticString = (needStatic == 1) ? "static " : ""; // 如果是单文件编译并运行，方法需要 static
        out.printf("public %s %s %s %s(%s) %n",staticString,genericString, returnType, funcName, String.join(", ", paramDecls));

        // 在 visit(body.blockStatement()) 之前
        varProc.enterScope();
        // 方法体
        visit(ctx.blockStatement());
        // 在 visit 之后
        varProc.leaveScope();
        // 恢复作用域
        if (!methodTypeParams.isEmpty()) {
            JhpUtils.restoreMethodTypeParameters(methodTypeParams,varProc);
        }
        return null;
    }

    @Override
    public Void visitClassDeclaration(JhpParser.ClassDeclarationContext ctx) {
//        System.err.println("DEBUG: Visiting class declaration: " + ctx.getText());
        classProcessor.process(ctx, indentLevel);
        return null;
    }

    @Override
    public Void visitEnumDeclaration(JhpParser.EnumDeclarationContext ctx) {
        System.err.println("DEBUG: Visiting enum declaration: " + ctx.getText());
        enumProcessor.process(ctx, indentLevel);
        return null;
    }

    @Override
    public Void visitNamespaceDeclaration(JhpParser.NamespaceDeclarationContext ctx) {
        String fullName = ctx.namespaceNameList().getText(); // 例如 "App\Model"
        String javaPackage = fullName.replace("\\", ".");
        JhpUtils.printIndent(out, indentLevel);  // 应在文件顶部，缩进为 0
        out.println("package " + javaPackage + ";");
        out.println(); // 空行分隔
        return null;
    }

    @Override
    public Void visitImportStatement(JhpParser.ImportStatementContext ctx) {
        JhpParser.ImportPathContext pathCtx = ctx.importPath();
        System.err.println("DEBUG: Visiting import statement with path: " + pathCtx.getText());
        String path = pathCtx.getText().replace("\\", ".");
        // 只处理普通导入，跳过通配符
        if (!path.endsWith(".*")) {
            String alias = path.substring(path.lastIndexOf('.') + 1);
            importMap.put(alias, path);
        }
        out.println("import " + path + ";");
        return null;
    }

    @Override
    public Void visitContinueStatement(JhpParser.ContinueStatementContext ctx) {
        indent();
        out.println("continue;");
        return null;
    }

    @Override
    public Void visitBreakStatement(JhpParser.BreakStatementContext ctx) {
        indent();
        out.println("break;");
        return null;
    }

    @Override
    public Void visitReturnStatement(JhpParser.ReturnStatementContext ctx) {
        String returnCode = (ctx.expression() != null) ? exprProc.generateExpression(ctx.expression(), indentLevel) : "";
        indent();
        out.println("return " + returnCode + ";");
        return null;
    }

    @Override
    public Void visitTryCatchFinally(JhpParser.TryCatchFinallyContext ctx) { 
        JhpUtils.printIndent(out, indentLevel);
        out.println("try ");
        // indentLevel++;
        visit(ctx.blockStatement());
        // indentLevel--;
        JhpUtils.printIndent(out, indentLevel);

        
        // 2. catch 从句
        if (ctx.catchClause() != null) {
            for (JhpParser.CatchClauseContext catchCtx : ctx.catchClause()) {
                // 异常类型转换

                List<String> exceptionTypes = new ArrayList<>();
                List<JhpParser.QualifiedStaticTypeRefContext> refs = catchCtx.qualifiedStaticTypeRef();
                for (JhpParser.QualifiedStaticTypeRefContext ref : refs) {
                    // System.err.println("DEBUG: Catch clause has exception type: " + ref.getText());
                    exceptionTypes.add(JhpUtils.qualifiedStaticTypeRefToJava(ref));
                }

                if(exceptionTypes.isEmpty()) {
                    exceptionTypes.add("Exception"); // 默认捕获 Exception
                }

                String exceptionType = String.join(" | ", exceptionTypes);
                
                // 变量名
                String varName = "";
                if (catchCtx.VarName() != null) {
                    varName = catchCtx.VarName().getText().substring(1); // 去掉 $
                    varProc.setVariableType(varName, exceptionType);     // 注册到符号表
                }


                out.println("catch (" + exceptionType + " " + varName + ") ");
                // indentLevel++;
                visit(catchCtx.blockStatement());
                // indentLevel--;
                
            }
        }

        if (ctx.finallyStatement() != null) {
            JhpUtils.printIndent(out, indentLevel);
            out.println("finally ");
            // indentLevel++;
            visit(ctx.finallyStatement().blockStatement());
            // indentLevel--;
        }

        return null;
    }

    @Override
    public Void visitThrowStatement(JhpParser.ThrowStatementContext ctx) {
        indent();
        out.println("throw " + exprProc.generateExpression(ctx.expression(), indentLevel) + ";");
        return null;
    }

    private void clazzProcess(JhpParser.PhpFileContext ctx) {

        // 直接翻译所有顶层语句，不做任何包装
        for (ParseTree child : ctx.children) {
            if (child instanceof JhpParser.TopStatementContext) {
                visit(child);
            }
        }
    }

    public void setIndentLevel(int indentLevel){
        this.indentLevel = indentLevel;
    }

    public int getIndentLevel(){
        return indentLevel;
    }

    public VariableProcessor getVariableProcessor() {
        return varProc;
    }

    public String resolveClassName(String name) {
        if (name == null || name.isEmpty()) return name;
        if (name.contains(".")) return name;      // 已经是全限定名
        if (importMap.containsKey(name)) {
            return importMap.get(name);
        }
        if (currentNamespace != null && !currentNamespace.isEmpty()) {
            return currentNamespace + "." + name;
        }
        return name;
    }

    /**
     * 将全限定类名转换为短名（如果当前文件有对应的 import 或处于同一包下）
     */
    public String shortenClassName(String fullName) {
        if (fullName == null || fullName.isEmpty()) return fullName;
        // 1. 查导入表（已通过 import 精确导入）
        for (Map.Entry<String, String> entry : importMap.entrySet()) {
            if (entry.getValue().equals(fullName)) {
                return entry.getKey();   // 返回短名
            }
        }
        // 2. 属于当前命名空间（同包），直接取短名
        if (currentNamespace != null && fullName.startsWith(currentNamespace + ".")) {
            String simpleName = fullName.substring(currentNamespace.length() + 1);
            // 无冲突时直接返回
            return simpleName;
        }
        return fullName;
    }

    public void setOut(PrintWriter out) {
        this.out = out;
    }

    public PrintWriter getOut() {
        return this.out;
    }
}