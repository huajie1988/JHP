package compiler;

import jhp.parser.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.List;
import java.io.PrintWriter;

public final class JhpUtils {

    // 将 PHP 类型映射为 Java 类型
    public static String mapJhpTypeToJavaType(String phpType) { 
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

    // 从链式表达式中提取变量名，处理 $ 和 { } 包裹的情况
    public static String getVarNameFromChain(JhpParser.ChainContext ctx) { 
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

    public static String getAssignableVarName(JhpParser.AssignableContext ctx) {
        if (ctx.chain() != null) return getVarNameFromChain(ctx.chain());
        return ctx.getText().replace("$", "");
    }

    // 判断是否需要括号：判断子表达式是否需要加括号（防止优先级错乱）
    public static boolean needsParentheses(JhpParser.ExpressionContext ctx) { 
        // 原子表达式：标量、链、括号、数组字面量等不加括号
        return !(ctx instanceof JhpParser.ScalarExpressionContext ||
                 ctx instanceof JhpParser.ChainExpressionContext ||
                 ctx instanceof JhpParser.ParenthesisExpressionContext ||
                 ctx instanceof JhpParser.ArrayCreationExpressionContext);
    }
    // 判断表达式是否为字符串类型（可用于决定是否需要强制转换）
    public static boolean isStringExpression(JhpParser.ExpressionContext ctx, ExpressionProcessor exprProc) {
        if (ctx instanceof JhpParser.ScalarExpressionContext && 
            ((JhpParser.ScalarExpressionContext)ctx).string() != null) return true;
        return "String".equals(exprProc.inferTypeFromExpression(ctx));
    }

    // 生成缩进字符串
    public static String indentStr(int level) { 
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < level; i++) sb.append("    ");
        return sb.toString();
    }

    // 输出缩进
    public static void printIndent(PrintWriter out, int level) { 
        for (int i = 0; i < level; i++) out.print("    ");
     }

    // 从泛型类型字符串中提取指定位置的参数类型，例如 List<String> 提取 String
    public static String getGenericParameter(String type, int index) {
        int start = type.indexOf('<') + 1;
        int end = type.lastIndexOf('>');
        if (end <= start) return "Object";
        String content = type.substring(start, end);
        int depth = 0, currentIndex = 0, lastPos = 0;
        for (int i = 0; i < content.length(); i++) {
            char c = content.charAt(i);
            if (c == '<') depth++;
            else if (c == '>') depth--;
            else if (c == ',' && depth == 0) {
                if (currentIndex == index) return content.substring(lastPos, i).trim();
                currentIndex++;
                lastPos = i + 1;
            }
        }
        // 最后一个参数
        if (currentIndex == index) return content.substring(lastPos).trim();
        return "Object";
    } 

    public static boolean isMapType(String type) {
        return type.startsWith("HashMap<") || type.startsWith("Map<");
    }

    public static boolean isListType(String type) {
        return type.startsWith("ArrayList<") || type.startsWith("List<");
    }

    // 从泛型中提取键类型（仅 Map 有效）
    public static String extractKeyType(String type) {
        if (type == null) return "Object";
        int start = type.indexOf('<') + 1;
        int end = type.lastIndexOf('>');
        if (end > start) {
            String[] parts = type.substring(start, end).split(",");
            if (parts.length >= 1) return parts[0].trim();
        }
        return "Object";
    }

    /**
     * 从 Java 泛型类型字符串中提取元素类型
     * 例如 ArrayList<Integer> 返回 Integer
     *      HashMap<String, Double> 返回 Double
     * 若无法解析则返回 Object
     */
    public static String extractElementType(String javaType) {
        if (javaType == null) return "Object";
        if (JhpUtils.isListType(javaType)) {
            return JhpUtils.getGenericParameter(javaType, 0);
        } else if (JhpUtils.isMapType(javaType)) {
            return JhpUtils.getGenericParameter(javaType, 1); // 值类型是第二个参数
        }
        return "Object";
    }

    // 辅助方法：将 PHP typeHint 转为 Java 类型字符串
    public static String mapTypeHint(JhpParser.TypeHintContext typeHint) {
        // System.err.println("DEBUG: mapping type hint: " +typeHint.qualifiedStaticTypeRef().getText());
        if (typeHint.primitiveType() != null) {
            return JhpUtils.mapJhpTypeToJavaType(typeHint.primitiveType().getText());
        } else if (typeHint.qualifiedStaticTypeRef() != null) {
            return typeHint.qualifiedStaticTypeRef().getText();
        } else if (typeHint.Callable() != null) {
            return "Object"; // 简化处理
        }
        return "Object";
    }

    public static String resolveFunctionNameForInfer(JhpParser.FunctionCallNameContext fcn) {
        if (fcn.qualifiedNamespaceName() != null) {
            String fullName = fcn.qualifiedNamespaceName().getText()
                    .replaceAll("^\\\\+", "")
                    .replace("\\", ".");
            return fullName;
        } else if (fcn.classConstant() != null) {
            JhpParser.ClassConstantContext cc = fcn.classConstant();
            String left = cc.qualifiedStaticTypeRef() != null
                    ? cc.qualifiedStaticTypeRef().getText().replace("\\", ".")
                    : "";
            String right = cc.identifier() != null ? cc.identifier().getText() : "";
            return left + "." + right;
        } else if (fcn.parentheses() != null || fcn.chainBase() != null) {
            // 动态函数调用或变量调用无法静态推断，返回 null 后使用 Object
            return null;
        }
        return fcn.getText();
    }
}
