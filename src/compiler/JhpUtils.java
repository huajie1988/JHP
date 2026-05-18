package compiler;

import jhp.parser.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;
import java.io.PrintWriter;

public final class JhpUtils {

    // 将 PHP 类型映射为 Java 类型
    public static String mapJhpTypeToJavaType(String phpType) { 
        System.err.println("DEBUG: mapping PHP type '" + phpType + "' to Java type");
        switch (phpType) {
            case "int":
            case "integer":
                return "Integer";
            case "long":
            case "int64":
                return "Long";
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
        if (typeHint == null) return "Object";
        // 1. 基础类型如 int, bool, string 等
        if (typeHint.primitiveType() != null) {
            return mapJhpTypeToJavaType(typeHint.primitiveType().getText());
        }
        // 2. 类/接口 + 可选的泛型
        if (typeHint.qualifiedStaticTypeRef() != null) {
            JhpParser.QualifiedStaticTypeRefContext qsr = typeHint.qualifiedStaticTypeRef();
            String text = qsr.getText();
            String mapped = mapJhpTypeToJavaType(text);
            if (!mapped.equals(text)) {
                return mapped; // 基本类型
            }
            return qualifiedStaticTypeRefToJava(qsr);
        }
        // 3. callable 简化为 Object
        if (typeHint.Callable() != null) {
            return "Object";
        }
        // 4. 联合类型（如 int|string）暂按 Object 处理
        if (typeHint.typeHint() != null && !typeHint.typeHint().isEmpty()) {
            return "Object";
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

    /**
     * 将 qualifiedStaticTypeRef 转换为 Java 类名，并处理泛型参数
     */
    public static String qualifiedStaticTypeRefToJava(JhpParser.QualifiedStaticTypeRefContext ctx) {
        // 处理static::调用
        if (ctx.Static() != null) return "this";
        String rawName = ctx.qualifiedNamespaceName().getText();   // 可能为 self、parent 等
        String resolved = resolveSpecialClassName(rawName);
        StringBuilder sb = new StringBuilder();
        sb.append(phpPackageToJavaPackage(resolved));
        if (ctx.genericDynamicArgs() != null) {
            JhpParser.GenericDynamicArgsContext ga = ctx.genericDynamicArgs();
            if (ga.typeRef() != null && !ga.typeRef().isEmpty()) {
                sb.append("<").append(mapTypeRefListToJava(ga.typeRef())).append(">");
            }
        }
        return sb.toString();
    }

    /** 将 self、parent 等转换为 Java 关键字 */
    private static String resolveSpecialClassName(String name) {
        if ("self".equals(name) || "self".equalsIgnoreCase(name)) return "this";
        if ("parent".equals(name) || "parent".equalsIgnoreCase(name)) return "super";
        return name;
    }

    /**
     * 将 typeRef 转换为 Java 类型字符串，支持嵌套泛型
     */
    public static String mapTypeRefToJava(JhpParser.TypeRefContext typeRef) {
        if (typeRef == null) return "Object";
        // 基本类型
        if (typeRef.primitiveType() != null) {
            return mapJhpTypeToJavaType(typeRef.primitiveType().getText());
        }
        // 类名或命名空间路径（可能带有泛型）
        if (typeRef.qualifiedNamespaceName() != null) {
            String baseName = phpPackageToJavaPackage(typeRef.qualifiedNamespaceName().getText());
            // 尝试基本类型二次判断（如 int）
            String mapped = mapJhpTypeToJavaType(baseName);
            if (!mapped.equals(baseName)) {
                baseName = mapped;
            }
            // 处理泛型参数
            if (typeRef.genericDynamicArgs() != null) {
                JhpParser.GenericDynamicArgsContext ga = typeRef.genericDynamicArgs();
                baseName += "<" + mapTypeRefListToJava(ga.typeRef()) + ">";
            }
            return baseName;
        }
        // static, anonymous, indirect 暂返回 Object
        if (typeRef.Static() != null) return "static";
        if (typeRef.anonymousClass() != null) return "Object";
        if (typeRef.indirectTypeRef() != null) return "Object";
        return "Object";
    }

    /**
     * 将 typeRef 列表转换为逗号分隔的 Java 类型字符串
     */
    public static String mapTypeRefListToJava(List<JhpParser.TypeRefContext> typeRefs) {
        if (typeRefs == null || typeRefs.isEmpty()) return "";
        List<String> parts = new ArrayList<>();
        for (JhpParser.TypeRefContext tr : typeRefs) {
            parts.add(mapTypeRefToJava(tr));
        }
        return String.join(", ", parts);
    }

    public static String phpPackageToJavaPackage(String name) {
        name = name.replaceAll("^\\\\+", "");
        return name.replace("\\", ".");
    }

    public static String extractAccessModifier(JhpParser.MemberModifiersContext modifiersCtx) {
        if (modifiersCtx == null || modifiersCtx.memberModifier() == null) return "public ";
        boolean hasAccess = false;
        StringBuilder sb = new StringBuilder();
        for (JhpParser.MemberModifierContext mod : modifiersCtx.memberModifier()) {
            String text = mod.getText().toLowerCase();
            if (text.equals("public") || text.equals("private") || text.equals("protected")) {
                sb.append(text).append(" ");
                hasAccess = true;
            } else if (text.equals("static")) {
                sb.append(text).append(" ");
            }
        }
        if (!hasAccess) sb.insert(0, "public ");
        return sb.toString();
    }

    /**
     * 从成员修饰符列表中提取 Java 方法修饰符（public/private/protected/static/abstract/final）
     */
    public static String extractMethodModifiers(JhpParser.MemberModifiersContext modifiersCtx) {
        if (modifiersCtx == null) return "public ";
        StringBuilder sb = new StringBuilder();
        boolean hasAccess = false;
        for (JhpParser.MemberModifierContext m : modifiersCtx.memberModifier()) {
            String text = m.getText().toLowerCase();
            if (text.equals("public") || text.equals("private") || text.equals("protected")) {
                sb.append(text).append(" ");
                hasAccess = true;
            } else if (text.equals("static") || text.equals("abstract") || text.equals("final")) {
                sb.append(text).append(" ");
            }
            // readonly 只用于属性，方法可忽略
        }
        if (!hasAccess) {
            sb.insert(0, "public "); // 默认 public
        }
        return sb.toString();
    }

    /**
     * 将方法参数列表 (ArgumentsContext) 转换为逗号分隔的表达式字符串
     */
    public static String generateArgumentsString(JhpParser.ArgumentsContext argsCtx, ExpressionProcessor exprProc, int indentLevel) {
        if (argsCtx == null || argsCtx.actualArgument() == null) return "";
        List<String> args = new ArrayList<>();
        for (JhpParser.ActualArgumentContext arg : argsCtx.actualArgument()) {
            if (arg.expression() != null) {
                args.add(exprProc.generateExpression(arg.expression(), indentLevel));
            }
        }
        return String.join(", ", args);
    }

    public static boolean isConstructor(String methodName) {
        return methodName.equals("__construct") || methodName.equals("Constructor");
    }

    public static boolean isMain(String methodName){
        return methodName.equalsIgnoreCase("main");
    }

    // JhpUtils.java 新增方法
    public static String convertExplicitTypeString(String typeString) {
        if (typeString == null || typeString.isEmpty()) return "Object";
        // 替换泛型语法：<: -> <, :> -> >
        String s = typeString.replace("<:", "<").replace(":>", ">");
        // 也可以用方括号，如果有需要一并替换
        // s = s.replace('[', '<').replace(']', '>');

        // 递归处理基本类型映射
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c == ',' || c == '<' || c == '>' || Character.isWhitespace(c)) {
                sb.append(c);
                i++;
            } else if (Character.isJavaIdentifierStart(c)) {
                int start = i;
                while (i < s.length() && Character.isJavaIdentifierPart(s.charAt(i))) {
                    i++;
                }
                String word = s.substring(start, i);
                String mapped = mapJhpTypeToJavaType(word);
                sb.append(mapped); // 如果是基本类型则映射，否则保持原样
            } else {
                // 跳过未知字符（理论上不会出现）
                sb.append(c);
                i++;
            }
        }
        return sb.toString();
    }

    public static String getFunctionalMethodSignature(String interfaceName, String returnType, String paramStr) {
        if (interfaceName.startsWith("Function<")) {
            return returnType + " apply(" + paramStr + ")";
        } else if (interfaceName.startsWith("Consumer<")) {
            return "void accept(" + paramStr + ")";
        } else if (interfaceName.startsWith("Supplier<")) {
            return returnType + " get()";
        } else if (interfaceName.equals("Runnable")) {
            return "void run()";
        } else {
            return returnType + " apply(" + paramStr + ")"; // 默认
        }
    }

    public static void generateClassAttribute(JhpParser.AttributesContext ctx , PrintWriter out, int indent) {
        for (JhpParser.AttributeGroupContext group : ctx.attributeGroup()) {
            for (JhpParser.AttributeContext attr : group.attribute()) {
                String indefierType = attr.qualifiedNamespaceName().getText();
                if(indefierType.equals("JavaDoc")){
                    JhpParser.ArgumentsContext args = attr.arguments();
                    if (args != null && args.actualArgument().size() > 0) {
                        for (JhpParser.ActualArgumentContext arg : args.actualArgument()){
                            JhpUtils.printIndent(out, indent);
                            String typeArg = arg.expression().getText();
                            System.err.println("DEBUG: typeArg = " + typeArg);
                            if (typeArg.startsWith("\"") || typeArg.startsWith("'")) {
                                typeArg = typeArg.substring(1, typeArg.length() - 1);
                            }
                            typeArg = typeArg.replaceAll("'", "\"");
                            out.println( typeArg );
                        }
                    }
                }
            }
        }
    }


    /**
     * 从参数的 attributes 中提取注解文本
     * 例如 #[JavaDoc(@RequestHeader(value = "token"))] → "@RequestHeader(value = "token") "
     */
    public static String generateParameterAnnotations(JhpParser.FormalParameterContext param) {
        JhpParser.AttributesContext attrs = param.attributes();
        if (attrs == null) return "";

        StringBuilder sb = new StringBuilder();
        for (JhpParser.AttributeGroupContext group : attrs.attributeGroup()) {
            for (JhpParser.AttributeContext attr : group.attribute()) {
                String name = attr.qualifiedNamespaceName().getText();
                if (name.equals("JavaDoc") || name.equals("\\JavaDoc")) {
                    JhpParser.ArgumentsContext args = attr.arguments();
                    if (args != null) {
                        for (JhpParser.ActualArgumentContext arg : args.actualArgument()) {
                            String annoText = arg.expression().getText();   // 例如 "@RequestHeader(value = "token")"
                            sb.append(annoText).append(" ");
                        }
                    }
                }
            }
        }
        return sb.toString();
    }
}
