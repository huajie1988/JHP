package compiler;

import jhp.parser.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class AtomicExpressionProcessor {
    private final PrintWriter out;
    private final ExpressionProcessor exprProc;

    public AtomicExpressionProcessor(ExpressionProcessor exprProc, PrintWriter out) {
        this.exprProc = exprProc;
        this.out = out;
    }

    // 直接返回文本
    public String generateScalar(JhpParser.ScalarExpressionContext ctx, int indentLevel) { 
        return ctx.getText();
    }        
    public String generateChain(JhpParser.ChainExpressionContext ctx, int indentLevel) {
        return JhpUtils.getVarNameFromChain(ctx.chain());
    }
    public String generateParenthesis(JhpParser.ParenthesisExpressionContext ctx, int indentLevel) { 
        JhpParser.ParenthesesContext parens = ctx.parentheses();
        JhpParser.ExpressionContext innerExpr = parens.expression();
        if (innerExpr != null) {
            return "(" + exprProc.generateExpression(innerExpr, indentLevel) + ")";
        } else {
            // yieldExpression 的情形暂不处理，直接返回原始文本
            return parens.getText();
        }
    }

    public String generateArrayCreation(JhpParser.ArrayCreationExpressionContext ctx, int indent) {
        // 提取 ArrayCreationContext
        JhpParser.ArrayCreationContext arrCtx = null;
        for (int i=0; i<ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof JhpParser.ArrayCreationContext) {
                arrCtx = (JhpParser.ArrayCreationContext) ctx.getChild(i);
                break;
            }
        }
        if (arrCtx == null) return "new ArrayList<>()";
        JhpParser.ArrayItemListContext itemList = null;
        for (int i=0; i<arrCtx.getChildCount(); i++) {
            if (arrCtx.getChild(i) instanceof JhpParser.ArrayItemListContext) {
                itemList = (JhpParser.ArrayItemListContext) arrCtx.getChild(i);
                break;
            }
        }
        // 判断键值对
        String text = ctx.getText();
        boolean isMap = text.contains("=>");
        if (isMap) return generateMapInit(itemList, indent);
        else return generateListInit(itemList, indent);
    }

    private String generateListInit(JhpParser.ArrayItemListContext itemList, int indent) {
        if (itemList == null || itemList.arrayItem().isEmpty()) return "new ArrayList<>()";
        List<String> items = new ArrayList<>();
        for (JhpParser.ArrayItemContext item : itemList.arrayItem()) {
            JhpParser.ExpressionContext expr = item.expression(0); // 对于列表，每个item只有一个表达式
            if (expr != null) items.add(exprProc.generateExpression(expr, indent));
        }
        return "new ArrayList<>(Arrays.asList(" + String.join(", ", items) + "))";
    }

    private String generateMapInit(JhpParser.ArrayItemListContext itemList, int indent) {
        if (itemList == null || itemList.arrayItem().isEmpty()) return "new HashMap<>()";
        StringBuilder sb = new StringBuilder("new HashMap<>() {{\n");
        for (JhpParser.ArrayItemContext item : itemList.arrayItem()) {
            List<JhpParser.ExpressionContext> exprs = item.expression();
            if (exprs.size() >= 2) {
                String key = exprProc.generateExpression(exprs.get(0), indent);
                String value = exprProc.generateExpression(exprs.get(1), indent);
                sb.append(JhpUtils.indentStr(indent+1)).append("put(").append(key).append(", ").append(value).append(");\n");
            }
        }
        sb.append(JhpUtils.indentStr(indent)).append("}}");
        return sb.toString();
    }

}
