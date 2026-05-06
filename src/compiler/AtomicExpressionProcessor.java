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
        // 如果是函数调用，生成函数调用代码
        // （或后续有成员访问，但保持基本函数调用）
        if (chain.chainOrigin() != null && chain.chainOrigin().functionCall() != null) {
            return generateFunctionCall(chain, indent);
        }
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

    private String generateFunctionCall(JhpParser.ChainContext chain, int indent) {
        JhpParser.FunctionCallContext funcCall = chain.chainOrigin().functionCall();
        JhpParser.FunctionCallNameContext fcn = funcCall.functionCallName();
        
        // 解析方法名（可能包含完整限定路径）
        String methodPath = extractFunctionName(fcn, indent);
        String args = generateArguments(funcCall.actualArguments(), indent);
        
        // 基础调用：methodPath(args)
        StringBuilder result = new StringBuilder(methodPath).append("(").append(args).append(")");
        
        // 处理后续的 memberAccess（-> 调用链）
        for (JhpParser.MemberAccessContext memberAccess : chain.memberAccess()) {
            result.append(generateMemberAccess(memberAccess, indent));
        }
        return result.toString();
    }

    /**
    * 从 functionCallName 解析出 Java 可调用的方法路径。
    * 支持：
    * - qualifiedNamespaceName → 完整限定名（\ 替换为 .）
    * - classConstant → Class::method 翻译为 Class.method
    * - parentheses → (expr) 动态函数名
    * - chainBase → 变量调用（简单处理）
     */
    private String extractFunctionName(JhpParser.FunctionCallNameContext fcn, int indent) {
        if (fcn.qualifiedNamespaceName() != null) {
            String fullName = fcn.qualifiedNamespaceName().getText();
            // 去除前导反斜杠
            fullName = fullName.replaceAll("^\\\\+", "");
            // 将剩余反斜杠替换为 .
            fullName = fullName.replace("\\", ".");
            return fullName;
        } else if (fcn.classConstant() != null) {
            JhpParser.ClassConstantContext cc = fcn.classConstant();
            if (cc.Parent_() != null || cc.Class() != null) {
                // Parent_ :: method 等，暂不处理，返回原样
                return cc.getText();
            }
            // 左侧是 qualifiedStaticTypeRef 或 keyedVariable 或 string
            String leftPart;
            if (cc.qualifiedStaticTypeRef() != null) {
                leftPart = cc.qualifiedStaticTypeRef().getText().replace("\\", ".");
            } else if (cc.keyedVariable() != null) {
                leftPart = JhpUtils.getVarNameFromChain(null); // 需要从 keyedVariable 提取，暂略
                // 简化：keyedVariable 文本去掉 $ 等
                leftPart = cc.keyedVariable(0).getText().replace("$", "");
            } else if (cc.string() != null) {
                leftPart = cc.string().getText(); // 字符串常量，不适合调用
            } else {
                leftPart = cc.getText();
            }
            // 右侧 identifier 或 keyedVariable
            String rightPart = "";
            if (cc.identifier() != null) {
                rightPart = cc.identifier().getText();
            } else if (cc.keyedVariable() != null) {
                rightPart = cc.keyedVariable(0).getText().replace("$", "");
            }
            return leftPart + "." + rightPart;
        } else if (fcn.parentheses() != null) {
            // 动态函数名，返回表达式
            return "(" + exprProc.generateExpression(fcn.parentheses().expression(), indent) + ")";
        } else if (fcn.chainBase() != null) {
            // $var() 形式，暂不支持，返回变量名
            return JhpUtils.getVarNameFromChain(/* 需要 chain 上下文，但这里没有 */ null);
        }
        return fcn.getText(); // 回退
    }

    /**
     * 生成参数列表字符串（逗号分隔的表达式）。
     */
    private String generateArguments(JhpParser.ActualArgumentsContext aac, int indent) {
        if (aac == null || aac.arguments() == null || aac.arguments().isEmpty()) {
            return "";
        }
        List<String> argExprs = new ArrayList<>();
        for (JhpParser.ArgumentsContext argsCtx : aac.arguments()) {
            for (JhpParser.ActualArgumentContext actArg : argsCtx.actualArgument()) {
                // 忽略 argumentName （如 name: ），只处理表达式
                if (actArg.expression() != null) {
                    argExprs.add(exprProc.generateExpression(actArg.expression(), indent));
                }
                // 忽略 '&' chain（引用传递已删除）
            }
        }
        return String.join(", ", argExprs);
    }

    /** 处理 memberAccess：将其转换为 .methodName(args) */
    private String generateMemberAccess(JhpParser.MemberAccessContext ctx, int indent) {
        String methodName = ctx.keyedFieldName().getText(); // 可能需要处理复杂 keyedFieldName
        // 处理实际参数
        String args = "";
        if (ctx.actualArguments() != null) {
            args = generateArguments(ctx.actualArguments(), indent);
        }
        return "." + methodName + "(" + args + ")";
    }

}
