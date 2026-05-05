package compiler;

import jhp.parser.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VariableProcessor {

    private final PrintWriter out;
    private ExpressionProcessor exprProc;
    // 符号表：变量名 -> 类型
    private final Map<String, String> varTypes = new HashMap<>();
    // 临时存储当前待处理的属性（用于下一个语句）
    private List<JhpParser.AttributeGroupContext> currentAttributes = new ArrayList<>();

    public VariableProcessor(PrintWriter out) {
        this.out = out;
    }

    public void setExprProcessor(ExpressionProcessor exprProc) {
        this.exprProc = exprProc;
    }
    // ---------- 供 JhpVisitor 调用的公共接口 ----------

    public void setCurrentAttributes(List<JhpParser.AttributeGroupContext> attrs) {
        currentAttributes.clear();
        currentAttributes.addAll(attrs);
    }

    /**
     * 获取表达式的代码表示（用于 echo 等场景）
     */
    public String getExpressionCode(JhpParser.ExpressionContext ctx) {
        if (ctx instanceof JhpParser.ChainExpressionContext) {
            return JhpUtils.getVarNameFromChain(((JhpParser.ChainExpressionContext) ctx).chain());
        }
        return ctx.getText();
    }

    /**
     * 处理赋值语句，生成 Java 声明或赋值代码
     */

    public void handleAssignment(JhpParser.AssignmentExpressionContext ctx, int indentLevel) {
        String leftVar = getAssignableVarName(ctx.assignable());
        JhpParser.ExpressionContext rightExpr = ctx.expression();
        String assignOp = ctx.assignmentOperator().getText();

        System.err.println("DEBUG: Assignment operator is '" + assignOp + "'");

        if (assignOp.equals("=")) {
            handleSimpleAssignment(leftVar, rightExpr, indentLevel);
        } else {
            handleCompoundAssignment(leftVar, assignOp, rightExpr, indentLevel);
        }
    }
    public void handleSimpleAssignment(String leftVar, JhpParser.ExpressionContext rightExpr, int indentLevel) {

        // 优先从属性中获取类型
        String explicitType = null;
        if (!currentAttributes.isEmpty()) {
            explicitType = extractTypeFromAttributes(currentAttributes);
            currentAttributes.clear();
        }

        String rightType = (explicitType != null) ? explicitType : exprProc.inferTypeFromExpression(rightExpr);
        System.err.println("DEBUG: inferred type for " + rightExpr.getText() + " is " + rightType);
        String rightCode = exprProc.generateExpression(rightExpr, indentLevel);

        if (!varTypes.containsKey(leftVar)) {
            // 首次声明
            varTypes.put(leftVar, rightType);
            JhpUtils.printIndent(this.out, indentLevel);
            out.printf("%s %s = %s;%n", rightType, leftVar, rightCode);
        } else {
            String declaredType = varTypes.get(leftVar);
            if (declaredType.equals(rightType) || (declaredType.equals("Double") && rightType.equals("Integer"))) {
                JhpUtils.printIndent(out, indentLevel);
                out.printf("%s = %s;%n", leftVar, rightCode);
            } else {
                System.err.println("Warning: type mismatch...");
                JhpUtils.printIndent(out, indentLevel);
                out.printf("%s = (%s) %s;%n", leftVar, declaredType, rightCode);
            }
        }
    }

    private void handleCompoundAssignment(String leftVar, String assignOp, JhpParser.ExpressionContext rightExpr, int indentLevel) {
        
        if (!varTypes.containsKey(leftVar)) {
            System.err.println("Error: variable " + leftVar + " is not declared, cannot use " + assignOp);
            return;
        }

        String baseOp = assignOp.substring(0, assignOp.length() - 1);
        
        String javaOp;
        if (baseOp.equals(".")) {
            javaOp = "+";
        } else {
            javaOp = baseOp;
        }

        String rightCode = exprProc.generateExpression(rightExpr, indentLevel);
        
        JhpUtils.printIndent(out, indentLevel);
        out.printf("%s %s= %s;%n", leftVar, javaOp, rightCode);
    }

    // ---------- 以下为私有辅助方法 ----------

    private String getAssignableVarName(JhpParser.AssignableContext ctx) {
        if (ctx.chain() != null) {
            return JhpUtils.getVarNameFromChain(ctx.chain());
        }
        return ctx.getText().replace("$", "");
    }

    private String extractTypeFromAttributes(List<JhpParser.AttributeGroupContext> attrs) {
        for (JhpParser.AttributeGroupContext group : attrs) {
            for (JhpParser.AttributeContext attr : group.attribute()) {
                System.err.println("DEBUG: attribute = " + attr.getText());
                String name = attr.qualifiedNamespaceName().getText();
                System.err.println("DEBUG: attribute name = " + name);
                if (name.equals("Type") || name.equals("\\Type")) {
                    JhpParser.ArgumentsContext args = attr.arguments();
                    if (args != null && args.actualArgument().size() > 0) {
                        String typeArg = args.actualArgument(0).expression().getText();
                        System.err.println("DEBUG: typeArg = " + typeArg);
                        if (typeArg.startsWith("\"") || typeArg.startsWith("'")) {
                            typeArg = typeArg.substring(1, typeArg.length() - 1);
                        }
                        return JhpUtils.mapJhpTypeToJavaType(typeArg);
                    }
                }
            }
        }
        return null;
    }

    public String getVariableType(String varName) { 
        return varTypes.getOrDefault(varName, "Object");
    }

    public void setVariableType(String varName, String varType) {
        varTypes.put(varName, varType);
    }
    public boolean isVariableDeclared(String varName) {
        return varTypes.containsKey(varName);
    }

}