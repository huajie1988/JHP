package compiler;

import jhp.parser.*;

import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;

public class InferType {
    private VariableProcessor varProc;
    public InferType(VariableProcessor varProc) {
        this.varProc = varProc;
    }
    public String inferTypeFromExpression(JhpParser.ExpressionContext ctx) {
        if (ctx instanceof JhpParser.ScalarExpressionContext) {
            JhpParser.ScalarExpressionContext scalar = (JhpParser.ScalarExpressionContext) ctx;
            if (scalar.constant() != null) {
                String text = scalar.getText();
                System.err.println("DEBUG: inferring type from constant " + text);
                if (text.matches("-?\\d+")) return "Integer";
                if (text.matches("-?\\d+\\.\\d+")) return "Double";
                if (text.equals("true") || text.equals("false")) return "Boolean";
            }
            if (scalar.string() != null) {
                return "String";
            }
        } else if (ctx instanceof JhpParser.ChainExpressionContext) {
            JhpParser.ChainExpressionContext chainCtx = (JhpParser.ChainExpressionContext) ctx;
            JhpParser.ChainContext chain = chainCtx.chain();
            // 检查是否是函数调用
            if (chain.chainOrigin() != null && chain.chainOrigin().functionCall() != null) {
                JhpParser.FunctionCallContext funcCall = chain.chainOrigin().functionCall();
                String funcName = JhpUtils.resolveFunctionNameForInfer(funcCall.functionCallName());
                return varProc.getFunctionReturnType(funcName);
            }
            
            String varName = JhpUtils.getVarNameFromChain(chainCtx.chain());
            String varType = varProc.getVariableType(varName);
            if (hasSubscript(chainCtx.chain())) {
                int depth = getSubscriptDepth(chainCtx.chain());
                String currentType = varType;
                for (int i = 0; i < depth; i++) {
                    currentType = JhpUtils.extractElementType(currentType);
                }
                return currentType;
            } else {
                return varType;
            } 
        }// 新增 IndexerExpression 分支
        else if (ctx instanceof JhpParser.IndexerExpressionContext) {
            return "String";
        } else if (ctx instanceof JhpParser.ArrayCreationExpressionContext) {
            return inferArrayType((JhpParser.ArrayCreationExpressionContext) ctx);
        } else if (ctx instanceof JhpParser.AdditiveExpressionContext) {
            JhpParser.AdditiveExpressionContext add = (JhpParser.AdditiveExpressionContext) ctx;
            String left = inferTypeFromExpression(add.expression(0));
            String right = inferTypeFromExpression(add.expression(1));
            if (add.op.getText().equals(".")) {
                return "String";
            }
            if (left.equals("String") || right.equals("String")) return "String";
            if (left.equals("Double") || right.equals("Double")) return "Double";
            return "Integer";
        } else if (ctx instanceof JhpParser.MultiplicativeExpressionContext) {
            JhpParser.MultiplicativeExpressionContext mul = (JhpParser.MultiplicativeExpressionContext) ctx;
            String left = inferTypeFromExpression(mul.expression(0));
            String right = inferTypeFromExpression(mul.expression(1));
            if (left.equals("Double") || right.equals("Double")) return "Double";
            return "Integer";
        } else if (ctx instanceof JhpParser.RelationalExpressionContext) {
            return "Boolean";
        } else if (ctx instanceof JhpParser.EqualityExpressionContext) {
            return "Boolean";
        }
        return "Object";
    }

    private int getSubscriptDepth(JhpParser.ChainContext chain) {
        if (chain.chainOrigin() != null && chain.chainOrigin().chainBase() != null) {
            List<JhpParser.KeyedVariableContext> keyedVars = chain.chainOrigin().chainBase().keyedVariable();
            if (keyedVars != null && !keyedVars.isEmpty()) {
                return keyedVars.get(0).squareCurlyExpression().size();
            }
        }
        return 0;
    }
    /**
     * 判断链是否包含方括号下标访问
     */
    private boolean hasSubscript(JhpParser.ChainContext chain) {
        if (chain.chainOrigin() != null &&
            chain.chainOrigin().chainBase() != null) {
            List<JhpParser.KeyedVariableContext> keyedVars = chain.chainOrigin().chainBase().keyedVariable();
            if (keyedVars != null && !keyedVars.isEmpty()) {
                return !keyedVars.get(0).squareCurlyExpression().isEmpty();
            }
        }
        return false;
    }


    private String inferArrayType(JhpParser.ArrayCreationExpressionContext ctx) {
        String exprText = ctx.getText();
        if (exprText.contains("=>")) {
            return inferMapType(ctx);
        }
        String elementType = inferArrayElementType(ctx);
        if (elementType != null && !elementType.equals("Object")) {
            return "ArrayList<" + elementType + ">";
        }
        return "ArrayList<Object>";
    }

    private String inferArrayElementType(JhpParser.ArrayCreationExpressionContext ctx) {
        JhpParser.ArrayCreationContext arrayCreation = null;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof JhpParser.ArrayCreationContext) {
                arrayCreation = (JhpParser.ArrayCreationContext) child;
                break;
            }
        }
        if (arrayCreation == null) {
            return null;
        }
        JhpParser.ArrayItemListContext itemList = null;
        for (int i = 0; i < arrayCreation.getChildCount(); i++) {
            ParseTree child = arrayCreation.getChild(i);
            if (child instanceof JhpParser.ArrayItemListContext) {
                itemList = (JhpParser.ArrayItemListContext) child;
                break;
            }
        }
        if (itemList == null || itemList.arrayItem().isEmpty()) {
            return null;
        }
        for (JhpParser.ArrayItemContext item : itemList.arrayItem()) {
            JhpParser.ExpressionContext expr = item.expression(0);
            if (expr != null) {
                String type = inferTypeFromExpression(expr);
                if (type != null && !type.equals("Object")) {
                    return type;
                }
            }
        }
        return "Object";
    }

    private String inferMapType(JhpParser.ArrayCreationExpressionContext ctx) {
        JhpParser.ArrayCreationContext arrayCreation = null;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof JhpParser.ArrayCreationContext) {
                arrayCreation = (JhpParser.ArrayCreationContext) child;
                break;
            }
        }
        if (arrayCreation == null) {
            return "HashMap<Object, Object>";
        }
        JhpParser.ArrayItemListContext itemList = null;
        for (int i = 0; i < arrayCreation.getChildCount(); i++) {
            ParseTree child = arrayCreation.getChild(i);
            if (child instanceof JhpParser.ArrayItemListContext) {
                itemList = (JhpParser.ArrayItemListContext) child;
                break;
            }
        }
        if (itemList == null || itemList.arrayItem().isEmpty()) {
            return "HashMap<Object, Object>";
        }
        String keyType = null;
        String valueType = null;
        for (JhpParser.ArrayItemContext item : itemList.arrayItem()) {
            List<JhpParser.ExpressionContext> expressions = item.expression();
            if (expressions.size() >= 2) {
                JhpParser.ExpressionContext keyExpr = expressions.get(0);
                JhpParser.ExpressionContext valueExpr = expressions.get(1);
                String currentKeyType = inferTypeFromExpression(keyExpr);
                String currentValueType = inferTypeFromExpression(valueExpr);
                if (keyType == null) {
                    keyType = currentKeyType;
                } else if (!keyType.equals(currentKeyType)) {
                    keyType = getCommonSuperType(keyType, currentKeyType);
                }
                if (valueType == null) {
                    valueType = currentValueType;
                } else if (!valueType.equals(currentValueType)) {
                    valueType = getCommonSuperType(valueType, currentValueType);
                }
            }
        }
        if (keyType == null || keyType.equals("Object")) {
            keyType = "String";
        }
        if (valueType == null || valueType.equals("Object")) {
            valueType = "Object";
        }
        return "HashMap<" + keyType + ", " + valueType + ">";
    }

        private String getCommonSuperType(String type1, String type2) {
        if (type1.equals(type2)) {
            return type1;
        }
        if ((type1.equals("Integer") || type1.equals("Double")) &&
                (type2.equals("Integer") || type2.equals("Double"))) {
            return "Double";
        }
        return "Object";
    }
}
