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

    public String generateLogicalAnd(JhpParser.LogicalAndExpressionContext ctx, int indentLevel) {
        return generateLogicalExpression(
            ctx.expression(0), 
            ctx.expression(1), 
            ctx.op.getText(),
            indentLevel
        );
    }

    public String generateLogicalOr(JhpParser.LogicalIncOrExpressionContext ctx, int indentLevel) { 
        return generateLogicalExpression(
            ctx.expression(0), 
            ctx.expression(1), 
            ctx.op.getText(),
            indentLevel
        );
    }

    public String generateLogicalXor(JhpParser.LogicalExcOrExpressionContext ctx, int indentLevel) { 
        return generateLogicalExpression(
            ctx.expression(0), 
            ctx.expression(1), 
            ctx.op.getText(),
            indentLevel
        );
    }

    private String generateLogicalExpression(
        JhpParser.ExpressionContext leftCtx,
        JhpParser.ExpressionContext rightCtx,
        String op,
        int indentLevel
    ) {
        String left = exprProc.generateExpression(leftCtx, indentLevel);
        String right = exprProc.generateExpression(rightCtx, indentLevel);

        // 操作符映射
        if (op.equals("and")) {
            op = "&&";
        } else if (op.equals("or")) {
            op = "||";
        } else if (op.equals("xor")) {
            op = "^";
        }

        return applyParentheses(left, right, op, leftCtx, rightCtx);
    }

    public String generateBitwiseAnd(JhpParser.BitwiseAndExpressionContext ctx, int indentLevel) { 
        return generateLogicalExpression(
            ctx.expression(0), 
            ctx.expression(1), 
            "&",
            indentLevel
        );
    }

    public String generateBitwiseOr(JhpParser.BitwiseIncOrExpressionContext ctx, int indentLevel) { 
        return generateLogicalExpression(
            ctx.expression(0), 
            ctx.expression(1), 
            "|",
            indentLevel
        );
    }

    public String generateBitwiseXor(JhpParser.BitwiseExcOrExpressionContext ctx, int indentLevel) { 
        return generateLogicalExpression(
            ctx.expression(0), 
            ctx.expression(1), 
            "^",
            indentLevel
        );
    }

    public String generateCoalescing(JhpParser.CoalesceExpressionContext ctx, int indentLevel) { 
        String left = exprProc.generateExpression(ctx.expression(0), indentLevel);
        String right = exprProc.generateExpression(ctx.expression(1), indentLevel);
        String op = ctx.op.getText();   // ?? 表达式 在 Java 中没有直接对应的运算符，需要转换为三元表达式
        // 转换为 Java 的三元表达式：left != null ? left : right

        String leftPart = JhpUtils.needsParentheses(ctx.expression(0)) ? "(" + left + ")" : left;
        String rightPart = JhpUtils.needsParentheses(ctx.expression(1)) ? "(" + right + ")" : right;

        return leftPart + " != null ? " + leftPart + " : " + rightPart;
    }

    public String generateSpaceship(JhpParser.SpaceshipExpressionContext ctx, int indentLevel) { 
        String left = exprProc.generateExpression(ctx.expression(0), indentLevel);
        String right = exprProc.generateExpression(ctx.expression(1), indentLevel);
        String op = ctx.op.getText();   // <=> 表达式 在 Java 中没有直接对应的运算符，需要转换为比较逻辑
        // 转换为 Java 的比较逻辑：Integer.compare(left, right)
        String leftType = exprProc.inferTypeFromExpression(ctx.expression(0));
        String rightType = exprProc.inferTypeFromExpression(ctx.expression(1));

        if(!leftType.equals(rightType)){
            //先做简单处理，理论上Double和Integer之间可以比较，其他类型不兼容则警告
            if(leftType.equals("Double") && rightType.equals("Integer")){
                rightType = "Double"; // 将 Integer 升级为 Double 以进行比较
                right ="Double.valueOf("+right+")";
            } else if(leftType.equals("Integer") && rightType.equals("Double")){
                leftType = "Double"; // 将 Integer 升级为 Double 以进行比较
                left = "Double.valueOf(" + left + ")";
            }else{
                System.err.println("Warning: Spaceship operator used on different types: " + leftType + " and " + rightType);
                return "-99"; // 返回一个特殊值，表示类型不兼容，实际使用中可能需要更复杂的处理
            }
        }
        left = "(("+leftType + ")" + left + ")";
        right = "("+rightType + ")" + right ;

        String leftPart = JhpUtils.needsParentheses(ctx.expression(0)) ? "(" + left + ")" : left;
        String rightPart = JhpUtils.needsParentheses(ctx.expression(1)) ? "(" + right + ")" : right;
        
        return leftPart+".compareTo(" + rightPart + ")";
    }

    public String generateExponential(JhpParser.ExponentiationExpressionContext ctx, int indentLevel) {
        String left = exprProc.generateExpression(ctx.expression(0), indentLevel);
        String right = exprProc.generateExpression(ctx.expression(1), indentLevel);
        // PHP 的指数运算符 '**' 在 Java 中没有直接对应的运算符，需要转换为 Math.pow() 方法调用
        String leftPart = JhpUtils.needsParentheses(ctx.expression(0)) ? "(" + left + ")" : left;
        String rightPart = JhpUtils.needsParentheses(ctx.expression(1)) ? "(" + right + ")" : right;
        return "Math.pow(" + leftPart + ", " + rightPart + ")";
    }

    public String generateConditionalExpression(JhpParser.ConditionalExpressionContext ctx, int indentLevel) {
        String condition = exprProc.generateExpression(ctx.expression(0), indentLevel);
        String truePart = exprProc.generateExpression(ctx.expression(1), indentLevel);
        String falsePart = exprProc.generateExpression(ctx.expression(2), indentLevel);
        // PHP 的三元表达式在 Java 中直接对应为三元表达式
        String conditionPart = JhpUtils.needsParentheses(ctx.expression(0)) ? "(" + condition + ")" : condition;
        String truePartFormatted = JhpUtils.needsParentheses(ctx.expression(1)) ? "(" + truePart + ")" : truePart;
        String falsePartFormatted = JhpUtils.needsParentheses(ctx.expression(2)) ? "(" + falsePart + ")" : falsePart;
        return conditionPart + " ? " + truePartFormatted + " : " + falsePartFormatted;
    }

    public String generateInstanceOf(JhpParser.InstanceOfExpressionContext ctx, int indentLevel) {
        String left = exprProc.generateExpression(ctx.expression(), indentLevel);
        String right = JhpUtils.mapTypeRefToJava(ctx.typeRef());
        return left + " instanceof " + right;
    }


    private String applyParentheses(String left, String right, String op,
                                    JhpParser.ExpressionContext leftCtx, JhpParser.ExpressionContext rightCtx) {
        String leftPart = JhpUtils.needsParentheses(leftCtx) ? "(" + left + ")" : left;
        String rightPart = JhpUtils.needsParentheses(rightCtx) ? "(" + right + ")" : right;
        return leftPart + " " + op + " " + rightPart;
    }

}
