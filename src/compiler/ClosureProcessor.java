package compiler;

import jhp.parser.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.*;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ClosureProcessor {
    private final VariableProcessor varProc;
    private final ExpressionProcessor exprProc;
    private final PrintWriter out;
    private int indentLevel = 0;
    private final JhpVisitor visitor;
    public ClosureProcessor(VariableProcessor varProc,
                            ExpressionProcessor exprProc,
                            JhpVisitor visitor,
                            PrintWriter out,
                            int indentLevel) {
        this.varProc = varProc;
        this.exprProc = exprProc;
        this.visitor = visitor;
        this.out = out;
        this.indentLevel = indentLevel;
    }


    public void handleMultiLineClosureAssign(JhpParser.AssignmentExpressionContext assignCtx,
                                             JhpParser.LambdaFunctionExpressionContext lambdaCtx) {
        JhpParser.LambdaFunctionExprContext lambda = lambdaCtx.lambdaFunctionExpr();
        String leftVar = JhpUtils.getAssignableVarName(assignCtx.assignable());

        // 参数列表
        List<String> paramStrs = new ArrayList<>();
        for (JhpParser.FormalParameterContext p : lambda.formalParameterList().formalParameter()) {
            String paramType = "Object";
            if (p.typeHint() != null) paramType = JhpUtils.mapTypeHint(p.typeHint());
            String paramName = p.variableInitializer().VarName().getText().substring(1);
            paramStrs.add(paramType + " " + paramName);
            varProc.setVariableType(paramName, paramType);
        }
        String paramsStr = String.join(", ", paramStrs);

        // 返回类型
        String returnType = JhpUtils.mapTypeHint(lambda.typeHint());

        // 目标接口（优先从 #[Type] 获取）
        String targetInterface = determineTargetInterface(returnType, paramStrs);
        if (targetInterface == null) {
            exprProc.fatalError("Multi-line closure must specify #[Type] or use Runnable/Function like interface.");
            return;
        }

        // 输出匿名内部类
        if (!varProc.isVariableDeclared(leftVar)) {
            varProc.setVariableType(leftVar, targetInterface);
            JhpUtils.printIndent(out, indentLevel);
            out.printf("%s %s = new %s() {%n", targetInterface, leftVar, targetInterface);
        } else {
            JhpUtils.printIndent(out, indentLevel);
            out.printf("%s = new %s() {%n", leftVar, targetInterface);
        }
        indentLevel++;

        // 方法签名
        String methodSig = JhpUtils.getFunctionalMethodSignature(targetInterface, returnType, paramsStr);
        JhpUtils.printIndent(out, indentLevel);
        out.println("@Override");
        JhpUtils.printIndent(out, indentLevel);
        out.println("public " + methodSig + " {");
        indentLevel++;
        visitor.visit(lambda.blockStatement());
        indentLevel--;
        JhpUtils.printIndent(out, indentLevel);
        out.println("}");

        indentLevel--;
        JhpUtils.printIndent(out, indentLevel);
        out.println("};");
    }

    private String determineTargetInterface(String returnType, List<String> paramStrs) {
        // 检查当前属性
        String explicit = varProc.extractTypeFromAttributes();
        if (explicit != null) {
            return explicit;
        }
        // 简单推断：无参且返回 void -> Runnable
        if (paramStrs.isEmpty() && "void".equals(returnType)) {
            return "Runnable";
        }
        // 若有参且不是 void，尝试 Function 但需标注（这里只返回 null 强制要求）
        return null;
    }

}
