package compiler;

import jhp.parser.JhpParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class EnumProcessor {
    private ExpressionProcessor exprProc;
    private VariableProcessor varProc;
    private PrintWriter out;
    private int indent;
    private final JhpVisitor visitor;

    public EnumProcessor(VariableProcessor varProc, ExpressionProcessor exprProc,JhpVisitor visitor, PrintWriter out) {
        this.varProc = varProc;
        this.exprProc = exprProc;
        this.out = out;
        this.visitor = visitor;
        varProc.setExprProcessor(exprProc);
    }

    public Void process(JhpParser.EnumDeclarationContext ctx,int indentLevel) {
        this.indent = indentLevel;
        // 1. 提取枚举名
        String enumName = ctx.name.getText();

        if (ctx.attributes() != null) {
            // 属性声明
            JhpUtils.generateClassAttribute(ctx.attributes(), out, indent);
        }

        // 2. 提取值类型列表
        List<String> paramTypes = new ArrayList<>();
        if (ctx.Colon() != null) {
            for (JhpParser.TypeHintContext th : ctx.typeHint()) {
                paramTypes.add(JhpUtils.mapTypeHint(th));
            }
        }

        // 3. 提取字段名列表（如果存在）
        List<String> fieldNames = new ArrayList<>();
        if (ctx.OpenRoundBracket() != null && ctx.fieldNames != null) {
            for (JhpParser.IdentifierContext idCtx : ctx.fieldNames) {
                fieldNames.add(idCtx.getText());
            }
        }
        int paramCount = paramTypes.size();
        // 如果字段名个数与类型个数不一致，则退化为默认 value1..valueN
        if (fieldNames.size() != paramCount) {
            fieldNames.clear();
            for (int i = 0; i < paramCount; i++) {
                fieldNames.add("value" + (i + 1));
            }
        }

        // 4. 实现接口列表
        String implementsClause = "";
        if (ctx.Implements() != null && ctx.interfaceList() != null) {
            List<String> ifaces = new ArrayList<>();
            for (JhpParser.QualifiedStaticTypeRefContext iface : ctx.interfaceList().qualifiedStaticTypeRef()) {
                ifaces.add(JhpUtils.phpPackageToJavaPackage(iface.getText()));
            }
            implementsClause = " implements " + String.join(", ", ifaces);
        }

        // 5. 输出枚举头
        JhpUtils.printIndent(out, indent);
        out.println("public enum " + enumName + implementsClause + " {");
        indent++;

        // 6. 遍历枚举项
        List<JhpParser.EnumItemContext> items = ctx.enumItem();
        boolean hasValues = false;
        for (JhpParser.EnumItemContext item : items) {
            if (item.Case() != null) {
                // 枚举常量
                String caseName = item.identifier().getText();
                List<JhpParser.ExpressionContext> exprs = item.expression();
                if (exprs != null && !exprs.isEmpty()) {
                    hasValues = true;
                    List<String> args = new ArrayList<>();
                    for (JhpParser.ExpressionContext expr : exprs) {
                        args.add(exprProc.generateExpression(expr, indent));
                    }
                    JhpUtils.printIndent(out, indent);
                    out.println(caseName + "(" + String.join(", ", args) + "),");
                } else {
                    // 无值常量
                    JhpUtils.printIndent(out, indent);
                    out.println(caseName + ",");
                }
            }
        }

        // 7. 生成字段、构造函数和 getter
        if (hasValues && !paramTypes.isEmpty()) {
            JhpUtils.printIndent(out, indent);
            out.println(";");
            // 字段
            for (int i = 0; i < paramCount; i++) {
                JhpUtils.printIndent(out, indent);
                out.println("private final " + paramTypes.get(i) + " " + fieldNames.get(i) + ";");
            }
            // 构造函数
            StringBuilder params = new StringBuilder();
            for (int i = 0; i < paramCount; i++) {
                if (i > 0) params.append(", ");
                params.append(paramTypes.get(i)).append(" ").append(fieldNames.get(i));
            }
            JhpUtils.printIndent(out, indent);
            out.println(enumName + "(" + params.toString() + ") {");
            indent++;
            for (int i = 0; i < paramCount; i++) {
                JhpUtils.printIndent(out, indent);
                out.println("this." + fieldNames.get(i) + " = " + fieldNames.get(i) + ";");
            }
            indent--;
            JhpUtils.printIndent(out, indent);
            out.println("}");
            // getter 方法
            for (int i = 0; i < paramCount; i++) {
                String getter = "get" + fieldNames.get(i).substring(0, 1).toUpperCase() + fieldNames.get(i).substring(1);
                //正常是没有setter方法的，所以这里先不生成
                //String setter = "set" + fieldNames.get(i).substring(0, 1).toUpperCase() + fieldNames.get(i).substring(1);
                JhpUtils.printIndent(out, indent);
                // getter 方法
                out.println("public " + paramTypes.get(i) + " " + getter + "() { return " + fieldNames.get(i) + "; }");
                //JhpUtils.printIndent(out, indent);
                //// setter 方法
                //out.println("public " + "void " + setter + "( " + paramTypes.get(i) + " " + fieldNames.get(i) + ") { this." + fieldNames.get(i) + " = " + fieldNames.get(i) + "; }");
            }
        } else {
            JhpUtils.printIndent(out, indent);
            out.println(";");
        }

        // 8. 预留方法区域
        JhpUtils.printIndent(out, indent);
        // 翻译类成员
        for (JhpParser.EnumItemContext item : ctx.enumItem()) {
            translateEnumItem(item, ctx);
        }

        indent--;
        JhpUtils.printIndent(out, indent);
        out.println("}");
        return null;
    }

    private void translateEnumItem(JhpParser.EnumItemContext item,JhpParser.EnumDeclarationContext ctx) {

        // 函数声明
        if (item.functionDeclaration() != null) {
            generateEnumMethod(item, ctx);
            return;
        }
    }

    private void generateEnumMethod(JhpParser.EnumItemContext item, JhpParser.EnumDeclarationContext ctx) {
        String enumName = ctx.name.getText();
        JhpParser.FunctionDeclarationContext func = item.functionDeclaration();
        if (func == null) return;

        // 提取方法泛型参数
        List<String> methodTypeParams = new ArrayList<>();
        String genericString = "";
        if (item.functionDeclaration().typeParameterListInBrackets() != null) {
            JhpParser.FunctionDeclarationContext stmt = item.functionDeclaration();
            genericString = JhpUtils.applyMethodTypeParameters(stmt.typeParameterListInBrackets(), varProc);
            // 记录引入的参数，用于离开时恢复
            if (stmt.typeParameterListInBrackets().typeParameterList() != null) {
                for (JhpParser.TypeParameterDeclContext decl :
                        stmt.typeParameterListInBrackets().typeParameterList().typeParameterDecl()) {
                    methodTypeParams.add(decl.identifier().getText());
                }
            }
        }

        // 提取修饰符
        String modifiers = JhpUtils.extractMethodModifiers(item.memberModifiers());
        String methodName = func.identifier().getText();
        boolean isConstructor = JhpUtils.isConstructor(methodName);
        if (isConstructor) {
            System.err.println("Warning: enum constructor " + methodName + " is not supported, skipping.");
            return;
        }

        if (item.functionDeclaration().attributes() != null) {
            // 属性声明
            JhpUtils.generateClassAttribute(item.functionDeclaration().attributes(), out, indent);
        }

        // 处理参数列表
        List<String> paramStrs = new ArrayList<>();
        if (func.formalParameterList() != null) {
            for (JhpParser.FormalParameterContext param : func.formalParameterList().formalParameter()) {
                String paramType = "Object";
                String annotation = JhpUtils.generateParameterAnnotations(param);
                Boolean isVarArg = param.Ellipsis() != null;
                if (param.typeHint() != null) {
                    paramType = JhpUtils.mapTypeHint(param.typeHint());
                }
                paramType = paramType + (isVarArg ? "..." : "");
                String varName = param.variableInitializer().VarName().getText().substring(1);
                paramStrs.add(annotation + " " + paramType + " " + varName);
                varProc.setVariableType(varName, paramType);
            }
        }
        String params = String.join(", ", paramStrs);

        // 返回类型
        String returnType = "void";
        if (func.typeHint() != null) {
            returnType = JhpUtils.mapTypeHint(func.typeHint());
        }

        // 方法体
        JhpParser.BlockStatementContext block = func.blockStatement();
        if (block == null) {
            System.err.println("Warning: enum method '" + methodName + "' has no body, skipping.");
            return;
        }

        // 输出方法签名
        JhpUtils.printIndent(out, indent);
        out.println(modifiers + genericString + " " + returnType + " " + methodName + "(" + params + ")");
        indent++;

        // 静态上下文
        boolean isStaticMethod = modifiers.contains("static");
        if (isStaticMethod) {
            exprProc.setStaticContext(true);
        }

        visitor.visit(block);

        if (isStaticMethod) {
            exprProc.setStaticContext(false);
        }

        // 恢复作用域
        if (!methodTypeParams.isEmpty()) {
            JhpUtils.restoreMethodTypeParameters(methodTypeParams, varProc);
        }

        indent--;
        JhpUtils.printIndent(out, indent);

        // 注册返回类型
        varProc.setFunctionReturnType(methodName, returnType);
    }

}
