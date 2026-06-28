package compiler;

import jhp.parser.*;

import java.util.*;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

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
                // 将 self/static/parent 替换为当前类名，以匹配符号表中的键
                if (funcName != null) {
                    String curClass = varProc.getCurrentClassName();
                    if (curClass != null && !curClass.isEmpty()) {
                        if (funcName.startsWith("self.")) {
                            funcName = curClass + funcName.substring(4);
                        } else if (funcName.startsWith("static.")) {
                            funcName = curClass + funcName.substring(7);
                        }
                    }
                }
                // 首先检查内置函数映射表
                // 内置函数类型推断
                String builtinReturn = BuiltinConfig.getReturnType(funcName);
                if (!builtinReturn.equals("Object")) {
                    return builtinReturn;
                }
                return varProc.getFunctionReturnType(funcName);
            }

            // 2. 链上有成员访问（如 $this->getScore()）
            if (!chain.memberAccess().isEmpty()) {
                String baseVar = JhpUtils.getVarNameFromChain(chain);
                Map<String, String> bindings = varProc.getVarGenericBinding(baseVar);

                JhpParser.MemberAccessContext lastMa = chain.memberAccess().get(chain.memberAccess().size() - 1);
                if (lastMa.actualArguments() == null) {
                    // ---- 属性访问：$this->friendIds ----
                    String memberName = extractAccessorNameFromMa(lastMa);
                    if (memberName != null) {
                        String memberType = varProc.getVariableType(memberName);
                        if (!"Object".equals(memberType)) {
                            // 2. 获取调用对象（如 box）的泛型绑定，并替换 memberType 中的泛型参数
                            memberType = JhpUtils.substituteGenericType(memberType, bindings);
                            if (hasSubscript(chain) || !chain.memberAccess().get(0).keyedFieldName().keyedSimpleFieldName().squareCurlyExpression().isEmpty()) {
                                int totalDepth = getSubscriptDepth(chain);
                                for (int i = 0; i < totalDepth; i++) {
                                    memberType = JhpUtils.extractElementType(memberType);
                                }
                            }
                            return memberType;
                        }
                    }
                } else {
                    // ---- 方法调用：$service->getPerson() ----
                    String methodName = lastMa.keyedFieldName().getText();

                    // 2. 获取该变量的类型（如 "PersonService" 或 "com.huajie.app.service.PersonService"）
                    String varType = varProc.getBaseVariableType(baseVar);
                    // 3. 提取纯类名（去掉泛型部分）
                    String className = JhpUtils.extractClassNameFromType(varType);
                    // 4. 构造全键 "PersonService.getPerson" 或 "com.huajie.app.service.PersonService.getPerson"
                    String fullKey = className + "." + methodName;
                    System.err.println("DEBUG: InferType method fullKey = " + fullKey);

                    // 5. 用全键查询返回类型
                    String rawReturnType = varProc.getFunctionReturnType(fullKey);
                    // 6. 如果全局表没找到，回退到简单方法名（全局函数）
                    if ("Object".equals(rawReturnType)) {
                        rawReturnType = varProc.getFunctionReturnType(methodName);
                    }
                    System.err.println("DEBUG: inferring type from method " + methodName + " with return type " + rawReturnType);

                    // 7. 用泛型绑定替换泛型参数
                    String concreteType = JhpUtils.substituteGenericType(rawReturnType, bindings);
                    if (!concreteType.equals("Object")) return concreteType;
                }
                // 如果无法推断方法返回类型，则退回到变量类型（考虑下标）
                // 继续执行下面的变量类型逻辑
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
        } else if(ctx instanceof JhpParser.NewExpressionContext) {
            JhpParser.NewExpressionContext newExpr = (JhpParser.NewExpressionContext) ctx;
            JhpParser.TypeRefContext typeRef = newExpr.newExpr().typeRef();
            return JhpUtils.mapTypeRefToJava(typeRef);
        }else if (ctx instanceof JhpParser.CastExpressionContext) {
            JhpParser.CastExpressionContext castCtx = (JhpParser.CastExpressionContext) ctx;
            if (castCtx.castOperation().qualifiedStaticTypeRef() != null) {
                return JhpUtils.qualifiedStaticTypeRefToJava(castCtx.castOperation().qualifiedStaticTypeRef());
            } else {
                return JhpUtils.mapJhpTypeToJavaType(castCtx.castOperation().getText());
            }      // 转换为 Java 包装类型
        } else if (ctx instanceof JhpParser.LambdaFunctionExpressionContext) {
            return "Object";
        }else if (ctx instanceof JhpParser.InstanceOfExpressionContext) {
            return "Boolean";
        }else if (ctx instanceof JhpParser.CloneExpressionContext) {
            JhpParser.CloneExpressionContext cloneCtx = (JhpParser.CloneExpressionContext) ctx;
            // 克隆表达式的类型与内部表达式类型一致
            return inferTypeFromExpression(cloneCtx.expression());
        }
        return "Object";
    }

    private int getSubscriptDepth(JhpParser.ChainContext chain) {
        int depth = 0;
        if (chain.chainOrigin() != null && chain.chainOrigin().chainBase() != null) {
            JhpParser.ChainBaseContext base = chain.chainOrigin().chainBase();
            if (base.keyedVariable() != null && !base.keyedVariable().isEmpty()) {
                depth += base.keyedVariable(0).squareCurlyExpression().size();
            }
        }
        for (JhpParser.MemberAccessContext ma : chain.memberAccess()) {
            if (ma.keyedFieldName() != null && ma.keyedFieldName().keyedSimpleFieldName() != null) {
                depth += ma.keyedFieldName().keyedSimpleFieldName().squareCurlyExpression().size();
            }
        }
        return depth;
    }

    // 辅助提取属性名（与 Atomic 里的类似，但 InferType 不能直接引用，所以复制一个）
    private String extractAccessorNameFromMa(JhpParser.MemberAccessContext ma) {
        if (ma.keyedFieldName() != null && ma.keyedFieldName().keyedSimpleFieldName() != null) {
            JhpParser.KeyedSimpleFieldNameContext ksn = ma.keyedFieldName().keyedSimpleFieldName();
            if (ksn.identifier() != null) {
                return ksn.identifier().getText();
            }
        }
        return ma.keyedFieldName().getText().replaceAll("\\[.*?\\]", "");
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

    // 标量常量的类型推断
    private String inferTypeFromLiteralConstant(JhpParser.LiteralConstantContext literal) {
        String text = literal.getText();
        if (text.matches("-?\\d+")) return "Integer";
        if (text.matches("-?\\d+\\.\\d+")) return "Double";
        if (text.equals("true") || text.equals("false")) return "Boolean";
        if (literal.stringConstant() != null) return "String";
        return "Object";
    }
    
    // 从 ArrayItemList 推断列表元素类型（复用现有 inferTypeFromExpression）
    private String inferListTypeFromItemList(JhpParser.ArrayItemListContext itemList) {
        if (itemList == null || itemList.arrayItem().isEmpty()) return "ArrayList<Object>";
        String elementType = null;
        for (JhpParser.ArrayItemContext item : itemList.arrayItem()) {
            if (item.expression(0) != null) {
                String t = inferTypeFromExpression(item.expression(0));
                if (!t.equals("Object")) {
                    elementType = t;
                    break;
                }
            }
        }
        return "ArrayList<" + (elementType != null ? elementType : "Object") + ">";
    }

    // 从 ArrayItemList 推断 Map 类型（复用现有逻辑）
    private String inferMapTypeFromItemList(JhpParser.ArrayItemListContext itemList) {
        if (itemList == null || itemList.arrayItem().isEmpty()) return "HashMap<Object, Object>";
        String keyType = null;
        String valueType = null;
        for (JhpParser.ArrayItemContext item : itemList.arrayItem()) {
            if (item.expression().size() >= 2) {
                String k = inferTypeFromExpression(item.expression(0));
                String v = inferTypeFromExpression(item.expression(1));
                if (keyType == null) {
                    keyType = k;
                } else if (!keyType.equals(k)) {
                    keyType = "Object";
                }
                if (valueType == null) {
                    valueType = v;
                } else if (!valueType.equals(v)) {
                    valueType = "Object";
                }
            }
        }
        if (keyType == null || keyType.equals("Object")) keyType = "String";
        if (valueType == null) valueType = "Object";
        return "HashMap<" + keyType + ", " + valueType + ">";
    }

    /**
     * 从常量初始化器推断类型，最大化复用 inferTypeFromExpression。
     */
    public String inferTypeFromConstantInitializer(JhpParser.ConstantInitializerContext ctx) {
        // 1. literalConstant（数字、布尔、字符串常量）→ 复用标量表达式推断
        if (!ctx.constant().isEmpty() && ctx.constant(0) != null) {
            JhpParser.ConstantContext c = ctx.constant(0);
            if (c.Null() != null) return "Object";
            if (c.literalConstant() != null) {
                // 直接复用标量推断：literalConstant 的文本与 ScalarExpression 的文本一致
                // 只要文本格式是数字、true/false 或字符串，inferTypeFromExpression 就能正确处理
                return inferTypeFromLiteralConstant(c.literalConstant());
            }
            return "Object";
        }

        // 2. 字符串字面量
        if (!ctx.string().isEmpty()) {
            return "String";
        }

        // 3. 数组字面量 → 复用数组推断逻辑
        if (ctx.OpenSquareBracket() != null || ctx.Array() != null) {
            JhpParser.ArrayItemListContext itemList = null;
            for (ParseTree child : ctx.children) {
                if (child instanceof JhpParser.ArrayItemListContext) {
                    itemList = (JhpParser.ArrayItemListContext) child;
                    break;
                }
            }
            if (itemList != null) {
                if (itemList.getText().contains("=>")) {
                    return inferMapTypeFromItemList(itemList);
                } else {
                    return inferListTypeFromItemList(itemList);
                }
            }
            return "ArrayList<Object>";
        }

        // 4. 一元正负 → 递归
        if (ctx.getChild(0).getText().equals("+") || ctx.getChild(0).getText().equals("-")) {
            return inferTypeFromConstantInitializer(
                (JhpParser.ConstantInitializerContext) ctx.getChild(1)
            );
        }

        // 5. 字符串连接 → String
        for (ParseTree child : ctx.children) {
            if (child instanceof TerminalNode && child.getText().equals(".")) {
                return "String";
            }
        }

        return "Object";
    }

    public String inferTypeFromChain(JhpParser.ChainContext chain) {
        // 直接复用现有逻辑：模拟一个 ChainExpressionContext 的部分逻辑
        if (chain.chainOrigin() != null && chain.chainOrigin().functionCall() != null) {
            // 处理函数调用...
            JhpParser.FunctionCallContext funcCall = chain.chainOrigin().functionCall();
            String funcName = JhpUtils.resolveFunctionNameForInfer(funcCall.functionCallName());
            // 处理 self:: 等
            if (funcName != null && varProc.getCurrentClassName() != null) {
                String curClass = varProc.getCurrentClassName();
                if (funcName.startsWith("self.")) funcName = curClass + funcName.substring(4);
                else if (funcName.startsWith("static.")) funcName = curClass + funcName.substring(7);
                else if (funcName.startsWith("parent.")) funcName = curClass + funcName.substring(7);
            }

            // 首先检查内置函数映射表
            // 内置函数类型推断
            String builtinReturn = BuiltinConfig.getReturnType(funcName);
            if (!builtinReturn.equals("Object")) {
                return builtinReturn;
            }
            return varProc.getFunctionReturnType(funcName);
        }

        String varName = JhpUtils.getVarNameFromChain(chain);
        String varType = varProc.getVariableType(varName);

        // 如果有成员访问，尝试推断成员类型
        if (!chain.memberAccess().isEmpty()) {
            // 检查第一个成员访问是否是属性
            JhpParser.MemberAccessContext ma = chain.memberAccess().get(0);
            String memberName = ma.keyedFieldName().getText();
            String memberType = varProc.getVariableType(memberName);  // 需要确保类成员变量已注册
            if (!"Object".equals(memberType)) {
                varType = memberType;  // 使用成员的类型作为数组类型的基础
            }
        }

        // 处理下标，提取元素类型
        if (hasSubscript(chain)) {
            int depth = getSubscriptDepth(chain);
            for (int i = 0; i < depth; i++) {
                varType = JhpUtils.extractElementType(varType);
            }
            return varType;
        }
        return varType;  // 如果没有下标，返回整个数组的类型（ArrayList<X> 等）
    }

}
