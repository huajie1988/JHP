package compiler;

import jhp.parser.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.PrintWriter;

public class UnaryExpressionProcessor {
    private final ExpressionProcessor exprProc;
    private final PrintWriter out;


    public UnaryExpressionProcessor(ExpressionProcessor exprProc, PrintWriter out) {
        this.exprProc = exprProc;
        this.out = out;
    }
    public String generateCast(JhpParser.CastExpressionContext ctx, int indent) {
        String castType = ctx.castOperation().getText();
        String javaType;
        if (ctx.castOperation().qualifiedStaticTypeRef() != null) {
            javaType = JhpUtils.qualifiedStaticTypeRefToJava(ctx.castOperation().qualifiedStaticTypeRef());
        } else {
            javaType = JhpUtils.mapJhpTypeToJavaType(castType);
        }
        String inner = exprProc.generateExpression(ctx.expression(), indent);
        return "((" + javaType + ") " + inner + ")";
    }

    public String generateUnaryOp(JhpParser.UnaryOperatorExpressionContext ctx, int indent) {
        // 操作符可能是 '!' '+' '-' '~' '@' 等，需要根据实际语法分支选取操作符文本
        String op = ctx.getChild(0).getText();
        String inner = exprProc.generateExpression(ctx.expression(), indent);
        if (op.equals("@")) {
            return inner; // PHP 错误抑制符，Java 忽略
        }
        return op + inner;
    }

    public String generatePrefixIncDec(JhpParser.PrefixIncDecExpressionContext ctx, int indent) {
        String op = ctx.getChild(0).getText();   // 第一个孩子是 '++' 或 '--'
        String operand = exprProc.generateChainCode(ctx.chain(), indent);
        return op + operand;
    }

    public String generatePostfixIncDec(JhpParser.PostfixIncDecExpressionContext ctx, int indent) {
        String op = ctx.getChild(ctx.getChildCount() - 1).getText();
        String operand = exprProc.generateChainCode(ctx.chain(), indent);
        return operand + op;
    }
    
    public String generateNewExpression(JhpParser.NewExpressionContext ctx, int indent) {
        // 提取类型并转换为 Java 类名
        JhpParser.TypeRefContext typeRef = ctx.newExpr().typeRef();
        String javaType = JhpUtils.mapTypeRefToJava(typeRef);   // 将 PHP 类型引用转为 Java 类型字符串

        // 生成参数列表字符串
        String args = "";
        if (ctx.newExpr().arguments() != null) {
            // 复用现有的参数生成方式（直接从 arguments 提取）
            args = JhpUtils.generateArgumentsString(ctx.newExpr().arguments(), exprProc, indent);
        }
        
        return "new " + javaType + "(" + args + ")";
    }
}
