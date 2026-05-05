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
    public String generateChain(JhpParser.ChainExpressionContext ctx, int indent) {
        JhpParser.ChainContext chain = ctx.chain();
        String varName = getBaseVarName(chain);
        List<String> subscripts = extractSubscripts(chain);
        if (subscripts.isEmpty()) {
            return varName;
        }
        String varType = exprProc.getVariableTypes(varName);
        String result = varName;
        for (String index : subscripts) {
            if (JhpUtils.isListType(varType)) {
                result = result + ".get(" + index + ")";
                // 更新 varType 为元素类型，以支持多级下标
                varType = JhpUtils.extractElementType(varType);
            } else if (JhpUtils.isMapType(varType)) {
                result = result + ".get(" + index + ")";
                varType = JhpUtils.extractElementType(varType);
            } else {
                // 类型未知或不是标准集合，使用运行时 helper（返回 Object，外部可能需要强转）
                result = "runtime.JhpRuntime.arrayGet(" + result + ", " + index + ")";
                varType = "Object";
            }
        }
        return result;
    }

    // 提取最左侧的变量名（不包含下标）
    private String getBaseVarName(JhpParser.ChainContext chain) {
        // 复用 JhpUtils 中的逻辑，它返回干净的变量名
        return JhpUtils.getVarNameFromChain(chain);
    }

    // 提取 keyedVariable 中的所有方括号索引
    private List<String> extractSubscripts(JhpParser.ChainContext chain) {
        List<String> indices = new ArrayList<>();
        JhpParser.ChainOriginContext origin = chain.chainOrigin();
        if (origin == null) return indices;
        JhpParser.ChainBaseContext base = origin.chainBase();
        if (base == null) return indices;
        List<JhpParser.KeyedVariableContext> keyedVars = base.keyedVariable();
        // 通常只有一个 keyedVariable，但安全起见遍历第一个
        if (keyedVars.isEmpty()) return indices;
        JhpParser.KeyedVariableContext kv = keyedVars.get(0);
        for (JhpParser.SquareCurlyExpressionContext sq : kv.squareCurlyExpression()) {
            if (sq.expression() != null) {
                String indexCode = exprProc.generateExpression(sq.expression(), 0); // 缩进不重要
                indices.add(indexCode);
            }
        }
        return indices;
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

    public String generateIndexer(JhpParser.IndexerExpressionContext ctx, int indent) {
        String str = ctx.stringConstant().getText();
        String index = exprProc.generateExpression(ctx.expression(), indent);
        // PHP 字符串下标返回字符，Java 用 charAt + String.valueOf 包装
        return "String.valueOf(" + str + ".charAt(" + index + "))";
    }

}
