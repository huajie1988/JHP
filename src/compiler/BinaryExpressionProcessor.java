package compiler;

import jhp.parser.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.PrintWriter;

public class BinaryExpressionProcessor {
    private final PrintWriter out;   // 仅用于可能的错误输出，不直接写主代码
    private final ExpressionProcessor exprProc;

    public BinaryExpressionProcessor(ExpressionProcessor exprProc, PrintWriter out) {
        this.exprProc = exprProc;
        this.out = out; 
    }

    public String generateAdditive(JhpParser.AdditiveExpressionContext ctx, int indentLevel) {
        // 获取左右子表达式
        String left = exprProc.generateExpression(ctx.expression(0), indentLevel);
        String right = exprProc.generateExpression(ctx.expression(1), indentLevel);
        String op = ctx.op.getText();   // '+', '-', '.'

        // 根据操作符和类型生成代码
        // 操作符映射 & 类型转换
        String javaOp;
        if (op.equals(".")) {
            // PHP 字符串连接 => Java 字符串连接，需确保转为 String
            javaOp = "+";
            // 包装为非字符串的操作数
            if (!JhpUtils.isStringExpression(ctx.expression(0),exprProc)) {
                left = "String.valueOf(" + left + ")";
            }
            if (!JhpUtils.isStringExpression(ctx.expression(1),exprProc)) {
                right = "String.valueOf(" + right + ")";
            }
        } else {
            javaOp = op; // '+' 或 '-' 直接映射
        }

        // 括号策略：原子表达式（标量、变量、括号）不加，其余加括号
        return applyParentheses(left, right, javaOp, ctx.expression(0), ctx.expression(1));

    }

    public String generateMultiplicative(JhpParser.MultiplicativeExpressionContext ctx, int indentLevel) {
        // 获取左右子表达式
        String left = exprProc.generateExpression(ctx.expression(0), indentLevel);
        String right = exprProc.generateExpression(ctx.expression(1), indentLevel);
        String op = ctx.op.getText();   // '*', '/', '%'

        // 根据操作符和类型生成代码
        // 操作符映射 & 类型转换
        // 除法保留和JAVA一致，整数相除取整，如果希望保留小数可以使用属性定义
        // 括号策略：原子表达式（标量、变量、括号）不加，其余加括号
        return applyParentheses(left, right, op, ctx.expression(0), ctx.expression(1));
    }

    public String generateShift(JhpParser.ShiftExpressionContext ctx, int indentLevel) { 
        // 获取左右子表达式
        String left = exprProc.generateExpression(ctx.expression(0), indentLevel);
        String right = exprProc.generateExpression(ctx.expression(1), indentLevel);
        String op = ctx.op.getText();   // '<<', '>>'

        // 根据操作符和类型生成代码
        return applyParentheses(left, right, op, ctx.expression(0), ctx.expression(1));
    }

    public String generateRelational(JhpParser.RelationalExpressionContext ctx, int indentLevel) { 
        // 获取左右子表达式
        String left = exprProc.generateExpression(ctx.expression(0), indentLevel);
        String right = exprProc.generateExpression(ctx.expression(1), indentLevel);
        String op = ctx.op.getText();   // '<', '>', '<=', '>='

        // 根据操作符和类型生成代码
        return applyParentheses(left, right, op, ctx.expression(0), ctx.expression(1));
    }

    public String generateEquality(JhpParser.EqualityExpressionContext ctx, int indentLevel) { 
        // 获取左右子表达式
        String left = exprProc.generateExpression(ctx.expression(0), indentLevel);
        String right = exprProc.generateExpression(ctx.expression(1), indentLevel);
        String op = ctx.op.getText();   // '==', '!=' ,'===', '!==',php 中 '===' 和 '!==' 是全等和不全等，Java 中没有直接对应的运算符，需要转换为 equals() 方法调用

        // 根据操作符和类型生成代码
        String leftPart = JhpUtils.needsParentheses(ctx.expression(0)) ? "(" + left + ")" : left;
        String rightPart = JhpUtils.needsParentheses(ctx.expression(1)) ? "(" + right + ")" : right;
        System.out.println("Debug: Generating equality expression with operator " + leftPart + " " + op+ " " + rightPart);
        if (op.equals("===")) {
            // 全等或不全等 => equals() 方法调用
            leftPart = leftPart + ".equals(" + rightPart + ")";
            rightPart = "";
            op = "";
        }else if (op.equals("!==")) {
            leftPart = "!" + leftPart + ".equals(" + rightPart + ")";
            rightPart = "";
            op = "";
        }
        return leftPart + " " + op + " " + rightPart;
    }

    // 赋值运算符（+=, .=, ??= 等）展开
    public String generateAssignment(JhpParser.AssignmentExpressionContext ctx, int indent) {
        String assignOp = ctx.assignmentOperator().getText();
        System.out.println("Debug: Generating assignment expression with operator " + assignOp);
        if (assignOp.equals("=")) {
            // 简单赋值不应该在这里处理，而是由 VariableProcessor 调用生成右侧即可
            // 如果走到这里，说明是作为表达式的一部分，如 $a = $b = 5; 这是 PHP 特性，暂不支持
            // 简单返回右侧代码
            return exprProc.generateExpression(ctx.expression(), indent);
        }
        // 复合赋值：a += b  -> a = a + b
        String leftVar = JhpUtils.getAssignableVarName(ctx.assignable());
        String right = exprProc.generateExpression(ctx.expression(), indent);
        String baseOp = assignOp.substring(0, assignOp.length()-1); // 去掉 '='
        if (baseOp.equals(".")) baseOp = "+";
        // 需要括号保护
        String leftCode = leftVar; // 变量名，不需要括号
        if (JhpUtils.needsParentheses(ctx.expression())) right = "(" + right + ")";
        return leftVar + " " + assignOp + " " + right; // 暂时保持复合赋值，让 Java 处理
        // 或者展开为 left = left op right，但 Java 本身支持 +=，可直接保留。
        // 但如果原操作符是 '.' 则需要映射为 += 并确保字符串转换，在 VariableProcessor 调用时已处理类型。
        // 这里仅作代码生成，不再重复类型转换逻辑，交给 VariableProcessor 或预处理。
        // 为简单，暂时直接返回复合赋值形式，Java 能识别 +=、-= 等。
    }

    private String applyParentheses(String left, String right, String op,
                                    JhpParser.ExpressionContext leftCtx, JhpParser.ExpressionContext rightCtx) {
        String leftPart = JhpUtils.needsParentheses(leftCtx) ? "(" + left + ")" : left;
        String rightPart = JhpUtils.needsParentheses(rightCtx) ? "(" + right + ")" : right;
        return leftPart + " " + op + " " + rightPart;
    }

}
