package compiler;

import jhp.parser.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.*;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class JhpVisitor extends JhpParserBaseVisitor<Void> {

    private final PrintWriter out;
    private int indentLevel = 0;
    private int needStatic = 0; // 1=需要static，0=不需要static
    private final String mainClassName;          // 顶层 public class 的名字
    private final int mode;                      // 编译模式 1~3
    private boolean hasMain = true;              // 是否生成 main 方法（模式1/2需要 main）
    private boolean insideClass = false;   // 是否在类内部

    // 变量处理逻辑现在在这个独立的对象中
    private final VariableProcessor varProc;
    private final ExpressionProcessor exprProc;

    public JhpVisitor(PrintWriter out, int mode, String className) {
        this.out = out;
        this.mode = mode;
        this.mainClassName = (className != null && !className.isEmpty()) ? className : "GeneratedClass";
        if(mode == 1 || mode == 2) {
            this.needStatic = 1; // 模式1和模式2需要 static 方法
        }
        this.varProc = new VariableProcessor(out);
        this.exprProc = new ExpressionProcessor(varProc, out);
        this.varProc.setExprProcessor(exprProc);  // 解决循环依赖
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

        // 输出用户自定义的 import
        for (JhpParser.ImportStatementContext imp : ctx.importStatement()) {
            visit(imp);
        }

        if(mode == 3) {
             clazzProcess(ctx);
        }else if(mode == 1 || mode == 2) {
            
            // 输出默认的 import
            out.println("import java.util.*;");
            
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
            varProc.handleAssignment(
                (JhpParser.AssignmentExpressionContext) ctx.expression(),
                indentLevel
            );
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
        out.printf("runtime.JhpRuntime.echo(%s);%n", args.toString());
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
        visit(ctx.statement());
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
        visit(ctx.statement());
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
            arrayCode = JhpUtils.getVarNameFromChain(ctx.chain(0));
        } else {
            System.err.println("Unsupported foreach syntax");
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
            arrayType = varProc.getVariableType(arrayCode);
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
            visit(ctx.statement());
        } else if (ctx.innerStatementList() != null) {
            System.err.println("Colon-style foreach not supported yet");
        }

        indentLevel--;
        JhpUtils.printIndent(out, indentLevel);
        out.println("}");

        return null;
    }

    @Override
    public Void visitFunctionDeclaration(JhpParser.FunctionDeclarationContext ctx) {
        String funcName = ctx.identifier().getText();
        
        // 推断返回类型
        String returnType = "void";
        if (ctx.typeHint() != null) {
            returnType = JhpUtils.mapTypeHint(ctx.typeHint());
        }

        varProc.setFunctionReturnType(funcName, returnType);
        // 构建参数列表
        List<String> paramDecls = new ArrayList<>();
        JhpParser.FormalParameterListContext paramsCtx = ctx.formalParameterList();
        if (paramsCtx != null) {
            for (JhpParser.FormalParameterContext param : paramsCtx.formalParameter()) {
                String paramType = "Object"; // 缺省类型
                if (param.typeHint() != null) {
                    paramType = JhpUtils.mapTypeHint(param.typeHint());
                }
                // variableInitializer 必须包含 VarName
                String varName = param.variableInitializer().VarName().getText();
                varName = varName.substring(1); // 去掉 $
                paramDecls.add(paramType + " " + varName);
                // 将参数类型注册到符号表（便于函数体内部使用）
                varProc.setVariableType(varName, paramType);
            }
        }

        // 输出方法签名
        JhpUtils.printIndent(out, indentLevel);
        String staticString = (needStatic == 1) ? "static " : ""; // 如果是单文件编译并运行，方法需要 static
        out.printf("public %s %s %s(%s) %n",staticString, returnType, funcName, String.join(", ", paramDecls));
        
        // 方法体
        visit(ctx.blockStatement());

        return null;
    }

    @Override
    public Void visitClassDeclaration(JhpParser.ClassDeclarationContext ctx) {
        // 提取类名和类型
        String className = ctx.identifier().getText();
        boolean isInterface = ctx.Interface() != null;

        // 修饰符：abstract, final 等
        String modifiers = "";

        if (ctx.Public() != null) {
            modifiers += "public ";
        } else if (ctx.Protected() != null) {
            modifiers += "protected ";
        } else if (ctx.Private() != null) {
            modifiers += "private ";
        } else {
            modifiers += "public "; // PHP 默认 public
        }

        if (ctx.modifier() != null) {
            modifiers += ctx.modifier().getText() + " ";
        }

        // extends
        String extendsClause = "";
        if (ctx.Extends() != null && ctx.qualifiedStaticTypeRef() != null) {
            extendsClause = " extends " + JhpUtils.phpPackageToJavaPackage(ctx.qualifiedStaticTypeRef().getText());
        }
        // implements
        String implementsClause = "";
        if (ctx.Implements() != null && ctx.interfaceList() != null) {
            List<String> ifaces = new ArrayList<>();
            for (JhpParser.QualifiedStaticTypeRefContext iface : ctx.interfaceList().qualifiedStaticTypeRef()) {
                ifaces.add(JhpUtils.phpPackageToJavaPackage(iface.getText()));
            }
            implementsClause = " implements " + String.join(", ", ifaces);
        }

        varProc.setCurrentClassName(className);

        // 输出类头
        JhpUtils.printIndent(out, indentLevel);
        String classType = "class";
        if(isInterface) {
            classType = "interface";
        }
        
        // 如果走了interface，则这里ctx.classEntryType是null
        if(!isInterface && ctx.classEntryType() != null && ctx.classEntryType().Trait() != null) {
            System.err.println("Warning: trait is not directly supported, treating as class");
            classType = "class"; // Java 没有 trait，暂当作普通类处理
        }

        out.println(modifiers + classType+" " + className + extendsClause + implementsClause + " {");
        indentLevel++;

        insideClass = true;

        // 翻译类成员
        for (JhpParser.ClassStatementContext stmt : ctx.classStatement()) {
            translateClassStatement(stmt, ctx);
        }

        insideClass = false;
        indentLevel--;
        JhpUtils.printIndent(out, indentLevel);
        out.println("}");
        varProc.setCurrentClassName(null);
        return null;
    }

    private void translateClassStatement(JhpParser.ClassStatementContext stmt,JhpParser.ClassDeclarationContext ctx) {
        if (stmt.Use() != null) {
            // trait use，暂不支持
            JhpUtils.printIndent(out, indentLevel);
            out.println("The trait use statement is not supported yet; skipping.");
            return;
        }

        // 成员变量声明
        if (stmt.propertyModifiers() != null) {
            generateClassMemberVariable(stmt);
            return;
        }

        // 常量声明
        if (stmt.Const() != null) {
            generateClassConst(stmt);
            return;
        }

        // 函数声明
        if (stmt.Function_() != null) {
            generateClassMethod(stmt, ctx);
            return;
        }
        
    }

    private void generateClassMemberVariable(JhpParser.ClassStatementContext stmt) {
        
        // 语法文件去除了var修饰，因为PHP7后var默认就是public
        String accessModifier = "public "; // PHP 默认 public
        JhpParser.MemberModifiersContext modifiersCtx = stmt.propertyModifiers().memberModifiers();
        if (modifiersCtx != null) {
            accessModifier = JhpUtils.extractAccessModifier(modifiersCtx);
        }
        String type = "Object"; // 默认类型
        if (stmt.typeHint() != null) {
            type = JhpUtils.mapTypeHint(stmt.typeHint());
        }
        // 处理多个 variableInitializer（用逗号分隔）
        for (JhpParser.VariableInitializerContext varInit : stmt.variableInitializer()) {
            String varName = varInit.VarName().getText().substring(1); // 去掉 $
            String init = "";
            if (varInit.Eq() != null && varInit.constantInitializer() != null) {
                init = " = " + exprProc.generateConstantInitializer(varInit.constantInitializer(), indentLevel);
                // constantInitializer 内部可能是一个 expression，也可能嵌套 array 等，但 generateExpression 可处理
            }
            JhpUtils.printIndent(out, indentLevel);
            out.println(accessModifier + type + " " + varName + init + ";");
        }
    }

    private void generateClassConst(JhpParser.ClassStatementContext stmt) {
        
        String type = null;
        
        if (stmt.typeHint() != null) {
            type = JhpUtils.mapTypeHint(stmt.typeHint());
        }

        List<JhpParser.IdentifierInitializerContext> idInits = stmt.identifierInitializer();

        if (type == null && !idInits.isEmpty()) {
            // 无显式类型，遍历初始化器，只保留最后一条有效推断
            String inferredType = "Object";
            for (JhpParser.IdentifierInitializerContext idInit : idInits) {
                if (idInit.constantInitializer() != null) {
                    String t = exprProc.inferTypeFromConstantInitializer(idInit.constantInitializer());
                    if (t != null) {
                        inferredType = t;
                    }
                }
            }
            type = inferredType;
        } else if (type == null) {
            type = "Object";
        }


        for (JhpParser.IdentifierInitializerContext idInit : idInits) {
            String constName = idInit.identifier().getText();
            String init = "";
            if (idInit.constantInitializer() != null) {
                String initCode = exprProc.generateConstantInitializer(idInit.constantInitializer(), indentLevel);
                init = " = " + initCode;
            }
            JhpUtils.printIndent(out, indentLevel);
            out.println("public static final " + type + " " + constName + init + ";");
        }
    }
     
    private void generateClassMethod(JhpParser.ClassStatementContext stmt,JhpParser.ClassDeclarationContext ctx) {
        // 提取修饰符（public/private/protected/static/abstract/final）
        String modifiers = JhpUtils.extractMethodModifiers(stmt.memberModifiers());
        String methodName = stmt.identifier().getText();
        boolean isInterface = ctx.Interface() != null;
        boolean isConstructor = JhpUtils.isConstructor(methodName);
        if (isConstructor) {
            methodName = varProc.getCurrentClassName();   // 需要能获取到当前类名
        }
        // 处理参数列表，并将参数注册到符号表
        List<String> paramStrs = new ArrayList<>();
        if (stmt.formalParameterList() != null) {
            for (JhpParser.FormalParameterContext param : stmt.formalParameterList().formalParameter()) {
                String paramType = "Object";
                if (param.typeHint() != null) {
                    paramType = JhpUtils.mapTypeHint(param.typeHint());
                }
                String varName = param.variableInitializer().VarName().getText().substring(1); // 去掉 $
                paramStrs.add(paramType + " " + varName);
                varProc.setVariableType(varName, paramType); 
                
            }
        }
        String params = String.join(", ", paramStrs);

        // 返回类型
        String returnType = "void";
        // System.err.println("DEBUG: Checking return type hint for method " + stmt.returnTypeDecl());
        if (stmt.returnTypeDecl() != null && stmt.returnTypeDecl().typeHint() != null) {
            // System.err.println("DEBUG: Mapping return type hint for method " + stmt.returnTypeDecl().typeHint());
            returnType = JhpUtils.mapTypeHint(stmt.returnTypeDecl().typeHint()); 
        }
        // 构造函数没有返回类型
        if(isConstructor) {
            returnType = "";
        }

        // 根据方法体类型生成代码
        JhpParser.MethodBodyContext body = stmt.methodBody();
        if (body != null) {
            if (body.SemiColon() != null) {
                // 抽象方法（无方法体）
                JhpUtils.printIndent(out, indentLevel);
                out.println(modifiers + returnType + " " + methodName + "(" + params + ");");
            } else if (body.blockStatement() != null) {
                // 如果声明了 abstract 但又有方法体，发出警告并去掉 abstract 修饰符
                if(modifiers.contains("abstract")) {
                    System.err.println("Warning: method " + methodName + " has a body but is declared abstract. Removing abstract modifier.");
                    modifiers = modifiers.replace("abstract", "");
                }

                
                // 具体方法
                JhpUtils.printIndent(out, indentLevel);
                if(isInterface){
                    System.err.println("Warning: method " + methodName + " is declared in an interface but has a body. Removing method body.");
                    out.println(modifiers + returnType + " " + methodName + "(" + params + ");");
                }else{
                    out.println(modifiers + returnType + " " + methodName + "(" + params + ") ");
                }
                indentLevel++;
                // super其实不用特殊处理，直接当成普通方法调用生成即可，因为PHP里super不是关键字
                // 处理构造器调用 baseCtorCall（仅限于构造方法）
                if (stmt.baseCtorCall() != null && isConstructor) {
                    String superArgs = JhpUtils.generateArgumentsString(stmt.baseCtorCall().arguments(), exprProc, indentLevel);
                    JhpUtils.printIndent(out, indentLevel);
                    out.println("super(" + superArgs + ");");
                }

                visit(body.blockStatement()); // 递归翻译方法体
                indentLevel--;
                // JhpUtils.printIndent(out, indentLevel);
                
            }
        }
        if (!isConstructor) {
            varProc.setFunctionReturnType( methodName, returnType);
        }
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

    private void clazzProcess(JhpParser.PhpFileContext ctx) {
        // 找出唯一的 classDeclaration
        JhpParser.ClassDeclarationContext classCtx = null;
        for (ParseTree child : ctx.children) {
            if (child instanceof JhpParser.TopStatementContext topCtx) {
                // System.err.println("DEBUG: Visiting top-level statement with text: " + topCtx.getText());
                // System.err.println("DEBUG: Contains namespace declaration? " + (topCtx.namespaceDeclaration() != null));
                if (topCtx.classDeclaration() != null) {
                    if (classCtx != null) {
                        System.err.println("Error: mode 3 expects exactly one class in the file");
                        return;
                    }
                    classCtx = topCtx.classDeclaration();
                }
            }
        }
        if (classCtx == null) {
            System.err.println("Error: mode 3 requires a class definition");
            return;
        }

        visit(classCtx);
    }

}