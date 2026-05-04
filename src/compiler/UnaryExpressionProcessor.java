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
        String javaType = JhpUtils.mapJhpTypeToJavaType(castType);
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
        String operand = JhpUtils.getVarNameFromChain(ctx.chain());
        return op + operand;
    }

    public String generatePostfixIncDec(JhpParser.PostfixIncDecExpressionContext ctx, int indent) {
        String op = ctx.getChild(ctx.getChildCount() - 1).getText();
        String operand = JhpUtils.getVarNameFromChain(ctx.chain());
        return operand + op;
    }
    
}
