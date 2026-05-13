package compiler;

import jhp.parser.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.*;


public class AtomicExpressionProcessor {
    private final PrintWriter out;
    private final ExpressionProcessor exprProc;
    private boolean staticContext = false;

    private boolean isRuntimeFunction(String name) {
        return BuiltinConfig.isRuntimeFunction(name);
    }

    public void setStaticContext(boolean v) {
        this.staticContext = v;
    }

    public AtomicExpressionProcessor(ExpressionProcessor exprProc, PrintWriter out) {
        this.exprProc = exprProc;
        this.out = out;
    }

    // 直接返回文本
    public String generateScalar(JhpParser.ScalarExpressionContext ctx, int indentLevel) { 
        if (ctx.constant() != null && ctx.constant().classConstant() != null) {
            // 类常量访问，如 self::PI、User::PI
            return translateClassConstant(ctx.constant().classConstant(), indentLevel);
        }

        // 双引号字符串（可能包含嵌入变量）
        if (ctx.string() != null) {
            return generateInterpolatedString(ctx.string(), indentLevel);
        }

        return ctx.getText();
    }        
    public String generateChain(JhpParser.ChainContext chain, int indent) {
        if (chain.chainOrigin() != null && chain.chainOrigin().functionCall() != null) {
            return generateFunctionCall(chain, indent);
        }

        System.err.println("DEBUG: Processing chain: " + chain.chainOrigin().chainBase().getText());
        // 处理 chainBase
        if (chain.chainOrigin().chainBase() != null) {
            JhpParser.ChainBaseContext base = chain.chainOrigin().chainBase();
            String result;

            if (base.qualifiedStaticTypeRef() != null) {
                String className = JhpUtils.qualifiedStaticTypeRefToJava(base.qualifiedStaticTypeRef());
                // 将 self/static 翻译的 "this" 替换为当前类名
                if ("this".equals(className)) {
                    String curClass = exprProc.getCurrentClassName();
                    if (curClass != null && !curClass.isEmpty()) {
                        className = curClass;
                    }
                }
                System.err.println("DEBUG: Processing qualified static type ref: " + base.qualifiedStaticTypeRef().getText() + " -> " + className);
                List<JhpParser.KeyedVariableContext> keyedVars = base.keyedVariable();
                if (!keyedVars.isEmpty()) {
                    JhpParser.KeyedVariableContext kv = keyedVars.get(0);
                    String propName;
                    if (kv.VarName() != null) {
                        propName = kv.VarName().getText().substring(1);
                    } else if (kv.Dollar() != null && !kv.Dollar().isEmpty()) {
                        propName = "(" + exprProc.generateExpression(kv.expression(), indent) + ")";
                    } else {
                        propName = kv.getText();
                    }
                    List<JhpParser.SquareCurlyExpressionContext> sqList = kv.squareCurlyExpression();
                    if (sqList.isEmpty()) {
                        result = className + "." + propName;
                    } else {
                        StringBuilder sb = new StringBuilder("JhpRuntime.arrayGet(")
                                .append(className).append(".").append(propName);
                        for (JhpParser.SquareCurlyExpressionContext sq : sqList) {
                            if (sq.expression() != null) {
                                sb.append(", ").append(exprProc.generateExpression(sq.expression(), indent));
                            }
                        }
                        sb.append(")");
                        result = sb.toString();
                    }
                } else {
                    result = className; // 没有 keyedVariable，直接是类名
                }
            } else {
                // 普通变量（如 $var）
                String varName = getBaseVarName(chain);
                // 在静态方法中禁止使用 $this->
                if ("this".equals(varName) && !chain.memberAccess().isEmpty() && staticContext) {
                    exprProc.fatalError("Error: Cannot use $this in static context. Translation aborted.");
                    return ""; // 不会执行到这里
                }
                List<String> subscripts = extractSubscripts(chain);
                result = varName;
                if (!subscripts.isEmpty()) {
                    String varType = exprProc.getVariableTypes(varName);
                    for (String index : subscripts) {
                        if (JhpUtils.isListType(varType)) {
                            result = result + ".get(" + index + ")";
                            varType = JhpUtils.extractElementType(varType);
                        } else if (JhpUtils.isMapType(varType)) {
                            result = result + ".get(" + index + ")";
                            varType = JhpUtils.extractElementType(varType);
                        } else {
                            result = "JhpRuntime.arrayGet(" + result + ", " + index + ")";
                            varType = "Object";
                        }
                    }
                }
            }
            // 统一处理后续的 memberAccess（-> 调用链）
            // 需要维护当前表达式的类型，以便生成高效的 .get() 调用
            String currentType = exprProc.getVariableTypes(result);  // result 现在是基础变量名（如 this 或 $var）
            for (JhpParser.MemberAccessContext ma : chain.memberAccess()) {
                // 获取访问器名称（不含下标）
                String accessor = getAccessorName(ma);

                // 如果是属性访问（无参数），尝试获取属性类型并更新 currentType
                if (ma.actualArguments() == null) {
                    String propType = exprProc.getVariableTypes(accessor);  // 从符号表获取属性类型
                    if (!"Object".equals(propType)) {
                        currentType = propType;   // 用于后续下标处理
                    } else {
                        currentType = "Object";   // 无法确定，降级
                    }
                } else {
                    // 方法调用，无法静态确定返回类型，暂用 Object
                    currentType = "Object";
                }

                // 先拼接属性/方法名（不带下标）
                result += generateMemberAccess(ma, indent);

                // 再处理该成员访问自带的方括号下标
                List<String> maSubscripts = extractMemberSubscripts(ma);
                for (String index : maSubscripts) {
                    if (JhpUtils.isListType(currentType)) {
                        result += ".get(" + index + ")";
                        currentType = JhpUtils.extractElementType(currentType); // 更新为元素类型
                    } else if (JhpUtils.isMapType(currentType)) {
                        result += ".get(" + index + ")";
                        currentType = JhpUtils.extractElementType(currentType); // 更新为值类型
                    } else {
                        result = "JhpRuntime.arrayGet(" + result + ", " + index + ")";
                        currentType = "Object";
                    }
                }
            }
            return result;
        }

        // 其他情况（如 (new expr)）
        return chain.getText(); // fallback
    }

    // 原有方法改为调用上面那个
    public String generateChain(JhpParser.ChainExpressionContext ctx, int indent) {
        return generateChain(ctx.chain(), indent);
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
 
        // 判断键值对：检查 arrayItem 是否显式包含 => （DoubleArrow token）
        boolean isMap = false;
        for (JhpParser.ArrayItemContext item : itemList.arrayItem()) {
            if (item.DoubleArrow() != null) {
                isMap = true;
                break;
            }
        }
        if (isMap) {
            return generateMapInit(itemList, indent);
        } else {
            return generateListInit(itemList, indent);
        }
    }

    public String generateListInit(JhpParser.ArrayItemListContext itemList, int indent) {
        if (itemList == null || itemList.arrayItem().isEmpty()) return "new ArrayList<>()";
        List<String> items = new ArrayList<>();
        for (JhpParser.ArrayItemContext item : itemList.arrayItem()) {
            JhpParser.ExpressionContext expr = item.expression(0); // 对于列表，每个item只有一个表达式
            if (expr != null) items.add(exprProc.generateExpression(expr, indent));
        }
        return "new ArrayList<>(Arrays.asList(" + String.join(", ", items) + "))";
    }

    public String generateMapInit(JhpParser.ArrayItemListContext itemList, int indent) {
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
        String args = generateArguments(funcCall.actualArguments(), indent);

        String methodPath;
        if (fcn.chainBase() != null) {
            // 闭包变量调用，如 $func() → func.apply() 或 run()
            String varName = fcn.chainBase().getText().replace("$", "").trim();
            // 查询变量类型
            String varType = exprProc.getVariableTypes(varName);
            String methodName = getFunctionalMethodName(varType);
            methodPath = varName + "." + methodName;
        } else {
            methodPath = extractFunctionName(fcn, indent);
        }

        //检查并处理内置运行时函数
        if (isRuntimeFunction(methodPath)) {
            methodPath = "JhpRuntime." + methodPath;
        }

        StringBuilder result = new StringBuilder(methodPath).append("(").append(args).append(")");
        for (JhpParser.MemberAccessContext ma : chain.memberAccess()) {
            result.append(generateMemberAccess(ma, indent));
        }
        return result.toString();
    }

    /**
     * 根据函数式接口类型返回对应的抽象方法名
     */
    private String getFunctionalMethodName(String type) {
        if (type == null) return "apply";
        if (type.startsWith("Function<")) return "apply";
        if (type.startsWith("Consumer<")) return "accept";
        if (type.startsWith("Supplier<")) return "get";
        if (type.equals("Runnable")) return "run";
        // 其他未知接口默认使用 apply
        return "apply";
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
             // 特殊类名映射
            if (fullName.equalsIgnoreCase("self")) {
                return "this";
            }
            if (fullName.equalsIgnoreCase("parent")) {
                return "super";
            }
            if (fullName.equalsIgnoreCase("static")) {
                return "this";   // 后期静态绑定，当前作为 this 处理
            }
            // 将剩余反斜杠替换为 .
            fullName = fullName.replace("\\", ".");
            return fullName;
        } else if (fcn.classConstant() != null) {
            JhpParser.ClassConstantContext cc = fcn.classConstant();
            if (cc.Parent_() != null || cc.Class() != null) {
                // Parent_ :: method 等，暂不处理，返回原样
                String prefix = "";
                if (cc.Parent_() != null) {
                    prefix = "super";  // parent 对应 Java 的 super
                } else if (cc.Class() != null) {
                    prefix = "this";   // class 对应 Java 的 this（静态上下文暂不考虑）
                }
                // 获取右侧方法名或关键字（Constructor、Get、Set 等）
                String right = "";
                System.err.println("DEBUG: Processing class constant function call: " + cc.Constructor());
                if (cc.Constructor() != null) {
                    // 构造方法：直接返回 "super" 或 "this"，后面会自动拼括号和参数
                    return prefix;
                } else if (cc.identifier() != null) {
                    String id = cc.identifier().getText();
                    if (id.equals("__construct")) {
                        return prefix; // 构造调用
                    } else {
                        right = id;
                    }
                } else if (cc.Get() != null) {
                    right = cc.Get().getText();
                } else if (cc.Set() != null) {
                    right = cc.Set().getText();
                }
                return prefix + "." + right;
            }
            // 左侧是 qualifiedStaticTypeRef 或 keyedVariable 或 string
            String leftPart;
            if (cc.qualifiedStaticTypeRef() != null) {
                leftPart = JhpUtils.qualifiedStaticTypeRefToJava(cc.qualifiedStaticTypeRef());
                if ("this".equals(leftPart)) {
                    String curClass = exprProc.getCurrentClassName();
                    if (curClass != null && !curClass.isEmpty()) {
                        leftPart = curClass;
                    }
                }
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
            // $var() 调用
            JhpParser.ChainBaseContext base = fcn.chainBase();
            if (base.keyedVariable() != null && !base.keyedVariable().isEmpty()) {
                String varText = base.keyedVariable().get(0).getText();
                if (varText.startsWith("$")) {
                    varText = varText.substring(1);
                }
                return varText;
            }
            // 若无法提取，直接回退到文本
            return fcn.chainBase().getText();
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
        String accessor = getAccessorName(ctx);
        String base = "." + accessor;
        if (ctx.actualArguments() != null) {
            base += "(" + generateArguments(ctx.actualArguments(), indent) + ")";
        }
        return base;
    }

    private String generateConstant(JhpParser.ConstantContext c) {
        if (c == null) {
            System.err.println("Internal error: null constant context");
            return "null /* ERROR */";
        }
        if (c.Null() != null) return "null";
        if (c.literalConstant() != null) {
            // literalConstant 包括 Real, BooleanConstant, numericConstant, stringConstant
            // 直接返回文本（例如数字、true/false、Label）
            return c.literalConstant().getText();
        }
        if (c.magicConstant() != null) {
            exprProc.fatalError("Error: magic constants are not supported as constant values.");
            return "/* ERROR */ null";
        }
        if (c.classConstant() != null) {
            exprProc.fatalError("Error: class constants are not supported as constant values.");
            return "/* ERROR */ null";
        }
        if (c.qualifiedNamespaceName() != null) {
            exprProc.fatalError("Error: qualified namespace names are not supported as constant values.");
            return "/* ERROR */ null";
        }
        return c.getText(); // fallback
    }

    public String generateConstantInitializer(JhpParser.ConstantInitializerContext ctx, int indent) {
        // 1. constant 或 string
        if (!ctx.constant().isEmpty()) {
            JhpParser.ConstantContext c = ctx.constant(0);
            if (c == null) {
                exprProc.fatalError("Error: constant context is null in: " + ctx.getText());
                return "null /* ERROR */";
            }
            return generateConstant(c);
        }
        if (!ctx.string().isEmpty()) {
            return ctx.string(0).getText();   // 原样返回字符串字面量
        }

        // 2. 数组字面量
        if (ctx.OpenSquareBracket() != null || ctx.Array() != null) {
            JhpParser.ArrayItemListContext itemList = null;
            for (ParseTree child : ctx.children) {
                if (child instanceof JhpParser.ArrayItemListContext) {
                    itemList = (JhpParser.ArrayItemListContext) child;
                    break;
                }
            }
            if (itemList != null) {
                boolean isMap = false;
                // 检查是否存在任何 arrayItem 包含 =>（DoubleArrow token）
                for (JhpParser.ArrayItemContext item : itemList.arrayItem()) {
                    if (item.DoubleArrow() != null) {
                        isMap = true;
                        break;
                    }
                }
                if (isMap) {
                    return generateMapInit(itemList, indent);
                } else {
                    return generateListInit(itemList, indent);
                }
            }
            return "new Object[]{}";
        }

        // 3. 一元正负号
        if (ctx.getChild(0).getText().equals("+") || ctx.getChild(0).getText().equals("-")) {
            String sign = ctx.getChild(0).getText();
            JhpParser.ConstantInitializerContext inner = (JhpParser.ConstantInitializerContext) ctx.getChild(1);
            if (inner == null) {
                exprProc.fatalError("Error: inner constant initializer is null in: " + ctx.getText());
                return "null /* ERROR */";
            }
            return sign + generateConstantInitializer(inner, indent);
        }

        // 4. 字符串连接 (string | constant) ('.' (string | constant))*
        //    直接遍历子节点拼接，如果出现 constant 则调用 generateConstant，并检查 null
        StringBuilder sb = new StringBuilder();
        for (ParseTree child : ctx.children) {
            if (child instanceof TerminalNode && child.getText().equals(".")) {
                sb.append(" + ");
            } else if (child instanceof JhpParser.StringContext) {
                sb.append(((JhpParser.StringContext) child).getText());
            } else if (child instanceof JhpParser.ConstantContext) {
                JhpParser.ConstantContext cc = (JhpParser.ConstantContext) child;
                if (cc == null) {  // 防御
                    exprProc.fatalError("Error: null constant in concat: " + ctx.getText());
                    sb.append("null /* ERROR */");
                } else {
                    sb.append(generateConstant(cc));
                }
            }
        }
        if (sb.length() > 0) return sb.toString();

        // 5. 其他未知情况
        exprProc.fatalError("Unknown constant initializer: " + ctx.getText());
        return "null /* ERROR */";
    }

    // 提取无下标的成员名
    private String getAccessorName(JhpParser.MemberAccessContext ma) {
        if (ma.keyedFieldName() != null) {
            JhpParser.KeyedFieldNameContext kfn = ma.keyedFieldName();
            if (kfn.keyedSimpleFieldName() != null) {
                JhpParser.KeyedSimpleFieldNameContext ksn = kfn.keyedSimpleFieldName();
                if (ksn.identifier() != null) {
                    return ksn.identifier().getText();
                }
            }
        }
        // fallback
        return ma.keyedFieldName().getText().replaceAll("\\[.*?\\]", "");
    }

    // 在 AtomicExpressionProcessor 中新增
    private List<String> extractMemberSubscripts(JhpParser.MemberAccessContext ma) {
         List<String> indices = new ArrayList<>();
        if (ma.keyedFieldName() != null && ma.keyedFieldName().keyedSimpleFieldName() != null) {
            for (JhpParser.SquareCurlyExpressionContext sq : ma.keyedFieldName().keyedSimpleFieldName().squareCurlyExpression()) {
                if (sq.expression() != null) {
                    indices.add(exprProc.generateExpression(sq.expression(), 0));
                }
            }
        }
        return indices;
    }

    /**
     * 将 PHP 的类常量（self::CONST、User::CONST）翻译为 Java 的 ClassName.CONST
     */
    private String translateClassConstant(JhpParser.ClassConstantContext cc, int indent) {
        // 左侧可能是 Class/Parent_ 关键字，或者是具体的类名 / self / parent 等
        String left;
        if (cc.Class() != null) {
            left = "this";               // PHP 的 class::CONST，通常等价于 self::CONST
        } else if (cc.Parent_() != null) {
            left = "super";              // 父类的常量
        } else if (cc.qualifiedStaticTypeRef() != null) {
            left = JhpUtils.qualifiedStaticTypeRefToJava(cc.qualifiedStaticTypeRef());
        } else if (cc.keyedVariable() != null && !cc.keyedVariable().isEmpty()) {
            // 动态类名，暂不支持，保留原样
            return cc.getText();
        } else if (cc.string() != null) {
            // 字符串做类名，保留原样
            return cc.getText();
        } else {
            return cc.getText();
        }

        // 将 self/static 翻译为当前类名（常量必须在静态上下文中访问，所以不用 this）
        if ("this".equals(left)) {
            String curClass = exprProc.getCurrentClassName();
            if (curClass != null && !curClass.isEmpty()) {
                left = curClass;
            }
        }

        // 右侧：常量名
        String right;
        if (cc.identifier() != null) {
            right = cc.identifier().getText();
        } else if (cc.keyedVariable() != null && !cc.keyedVariable().isEmpty()) {
            right = cc.keyedVariable(0).getText().replace("$", ""); // 动态常量名
        } else {
            return cc.getText();
        }

        return left + "." + right;
    }

    public String generateLambda(JhpParser.LambdaFunctionExpressionContext ctx, int indent) {
        JhpParser.LambdaFunctionExprContext lambda = ctx.lambdaFunctionExpr();
        List<String> paramNames = new ArrayList<>();
        if (lambda.formalParameterList() != null) {
            for (JhpParser.FormalParameterContext p : lambda.formalParameterList().formalParameter()) {
                paramNames.add(p.variableInitializer().VarName().getText().substring(1));
            }
        }
        String body = exprProc.generateExpression(lambda.expression(), indent);
        String params;
        if (paramNames.isEmpty()) params = "()";
        else if (paramNames.size() == 1) params = paramNames.get(0);
        else params = "(" + String.join(", ", paramNames) + ")";
        return params + " -> " + body;
    }

    // 处理双引号字符串，生成 Java 字符串连接表达式
    private String generateInterpolatedString(JhpParser.StringContext stringCtx, int indent) {
        List<JhpParser.InterpolatedStringPartContext> parts = new ArrayList<>();
        // 单引号字符串或 heredoc 直接返回原文本
        if (stringCtx.SingleQuoteString() != null || stringCtx.StartNowDoc() != null) {
            String text = "";
            if(stringCtx.SingleQuoteString() != null){
                text = stringCtx.SingleQuoteString().getText();
            }
            if (stringCtx.StartNowDoc() != null){
                for(TerminalNode terminalNode: stringCtx.HereDocText()){
                    text += terminalNode.getText();
                }
                System.err.println("DEBUG: StartNowDoc: " + text);
            }
            return convertSingleQuotedToJavaString(text);
        } else if (stringCtx.StartHereDoc() != null) {
            // HereDoc需要支持变量插值，将所有文本行拼接后解析
            StringBuilder combinedContent = new StringBuilder();
            for (TerminalNode terminalNode : stringCtx.HereDocText()) {
                combinedContent.append(terminalNode.getText());
            }
            System.err.println("DEBUG: interpolated string: is StartHereDoc");
            // 使用统一的插值处理逻辑
            return processInterpolatedContent(combinedContent.toString(), indent);
        }else {
            System.err.println("DEBUG: interpolated string: is interpolatedStringPart");
            parts = stringCtx.interpolatedStringPart();
        }

        if (parts.isEmpty()) {
            // 纯双引号字符串，没有嵌入，直接作为 Java 字符串字面量返回
            return "\"" + escapeJavaString(stringCtx.getText().substring(1, stringCtx.getText().length()-1)) + "\"";
        }

        StringBuilder sb = new StringBuilder();
        String pendingVar = null;   // 暂存变量名（例如 "this"），等待合并后续的 ->prop
        System.out.println("DEBUG: interpolated string: " + stringCtx.getText());
        System.out.println("DEBUG: interpolated string: " + parts.size());
        for (int i = 0; i < parts.size(); i++) {
            JhpParser.InterpolatedStringPartContext part = parts.get(i);
//            System.err.println("part: " + part.getText());
            if (part.StringPart() != null) {
                String text = part.StringPart().getText();
//                System.err.println("DEBUG: string part: " + text);
                if (pendingVar != null && text.startsWith("->")) {
                    // 变量紧跟 ->prop，合并属性访问
                    String remaining = text;
                    while (remaining.startsWith("->")) {
                        int end = 2; // 指向 '>' 之后的第一字符
                        while (end < remaining.length() && Character.isJavaIdentifierPart(remaining.charAt(end))) {
                            end++;
                        }
                        String propName = remaining.substring(2, end);
                        pendingVar += "." + propName;
                        remaining = remaining.substring(end);
                    }
                    // 输出合并后的变量
                    sb.append(pendingVar);
                    pendingVar = null;
                    // 剩余部分作为普通字符串拼接
                    if (!remaining.isEmpty()) {
                        sb.append(" + \"").append(escapeJavaString(remaining)).append("\" + ");
                    } else {
                        sb.append(" + ");
                    }
                } else {
                    // 普通字符串：先输出pendingVar（如果存在），再输出普通字符串
                    if (pendingVar != null) {
                        sb.append(pendingVar).append(" + ");
                        pendingVar = null;
                    }
                    // 普通字符串
                    sb.append("\"").append(escapeJavaString(text)).append("\" + ");
                }
            } else if (part.chain() != null) {
                JhpParser.ChainContext c = part.chain();
                String simpleVar = extractVariableNameFromChain(c);
                if (simpleVar != null) {
                    // 简单变量暂存，等待后续 StringPart 合并 ->prop
                    pendingVar = simpleVar;
                } else {
                    // 复杂链（有函数调用、下标或已包含属性访问）直接生成完整表达式
                    String javaCode = exprProc.generateChainCode(c, indent);
                    sb.append(javaCode).append(" + ");
                    pendingVar = null;
                }
            } else if (part.UnicodeEscape() != null) {
                String uni = part.UnicodeEscape().getText();
                String hex = uni.replaceAll("\\\\u\\{|\\}", "");
                try {
                    int codepoint = Integer.parseInt(hex, 16);
                    sb.append("\"").append(new String(Character.toChars(codepoint))).append("\" + ");
                } catch (NumberFormatException e) {
                    sb.append("\"").append(uni).append("\" + ");
                }
                pendingVar = null;
            }
        }

        // 最后一个待输出的变量
        if (pendingVar != null) {
            sb.append(pendingVar);
        }

        String result = sb.toString().trim();
        if (result.endsWith("+")) {
            result = result.substring(0, result.length() - 1).trim();
        }
        // 如果没有拼接变量，直接返回纯字符串
        if (result.startsWith("\"") && !result.contains("+")) {
            return result;
        }
        return result;
    }

    /**
     * 处理包含变量插值的字符串内容（用于HereDoc和双引号字符串）
     * 支持：$varName、$this->prop、$obj->prop1->prop2 等格式
     * @param content 原始字符串内容（包含换行符）
     * @param indent 缩进级别
     * @return Java字符串表达式
     */
    private String processInterpolatedContent(String content, int indent) {
        // 使用正则表达式匹配PHP变量
        // 匹配模式：$varName 或 $varName->prop1->prop2...
        java.util.regex.Pattern varPattern = java.util.regex.Pattern.compile(
                "\\$([a-zA-Z_][a-zA-Z0-9_]*)(?:->([a-zA-Z_][a-zA-Z0-9_]*(?:->[a-zA-Z_][a-zA-Z0-9_]*)*)?)?"
        );
        java.util.regex.Matcher matcher = varPattern.matcher(content);

        StringBuilder sb = new StringBuilder();
        int lastEnd = 0;

        while (matcher.find()) {
            // 添加变量前的普通文本
            String beforeVar = content.substring(lastEnd, matcher.start());
            if (!beforeVar.isEmpty()) {
                sb.append("\"").append(escapeJavaString(beforeVar)).append("\" + ");
            }

            // 提取变量名和属性链
            String varName = matcher.group(1);
            String propChain = matcher.group(2);

            // 构建完整的Java表达式
            String javaExpr = varName;
            if (propChain != null && !propChain.isEmpty()) {
                // 将 PHP 的 -> 转换为 Java 的 .
                javaExpr += "." + propChain.replace("->", ".");
            }

            sb.append(javaExpr).append(" + ");

            lastEnd = matcher.end();
        }

        // 添加剩余的文本
        String afterLastVar = content.substring(lastEnd);
        if (!afterLastVar.isEmpty()) {
            sb.append("\"").append(escapeJavaString(afterLastVar)).append("\"");
        }

        String result = sb.toString();
        // 清理末尾的 " + "
        if (result.endsWith(" + ")) {
            result = result.substring(0, result.length() - 3);
        }

        // 如果没有任何变量，直接返回纯字符串
        if (!result.contains(" + ")) {
            return "\"" + escapeJavaString(content) + "\"";
        }

        return result;
    }


    /**
     * 如果 chain 是一个不带任何成员访问和函数调用的简单变量（如 $this、$name），
     * 则返回去掉 $ 前缀的变量名；否则返回 null。
     */
    private String extractVariableNameFromChain(JhpParser.ChainContext chain) {
        if (chain.chainOrigin() != null && chain.chainOrigin().chainBase() != null) {
            JhpParser.ChainBaseContext base = chain.chainOrigin().chainBase();
            // 只有 keyedVariable 且没有 memberAccess 和 actualArguments 才是简单变量
            if (base.keyedVariable() != null && !base.keyedVariable().isEmpty() && chain.memberAccess().isEmpty()) {
                String varText = base.keyedVariable(0).getText();
                if (varText.startsWith("$")) {
                    varText = varText.substring(1);
                }
                return varText;
            }
        }
        return null;
    }

    //将 PHP 字符串内容中的特殊字符转义为 Java 字符串兼容形式
    private String escapeJavaString(String phpString) {
        if (phpString == null) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < phpString.length(); i++) {
            char c = phpString.charAt(i);
            switch (c) {
                case '\\':
                    sb.append("\\\\"); break;
                case '"':
                    sb.append("\\\""); break;
                case '\n':
                    sb.append("\\n"); break;
                case '\r':
                    sb.append("\\r"); break;
                case '\t':
                    sb.append("\\t"); break;
                default:
                    sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * 解析 PHP 单引号字符串的内容（去掉首尾单引号，处理 \\ 和 \' 转义），返回实际字符串。
     */
    private String unescapePhpSingleQuotedString(String raw) {
        String inner = raw.substring(1, raw.length() - 1); // 去掉首尾单引号
        StringBuilder sb = new StringBuilder();
        int len = inner.length();
        for (int i = 0; i < len; i++) {
            char c = inner.charAt(i);
            if (c == '\\' && i + 1 < len) {
                char next = inner.charAt(i + 1);
                if (next == '\\') {
                    sb.append('\\');
                    i++;
                } else if (next == '\'') {
                    sb.append('\'');
                    i++;
                } else {
                    // PHP 单引号字符串中，除 \\ 和 \' 外，反斜杠不具转义作用，原样保留
                    sb.append(c);
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * 将 PHP 单引号字符串转换为 Java 双引号字符串字面量。
     */
    private String convertSingleQuotedToJavaString(String raw) {
        String actual = unescapePhpSingleQuotedString(raw);
        // escapeJavaString 会将 \、" 等特殊字符转义，然后包裹双引号
        return "\"" + escapeJavaString(actual) + "\"";
    }

}
