package compiler;

import jhp.parser.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

public class ExpressionProcessor {
    private final AtomicExpressionProcessor atomic;
    private final UnaryExpressionProcessor unary;
    private final BinaryExpressionProcessor binary;
    private final VariableProcessor varProc; // 用于类型推断
    private final PrintWriter out;
    private final InferType inferType;

    public ExpressionProcessor(VariableProcessor varProc, PrintWriter out) {
        this.atomic = new AtomicExpressionProcessor(this, out);
        this.unary = new UnaryExpressionProcessor(this, out);
        this.binary = new BinaryExpressionProcessor(this, out);
        this.varProc = varProc;
        this.out = out;
        this.inferType = new InferType(varProc);
    }

    public String generateExpression(JhpParser.ExpressionContext ctx, int indent) {
        // 原子表达式
        // 标量、变量
        if (ctx instanceof JhpParser.ScalarExpressionContext) 
            return atomic.generateScalar((JhpParser.ScalarExpressionContext) ctx,indent);
        // 括号表达式
        if (ctx instanceof JhpParser.ParenthesisExpressionContext) 
            return atomic.generateParenthesis((JhpParser.ParenthesisExpressionContext) ctx, indent);
        // 链式表达式
        if (ctx instanceof JhpParser.ChainExpressionContext) 
            return atomic.generateChain((JhpParser.ChainExpressionContext) ctx, indent);
        // 数组创建表达式
        if (ctx instanceof JhpParser.ArrayCreationExpressionContext) 
            return atomic.generateArrayCreation((JhpParser.ArrayCreationExpressionContext) ctx, indent);
        // 索引器表达式
        if (ctx instanceof JhpParser.IndexerExpressionContext) 
            return atomic.generateIndexer((JhpParser.IndexerExpressionContext) ctx, indent);


        // 一元表达式
        // 强制类型转换
        if (ctx instanceof JhpParser.CastExpressionContext) 
            return unary.generateCast((JhpParser.CastExpressionContext)ctx, indent);
        // 一元运算符
        if (ctx instanceof JhpParser.UnaryOperatorExpressionContext) 
            return unary.generateUnaryOp((JhpParser.UnaryOperatorExpressionContext)ctx, indent);
        // 前缀自增自减
        if (ctx instanceof JhpParser.PrefixIncDecExpressionContext) 
            return unary.generatePrefixIncDec((JhpParser.PrefixIncDecExpressionContext)ctx, indent);
        // 后缀自增自减
        if (ctx instanceof JhpParser.PostfixIncDecExpressionContext) 
            return unary.generatePostfixIncDec((JhpParser.PostfixIncDecExpressionContext)ctx, indent);

        // 二元表达式
        // 加法/字符串连接
        if (ctx instanceof JhpParser.AdditiveExpressionContext) {
            return binary.generateAdditive((JhpParser.AdditiveExpressionContext) ctx, indent);
        }
        // 乘除取模
        if (ctx instanceof JhpParser.MultiplicativeExpressionContext) {
            return binary.generateMultiplicative((JhpParser.MultiplicativeExpressionContext) ctx, indent);
        }
        // 移位
        if (ctx instanceof JhpParser.ShiftExpressionContext) {
            return binary.generateShift((JhpParser.ShiftExpressionContext) ctx, indent);
         }
        // 关系比较
         if (ctx instanceof JhpParser.RelationalExpressionContext) {
            return binary.generateRelational((JhpParser.RelationalExpressionContext) ctx, indent);
        }
        // 等值比较
        if (ctx instanceof JhpParser.EqualityExpressionContext) {
            return binary.generateEquality((JhpParser.EqualityExpressionContext) ctx, indent);
        }

        // 赋值表达式
        if (ctx instanceof JhpParser.AssignmentExpressionContext) {
            return binary.generateAssignment((JhpParser.AssignmentExpressionContext) ctx, indent);
        }

        // 逻辑与
        if (ctx instanceof JhpParser.LogicalAndExpressionContext) {
            return binary.generateLogicalAnd((JhpParser.LogicalAndExpressionContext) ctx, indent);
        }
        // 逻辑或
        if (ctx instanceof JhpParser.LogicalIncOrExpressionContext) {
            return binary.generateLogicalOr((JhpParser.LogicalIncOrExpressionContext) ctx, indent);
        }
        // 逻辑异或
        if (ctx instanceof JhpParser.LogicalExcOrExpressionContext) {
            return binary.generateLogicalXor((JhpParser.LogicalExcOrExpressionContext) ctx, indent);
        }
        // 按位与
        if (ctx instanceof JhpParser.BitwiseAndExpressionContext) {
            return binary.generateBitwiseAnd((JhpParser.BitwiseAndExpressionContext) ctx, indent);
        }
        // 按位或
        if (ctx instanceof JhpParser.BitwiseIncOrExpressionContext) {
            return binary.generateBitwiseOr((JhpParser.BitwiseIncOrExpressionContext) ctx, indent);
        }
        // 按位异或
        if (ctx instanceof JhpParser.BitwiseExcOrExpressionContext) {
            return binary.generateBitwiseXor((JhpParser.BitwiseExcOrExpressionContext) ctx, indent);
        }
        // ??表达式
        if (ctx instanceof JhpParser.CoalesceExpressionContext) {
            return binary.generateCoalescing((JhpParser.CoalesceExpressionContext) ctx, indent);
        }
        // <=>表达式
        if (ctx instanceof JhpParser.SpaceshipExpressionContext) {
            return binary.generateSpaceship((JhpParser.SpaceshipExpressionContext) ctx, indent);
        }
        // 幂运算
        if (ctx instanceof JhpParser.ExponentiationExpressionContext) {
            return binary.generateExponential((JhpParser.ExponentiationExpressionContext) ctx, indent);
        }

        // 三元表达式
        if (ctx instanceof JhpParser.ConditionalExpressionContext) {
            return binary.generateConditionalExpression((JhpParser.ConditionalExpressionContext) ctx, indent);
        }

        // 未支持的类型则 fallback
        System.err.println("Unsupported expression: " + ctx.getClass().getSimpleName());
        return ctx.getText();
    }

    public String inferTypeFromExpression(JhpParser.ExpressionContext ctx) {
        return inferType.inferTypeFromExpression(ctx);
    }

    public String getVariableTypes(String varName) {
        return varProc.getVariableType(varName);
    }

    // 新增辅助方法：将 expressionList 转换为逗号分隔的表达式代码
    public String generateExpressionList(JhpParser.ExpressionListContext ctx, int indent) {
        if (ctx == null || ctx.expression() == null) return "";
        List<JhpParser.ExpressionContext> exprs = ctx.expression();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < exprs.size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append(generateExpression(exprs.get(i), indent));
        }
        return sb.toString();
    }
}