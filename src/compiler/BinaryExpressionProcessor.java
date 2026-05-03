package compiler;

import jhp.parser.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.PrintWriter;

public class BinaryExpressionProcessor {
    private final PrintWriter out;   // 仅用于可能的错误输出，不直接写主代码
    // 可能需要依赖 VariableProcessor 的 getExpressionCode 或类型查询
    private final VariableProcessor variableProcessor;

    public BinaryExpressionProcessor(VariableProcessor varProc, PrintWriter out) {
        this.variableProcessor = varProc;
        this.out = out; 
    }

    public String generateExpression(JhpParser.ExpressionContext ctx, int indentLevel) {
        // 加法/字符串连接
        if (ctx instanceof JhpParser.AdditiveExpressionContext) {
            return generateAdditive((JhpParser.AdditiveExpressionContext) ctx, indentLevel);
        }
        // 乘除取模
        if (ctx instanceof JhpParser.MultiplicativeExpressionContext) {
            return generateMultiplicative((JhpParser.MultiplicativeExpressionContext) ctx, indentLevel);
        }

        if (ctx instanceof JhpParser.ShiftExpressionContext) {
            // 赋值表达式不直接生成代码，而是交给 VariableProcessor 处理
            // 这里返回一个占位符，实际代码在 VariableProcessor 中生成
            return generateShift((JhpParser.ShiftExpressionContext) ctx, indentLevel);
         }

         if (ctx instanceof JhpParser.RelationalExpressionContext) {
            // 赋值表达式不直接生成代码，而是交给 VariableProcessor 处理
            // 这里返回一个占位符，实际代码在 VariableProcessor 中生成
            return generateRelational((JhpParser.RelationalExpressionContext) ctx, indentLevel);
        }

        if (ctx instanceof JhpParser.EqualityExpressionContext) {
            // 赋值表达式不直接生成代码，而是交给 VariableProcessor 处理
            // 这里返回一个占位符，实际代码在 VariableProcessor 中生成
            return generateEquality((JhpParser.EqualityExpressionContext) ctx, indentLevel);
        }

        // 其他二元运算符留待扩展...


        // 一元/原子表达式
        if (ctx instanceof JhpParser.CastExpressionContext) {
            return generateCast((JhpParser.CastExpressionContext) ctx, indentLevel);
        }

        if (ctx instanceof JhpParser.ChainExpressionContext) {
            return variableProcessor.getVarNameFromChain(((JhpParser.ChainExpressionContext) ctx).chain());
        }

        if (ctx instanceof JhpParser.ScalarExpressionContext) {
            return generateScalar((JhpParser.ScalarExpressionContext) ctx);
        }

        // 括号表达式
        if (ctx instanceof JhpParser.ParenthesisExpressionContext) {
            JhpParser.ParenthesesContext parens = ((JhpParser.ParenthesisExpressionContext) ctx).parentheses();
            JhpParser.ExpressionContext innerExpr = parens.expression();
            if (innerExpr != null) {
                return "(" + generateExpression(innerExpr, indentLevel) + ")";
            } else {
                // yieldExpression 的情形暂不处理，直接返回原始文本
                return parens.getText();
            }
        }
        // 其他暂时未实现的，返回原始文本（仅调试用）
        System.err.println("Unsupported expression type: " + ctx.getClass().getSimpleName());
        return ctx.getText();  // fallback，后期替换
    }

        /** 判断表达式是否为字符串类型（可用于决定是否需要强制转换） */
    private boolean isStringExpression(JhpParser.ExpressionContext ctx) {
        // 简单实现：标量中的字符串、string() 存在，或者类型推断为 String
        if (ctx instanceof JhpParser.ScalarExpressionContext) {
            JhpParser.ScalarExpressionContext scalar = (JhpParser.ScalarExpressionContext) ctx;
            if (scalar.string() != null) return true;
        }
        // 可借助 VariableProcessor 的类型推断
        String type = variableProcessor.inferTypeFromExpression(ctx);
        return "String".equals(type);
    }

    /** 判断子表达式是否需要加括号（防止优先级错乱） */
    private boolean needsParentheses(JhpParser.ExpressionContext ctx) {
        // 原子表达式：标量、链、括号、数组字面量等不加括号
        return !(ctx instanceof JhpParser.ScalarExpressionContext ||
                 ctx instanceof JhpParser.ChainExpressionContext ||
                 ctx instanceof JhpParser.ParenthesisExpressionContext ||
                 ctx instanceof JhpParser.ArrayCreationExpressionContext);
    }

    private String generateScalar(JhpParser.ScalarExpressionContext ctx) {
        // 常量 / 字符串 / Label 等直接返回文本
        return ctx.getText();
    }

    private String generateAdditive(JhpParser.AdditiveExpressionContext ctx, int indentLevel) {
        // 获取左右子表达式
        String left = generateExpression(ctx.expression(0), indentLevel);
        String right = generateExpression(ctx.expression(1), indentLevel);
        String op = ctx.op.getText();   // '+', '-', '.'

        // 根据操作符和类型生成代码
        // 操作符映射 & 类型转换
        String javaOp;
        if (op.equals(".")) {
            // PHP 字符串连接 => Java 字符串连接，需确保转为 String
            javaOp = "+";
            // 包装为非字符串的操作数
            if (!isStringExpression(ctx.expression(0))) {
                left = "String.valueOf(" + left + ")";
            }
            if (!isStringExpression(ctx.expression(1))) {
                right = "String.valueOf(" + right + ")";
            }
        } else {
            javaOp = op; // '+' 或 '-' 直接映射
        }

        // 括号策略：原子表达式（标量、变量、括号）不加，其余加括号
        String leftPart = needsParentheses(ctx.expression(0)) ? "(" + left + ")" : left;
        String rightPart = needsParentheses(ctx.expression(1)) ? "(" + right + ")" : right;

        return leftPart + " " + javaOp + " " + rightPart;

    }

    private String generateMultiplicative(JhpParser.MultiplicativeExpressionContext ctx, int indentLevel) {
        // 获取左右子表达式
        String left = generateExpression(ctx.expression(0), indentLevel);
        String right = generateExpression(ctx.expression(1), indentLevel);
        String op = ctx.op.getText();   // '*', '/', '%'

        // 根据操作符和类型生成代码
        // 操作符映射 & 类型转换
        // 除法保留和JAVA一致，整数相除取整，如果希望保留小数可以使用属性定义
        // 括号策略：原子表达式（标量、变量、括号）不加，其余加括号
        String leftPart = needsParentheses(ctx.expression(0)) ? "(" + left + ")" : left;
        String rightPart = needsParentheses(ctx.expression(1)) ? "(" + right + ")" : right;
        return leftPart + " " + op + " " + rightPart;
    }

    private String generateCast(JhpParser.CastExpressionContext ctx, int indentLevel) {
        String castType = ctx.castOperation().getText();
        String javaType = variableProcessor.mapJhpTypeToJavaType(castType);
        JhpParser.ExpressionContext innerExpr = ctx.expression();
        String innerCode = generateExpression(innerExpr, indentLevel);
        
        return "((" + javaType + ") " + innerCode + ")";
    }

    private String generateShift(JhpParser.ShiftExpressionContext ctx, int indentLevel) { 
        // 获取左右子表达式
        String left = generateExpression(ctx.expression(0), indentLevel);
        String right = generateExpression(ctx.expression(1), indentLevel);
        String op = ctx.op.getText();   // '<<', '>>'

        // 根据操作符和类型生成代码
        String leftPart = needsParentheses(ctx.expression(0)) ? "(" + left + ")" : left;
        String rightPart = needsParentheses(ctx.expression(1)) ? "(" + right + ")" : right;
        return leftPart + " " + op + " " + rightPart;
    }

    private String generateRelational(JhpParser.RelationalExpressionContext ctx, int indentLevel) { 
        // 获取左右子表达式
        String left = generateExpression(ctx.expression(0), indentLevel);
        String right = generateExpression(ctx.expression(1), indentLevel);
        String op = ctx.op.getText();   // '<', '>', '<=', '>='

        // 根据操作符和类型生成代码
        String leftPart = needsParentheses(ctx.expression(0)) ? "(" + left + ")" : left;
        String rightPart = needsParentheses(ctx.expression(1)) ? "(" + right + ")" : right;
        return leftPart + " " + op + " " + rightPart;
    }

    private String generateEquality(JhpParser.EqualityExpressionContext ctx, int indentLevel) { 
        // 获取左右子表达式
        String left = generateExpression(ctx.expression(0), indentLevel);
        String right = generateExpression(ctx.expression(1), indentLevel);
        String op = ctx.op.getText();   // '==', '!=' ,'===', '!==',php 中 '===' 和 '!==' 是全等和不全等，Java 中没有直接对应的运算符，需要转换为 equals() 方法调用

        // 根据操作符和类型生成代码
        String leftPart = needsParentheses(ctx.expression(0)) ? "(" + left + ")" : left;
        String rightPart = needsParentheses(ctx.expression(1)) ? "(" + right + ")" : right;
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

}
