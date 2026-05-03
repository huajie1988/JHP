package compiler;

import jhp.parser.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VariableProcessor {

    private final PrintWriter out;
    private BinaryExpressionProcessor binExprProc;
    // 符号表：变量名 -> 类型
    private final Map<String, String> varTypes = new HashMap<>();
    // 临时存储当前待处理的属性（用于下一个语句）
    private List<JhpParser.AttributeGroupContext> currentAttributes = new ArrayList<>();

    public VariableProcessor(PrintWriter out) {
        this.out = out;
    }

    public void setExprProcessor(BinaryExpressionProcessor exprProc) {
        this.binExprProc = exprProc;
    }
    // ---------- 供 JhpVisitor 调用的公共接口 ----------

    public void setCurrentAttributes(List<JhpParser.AttributeGroupContext> attrs) {
        currentAttributes.clear();
        currentAttributes.addAll(attrs);
    }

    /**
     * 获取表达式的代码表示（用于 echo 等场景）
     */
    public String getExpressionCode(JhpParser.ExpressionContext ctx) {
        if (ctx instanceof JhpParser.ChainExpressionContext) {
            return getVarNameFromChain(((JhpParser.ChainExpressionContext) ctx).chain());
        }
        return ctx.getText();
    }

    /**
     * 处理赋值语句，生成 Java 声明或赋值代码
     */
    public void handleAssignment(JhpParser.AssignmentExpressionContext ctx, int indentLevel) {
        String leftVar = getAssignableVarName(ctx.assignable());
        JhpParser.ExpressionContext rightExpr = ctx.expression();

        // 优先从属性中获取类型
        String explicitType = null;
        if (!currentAttributes.isEmpty()) {
            explicitType = extractTypeFromAttributes(currentAttributes);
            currentAttributes.clear();
        }

        String rightType;
        if (explicitType != null) {
            rightType = explicitType;
        } else {
            rightType = inferTypeFromExpression(rightExpr);
        }
        System.err.println("DEBUG: inferred type for " + rightExpr.getText() + " is " + rightType);
        String rightCode = generateInitializationCode(rightType, rightExpr, indentLevel);

        if (!varTypes.containsKey(leftVar)) {
            // 首次声明
            varTypes.put(leftVar, rightType);
            printIndent(indentLevel);
            out.printf("%s %s = %s;%n", rightType, leftVar, rightCode);
        } else {
            String declaredType = varTypes.get(leftVar);
            if (declaredType.equals(rightType)) {
                printIndent(indentLevel);
                out.printf("%s = %s;%n", leftVar, rightCode);
            } else if (declaredType.equals("Double") && rightType.equals("Integer")) {
                // Double 变量赋 Integer 值，需要显式转换
                printIndent(indentLevel);
                out.printf("%s = %s.doubleValue();%n", leftVar, rightCode);
            } else {
                System.err.println("Warning: type mismatch for variable " + leftVar + 
                                   " (declared: " + declaredType + ", assigned: " + rightType + ")");
                printIndent(indentLevel);
                out.printf("%s = (%s) %s;%n", leftVar, declaredType, rightCode);
            }
        }
    }


    // ---------- 以下为私有辅助方法 ----------

    private void printIndent(int level) {
        for (int i = 0; i < level; i++) out.print("    ");
    }

    private String indentStr(int level) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < level; i++) sb.append("    ");
        return sb.toString();
    }

    private String getAssignableVarName(JhpParser.AssignableContext ctx) {
        if (ctx.chain() != null) {
            return getVarNameFromChain(ctx.chain());
        }
        return ctx.getText().replace("$", "");
    }

    public String getVarNameFromChain(JhpParser.ChainContext ctx) {
        JhpParser.ChainOriginContext origin = ctx.chainOrigin();
        JhpParser.ChainBaseContext base = origin.chainBase();
        if (base != null) {
            List<JhpParser.KeyedVariableContext> keyedVars = base.keyedVariable();
            if (!keyedVars.isEmpty()) {
                JhpParser.KeyedVariableContext keyedVar = keyedVars.get(0);
                String varText = keyedVar.getText();
                if (varText.startsWith("$")) {
                    varText = varText.substring(1);
                }
                if (varText.startsWith("{") && varText.endsWith("}")) {
                    varText = varText.substring(1, varText.length() - 1);
                }
                java.util.regex.Matcher m = java.util.regex.Pattern.compile("^[a-zA-Z_][a-zA-Z0-9_]*").matcher(varText);
                if (m.find()) {
                    return m.group();
                }
                return varText;
            }
        }
        String text = ctx.getText();
        if (text.startsWith("$")) text = text.substring(1);
        return text.replaceAll("[^a-zA-Z0-9_]", "");
    }

    private String generateInitializationCode(String javaType, JhpParser.ExpressionContext rightExpr, int indentLevel) {
        String baseType = javaType;
        int genericStart = javaType.indexOf('<');
        if (genericStart != -1) {
            baseType = javaType.substring(0, genericStart);
        }
        switch (baseType) {
            case "List":
            case "ArrayList":
                return generateListInitialization(rightExpr);
            case "Map":
            case "HashMap":
                return generateMapInitialization(rightExpr, indentLevel);
            default:
                return this.binExprProc.generateExpression(rightExpr, indentLevel);   // 原样输出，由用户保证正确
        }
    }

    private String generateListInitialization(JhpParser.ExpressionContext rightExpr) {
        String exprText = rightExpr.getText();
        if (exprText.startsWith("[") && exprText.endsWith("]")) {
            String elements = exprText.substring(1, exprText.length() - 1);
            if (elements.trim().isEmpty()) {
                return "new ArrayList<>()";
            }
            String[] items = elements.split(",");
            StringBuilder sb = new StringBuilder("new ArrayList<>(Arrays.asList(");
            for (int i = 0; i < items.length; i++) {
                if (i > 0) sb.append(", ");
                sb.append(items[i].trim());
            }
            sb.append("))");
            return sb.toString();
        } else if (exprText.startsWith("array(") && exprText.endsWith(")")) {
            String inner = exprText.substring(6, exprText.length() - 1);
            if (inner.trim().isEmpty()) {
                return "new ArrayList<>()";
            }
            return "new ArrayList<>(Arrays.asList(" + inner + "))";
        }
        return getExpressionCode(rightExpr);
    }

    private String generateMapInitialization(JhpParser.ExpressionContext rightExpr, int indentLevel) {
        String exprText = rightExpr.getText();
        if ((exprText.startsWith("[") && exprText.endsWith("]")) ||
                (exprText.startsWith("array(") && exprText.endsWith(")"))) {
            boolean isArrayStyle = exprText.startsWith("array(");
            String inner = exprText.substring(isArrayStyle ? 6 : 1, exprText.length() - (isArrayStyle ? 1 : 1));
            if (inner.trim().isEmpty()) {
                return "new HashMap<>()";
            }
            String[] pairs = inner.split(",");
            StringBuilder sb = new StringBuilder("new HashMap<>() {{\n");
            for (String pair : pairs) {
                String[] kv = pair.split("=>");
                if (kv.length == 2) {
                    String key = kv[0].trim();
                    String value = kv[1].trim();
                    sb.append(indentStr(indentLevel + 1)).append("put(").append(key).append(", ").append(value).append(");\n");
                }
            }
            sb.append(indentStr(indentLevel)).append("}\n}");
            return sb.toString();
        }
        return this.binExprProc.generateExpression(rightExpr, indentLevel);
    }

    private String extractTypeFromAttributes(List<JhpParser.AttributeGroupContext> attrs) {
        for (JhpParser.AttributeGroupContext group : attrs) {
            for (JhpParser.AttributeContext attr : group.attribute()) {
                System.err.println("DEBUG: attribute = " + attr.getText());
                String name = attr.qualifiedNamespaceName().getText();
                System.err.println("DEBUG: attribute name = " + name);
                if (name.equals("Type") || name.equals("\\Type")) {
                    JhpParser.ArgumentsContext args = attr.arguments();
                    if (args != null && args.actualArgument().size() > 0) {
                        String typeArg = args.actualArgument(0).expression().getText();
                        System.err.println("DEBUG: typeArg = " + typeArg);
                        if (typeArg.startsWith("\"") || typeArg.startsWith("'")) {
                            typeArg = typeArg.substring(1, typeArg.length() - 1);
                        }
                        return mapJhpTypeToJavaType(typeArg);
                    }
                }
            }
        }
        return null;
    }

    public String mapJhpTypeToJavaType(String phpType) {
        switch (phpType) {
            case "int":
            case "integer":
                return "Integer";
            case "float":
            case "double":
                return "Double";
            case "bool":
            case "boolean":
                return "Boolean";
            case "string":
                return "String";
            default:
                return phpType;
        }
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
            String varName = getVarNameFromChain(((JhpParser.ChainExpressionContext) ctx).chain());
            return varTypes.getOrDefault(varName, "Object");
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