package compiler;

import jhp.parser.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class AtomicExpressionProcessor {
    private final PrintWriter out;
    private final ExpressionProcessor exprProc;
    private boolean staticContext = false;

    public void setStaticContext(boolean v) {
        this.staticContext = v;
    }

    public AtomicExpressionProcessor(ExpressionProcessor exprProc, PrintWriter out) {
        this.exprProc = exprProc;
        this.out = out;
    }

    // 直接返回文本
    public String generateScalar(JhpParser.ScalarExpressionContext ctx, int indentLevel) { 
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
                            result = "runtime.JhpRuntime.arrayGet(" + result + ", " + index + ")";
                            varType = "Object";
                        }
                    }
                }
            }

            // 统一处理后续的 memberAccess（-> 调用链）
            for (JhpParser.MemberAccessContext ma : chain.memberAccess()) {
                result += generateMemberAccess(ma, indent);
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
        
        // 解析方法名（可能包含完整限定路径）
        String methodPath = extractFunctionName(fcn, indent);
        String args = generateArguments(funcCall.actualArguments(), indent);
        
        // 基础调用：methodPath(args)
        StringBuilder result = new StringBuilder(methodPath).append("(").append(args).append(")");
        
        // 处理后续的 memberAccess（-> 调用链）
        // for (JhpParser.MemberAccessContext memberAccess : chain.memberAccess()) {
        //     result.append(generateMemberAccess(memberAccess, indent));
        // }
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
        if (ctx.actualArguments() != null) {
        // 有括号，是方法调用
        String args = generateArguments(ctx.actualArguments(), indent);
        return "." + methodName + "(" + args + ")";
        } else {
            // 无括号，是属性访问
            return "." + methodName;
        }
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

}
