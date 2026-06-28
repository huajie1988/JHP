package compiler;

import jhp.parser.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.PrintWriter;
import java.util.*;
import java.util.function.Function;

public class VariableProcessor {

    private final PrintWriter out;
    private ExpressionProcessor exprProc;
    // 符号表：变量名 -> 类型
    private final Map<String, String> varTypes = new HashMap<>();
    // 临时存储当前待处理的属性（用于下一个语句）
    private List<JhpParser.AttributeGroupContext> currentAttributes = new ArrayList<>();
    // 在 VariableProcessor 中添加
    private final Map<String, String> funcReturnTypes = new HashMap<>();

    // 新增字段
    private String currentClassName = null;

    private List<String> currentTypeParameters = new ArrayList<>();

    // 存储类定义的泛型参数名列表，key=类名，value=有序参数名（如 ["T"] 或 ["K","V"]）
    private Map<String, List<String>> classTypeParamNames = new HashMap<>();

    // 存储变量的泛型实参绑定，key=变量名，value=参数名→实参类型字符串
    private Map<String, Map<String, String>> varGenericBindings = new HashMap<>();

    private GlobalSymbolTable globalTable;

    // 符号表快照栈，用于作用域管理
    private Deque<Map<String, String>> scopeStack = new ArrayDeque<>();

    private final Function<String, String> typeShortener;

    public VariableProcessor(PrintWriter out, Function<String, String> typeShortener) {
        this.out = out;
        this.typeShortener = typeShortener;
    }

    public void setCurrentClassName(String className) {
        this.currentClassName = className;
    }

    public String getCurrentClassName() {
        return this.currentClassName;
    }
    public void setExprProcessor(ExpressionProcessor exprProc) {
        this.exprProc = exprProc;
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
            return JhpUtils.getVarNameFromChain(((JhpParser.ChainExpressionContext) ctx).chain());
        }
        return ctx.getText();
    }

    /**
     * 判断左值是否包含对象成员访问（->）
     */
    private boolean hasMemberAccess(JhpParser.AssignableContext ctx) {
        if (ctx.chain() != null) {
            return !ctx.chain().memberAccess().isEmpty();
        }
        return false;
    }

    /**
     * 处理赋值语句，生成 Java 声明或赋值代码
     */

    public void handleAssignment(JhpParser.AssignmentExpressionContext ctx, int indentLevel) {
        JhpParser.AssignableContext assignable = ctx.assignable();
        JhpParser.ExpressionContext rightExpr = ctx.expression();
        String assignOp = ctx.assignmentOperator().getText();

        System.err.println("DEBUG: Assignment operator is '" + assignOp + "'");

        if (assignOp.equals("=")) {
            if (isStaticPropertyAssignable(assignable)) {
                // 静态属性赋值：生成 ClassName.prop = right;
                String leftCode = exprProc.generateChainCode(assignable.chain(), indentLevel);
                String rightCode = exprProc.generateExpression(rightExpr, indentLevel);
                JhpUtils.printIndent(out, indentLevel);
                out.printf("%s = %s;%n", leftCode, rightCode);
            } else if (isIndexedAssignable(ctx.assignable())) {
                handleIndexedAssignment(ctx, indentLevel);
            } else if (hasMemberAccess(assignable)) {
                // 对象属性 / 方法链赋值
                String leftCode = exprProc.generateChainCode(assignable.chain(), indentLevel);
                String rightCode = exprProc.generateExpression(rightExpr, indentLevel);
                JhpUtils.printIndent(out, indentLevel);
                out.printf("%s = %s;%n", leftCode, rightCode);
            } else {
                // 普通变量
                String leftVar = JhpUtils.getAssignableVarName(assignable);
                handleSimpleAssignment(leftVar, rightExpr, indentLevel);
            }
        } else {
            if (isStaticPropertyAssignable(assignable)) {
                String leftCode = exprProc.generateChainCode(assignable.chain(), indentLevel);
                String rightCode = exprProc.generateExpression(rightExpr, indentLevel);
                String baseOp = assignOp.substring(0, assignOp.length() - 1);
                String javaOp = baseOp.equals(".") ? "+" : baseOp;
                JhpUtils.printIndent(out, indentLevel);
                out.printf("%s %s= %s;%n", leftCode, javaOp, rightCode);
            } else if (isIndexedAssignable(ctx.assignable())) {
                System.err.println("Compound assignment on array element is not supported yet.");
                // 暂时忽略，或可扩展为 取值 -> 运算 -> 赋值
            } else if (hasMemberAccess(assignable)) {
                String leftCode = exprProc.generateChainCode(assignable.chain(), indentLevel);
                String rightCode = exprProc.generateExpression(rightExpr, indentLevel);
                String baseOp = assignOp.substring(0, assignOp.length() - 1);
                String javaOp = baseOp.equals(".") ? "+" : baseOp;
                JhpUtils.printIndent(out, indentLevel);
                out.printf("%s %s= %s;%n", leftCode, javaOp, rightCode);
            } else {
                String leftVar = JhpUtils.getAssignableVarName(assignable);
                handleCompoundAssignment(leftVar, assignOp, rightExpr, indentLevel);
            }
        }
    }

    /**
     * 判断 assignable 是否包含下标访问（如 $arr[0]）
     */
    private boolean isIndexedAssignable(JhpParser.AssignableContext ctx) {
        if (ctx.chain() != null) {
            JhpParser.ChainContext chain = ctx.chain();
            JhpParser.ChainOriginContext origin = chain.chainOrigin();
            if (origin != null && origin.chainBase() != null) {
                JhpParser.ChainBaseContext base = origin.chainBase();
                List<JhpParser.KeyedVariableContext> keyedVars = base.keyedVariable();
                if (keyedVars != null && !keyedVars.isEmpty()) {
                    return !keyedVars.get(0).squareCurlyExpression().isEmpty();
                }
            }
        }
        return false;
    }

    /**
     * 处理数组/Map 下标赋值（如 $arr[0] = 5）
     */
    private void handleIndexedAssignment(JhpParser.AssignmentExpressionContext ctx, int indentLevel) {
        JhpParser.AssignableContext assignable = ctx.assignable();

        JhpParser.ChainContext chain = assignable.chain();
        // String baseVar = JhpUtils.getVarNameFromChain(chain);

        // 使用 generateChainCode 生成左值的基础部分（不包含下标），因为下标我们需要单独提取
        // 更好的做法：直接生成无下标时的左值代码，然后再加上下标调用 arraySet
        // 但 generateChainCode 会把下标也翻译成 get() 调用，这不符合赋值的需求。
        // 所以我们需要一个方法生成“不带下标”的链代码。
        // 简单起见：如果 chain.chainOrigin.chainBase 中有 qualifiedStaticTypeRef，就是静态属性，否则就是普通变量
        String leftCode;
        if (chain.chainOrigin().chainBase().qualifiedStaticTypeRef() != null) {
            // 静态属性
            String className = JhpUtils.qualifiedStaticTypeRefToJava(chain.chainOrigin().chainBase().qualifiedStaticTypeRef());
            JhpParser.KeyedVariableContext kv = chain.chainOrigin().chainBase().keyedVariable(0);
            String propName = kv.VarName().getText().substring(1); // 去掉 $
            leftCode = className + "." + propName;
        } else {
            leftCode = JhpUtils.getVarNameFromChain(chain); // 普通变量
        }

        // 提取所有下标表达式
        List<String> indices = new ArrayList<>();

        JhpParser.ChainOriginContext origin = chain.chainOrigin();
        if (origin != null && origin.chainBase() != null) {
            JhpParser.ChainBaseContext base = origin.chainBase();
            List<JhpParser.KeyedVariableContext> keyedVars = base.keyedVariable();
            if (keyedVars != null && !keyedVars.isEmpty()) {
                for (JhpParser.SquareCurlyExpressionContext sq : keyedVars.get(0).squareCurlyExpression()) {
                    if (sq.expression() != null) {
                        indices.add(exprProc.generateExpression(sq.expression(), indentLevel));
                    }
                }
            }
        }

        String rightCode = exprProc.generateExpression(ctx.expression(), indentLevel);

        // 生成 JhpRuntime.arraySet(leftCode, index1, index2, …, rightCode)
        StringBuilder sb = new StringBuilder();
        sb.append("JhpRuntime.arraySet(").append(leftCode);
        for (String idx : indices) {
            sb.append(", ").append(idx);
        }
        sb.append(", ").append(rightCode).append(");");

        JhpUtils.printIndent(out, indentLevel);
        out.println(sb.toString());
    }

    public void handleSimpleAssignment(String leftVar, JhpParser.ExpressionContext rightExpr, int indentLevel) {

        // 优先从属性中获取类型
        String explicitType = null;
        if (!currentAttributes.isEmpty()) {
            explicitType = extractTypeFromAttributes(currentAttributes);
            currentAttributes.clear();
        }

        String rightType = (explicitType != null) ? explicitType : exprProc.inferTypeFromExpression(rightExpr);
        System.err.println("DEBUG: inferred type for " + rightExpr.getText() + " is " + rightType);
        rightType = typeShortener.apply(rightType);   // 短化
        String rightCode = exprProc.generateExpression(rightExpr, indentLevel);

        // 泛型绑定建立
        if (rightExpr instanceof JhpParser.NewExpressionContext) {
            JhpParser.NewExpressionContext newCtx = (JhpParser.NewExpressionContext) rightExpr;
            if (newCtx.newExpr().typeRef() != null) {
                String className = extractClassNameFromType(rightType);
                List<String> paramNames = getClassTypeParamNames(className);
//                System.err.println("DEBUG: new expression1111: " + rightExpr.getText());
//                System.err.println("DEBUG: new expression2222: " + paramNames+","+className);
                if (!paramNames.isEmpty() && rightType.contains("<")) {
                    Map<String, String> bindings = buildGenericBindings(rightType, paramNames);
                    System.err.println("DEBUG: building generic bindings for " + className + ": "+leftVar + "," + bindings);
                    setVarGenericBinding(leftVar, bindings);
                }
            }
        } else if (rightExpr instanceof JhpParser.ChainExpressionContext) {
            // 变量赋值传递绑定（例如 $box2 = $box1）
            String sourceVar = JhpUtils.getVarNameFromChain(((JhpParser.ChainExpressionContext) rightExpr).chain());
            Map<String, String> sourceBinding = getVarGenericBinding(sourceVar);
            if (!sourceBinding.isEmpty()) {
                setVarGenericBinding(leftVar, sourceBinding);
            }
        }

        if (!varTypes.containsKey(leftVar)) {
            System.err.println("DEBUG: declaring " + leftVar + " as " + rightType);
            // 首次声明
            declareVariable(leftVar, rightType);
            JhpUtils.printIndent(this.out, indentLevel);
            out.printf("%s %s = %s;%n", rightType, leftVar, rightCode);
        } else {
            System.err.println("DEBUG: re-assigning " + leftVar + " as " + rightType);
            String declaredType = varTypes.get(leftVar);
            // 新增：如果旧类型是 Object，而新类型不是，则覆盖并视为声明
            if ("Object".equals(declaredType) && !"Object".equals(rightType)) {
                varTypes.put(leftVar, rightType);
                JhpUtils.printIndent(out, indentLevel);
                out.printf("%s %s = %s;%n", rightType, leftVar, rightCode);
                return;
            }
            if (declaredType.equals(rightType) || (declaredType.equals("Double") && rightType.equals("Integer"))) {
                JhpUtils.printIndent(out, indentLevel);
                out.printf("%s = %s;%n", leftVar, rightCode);
            } else {
                System.err.println("Warning: type mismatch...");
                JhpUtils.printIndent(out, indentLevel);
                out.printf("%s = (%s) %s;%n", leftVar, declaredType, rightCode);
            }
        }
    }

    private void handleCompoundAssignment(String leftVar, String assignOp, JhpParser.ExpressionContext rightExpr, int indentLevel) {
        
        if (!varTypes.containsKey(leftVar)) {
            System.err.println("Error: variable " + leftVar + " is not declared, cannot use " + assignOp);
            return;
        }

        String baseOp = assignOp.substring(0, assignOp.length() - 1);
        
        String javaOp;
        if (baseOp.equals(".")) {
            javaOp = "+";
        } else {
            javaOp = baseOp;
        }

        String rightCode = exprProc.generateExpression(rightExpr, indentLevel);
        
        JhpUtils.printIndent(out, indentLevel);
        out.printf("%s %s= %s;%n", leftVar, javaOp, rightCode);
    }

    public String extractTypeFromAttributes() {
        if (!currentAttributes.isEmpty()) {
            String type = extractTypeFromAttributes(currentAttributes);
            currentAttributes.clear();
            return type;
        }
        return null;
    }


    public String extractTypeFromAttributes(List<JhpParser.AttributeGroupContext> attrs) {
        for (JhpParser.AttributeGroupContext group : attrs) {
            for (JhpParser.AttributeContext attr : group.attribute()) {
                System.err.println("DEBUG: attribute = " + attr.getText());
                String name = attr.qualifiedNamespaceName().getText();
                System.err.println("DEBUG: attribute name = " + name);
                if (name.equals("Type") || name.equals("\\Type")) {
                    JhpParser.ArgumentsContext args = attr.arguments();
                    if (args != null && args.actualArgument().size() > 0) {
                        JhpParser.ActualArgumentContext argCtx = args.actualArgument(0);
                        String typeArg = extractTypeWithGenerics(argCtx);
                        System.err.println("DEBUG: typeArg = " + typeArg);
                        if (typeArg.startsWith("\"") || typeArg.startsWith("'")) {
                            typeArg = typeArg.substring(1, typeArg.length() - 1);
                        }
                        return JhpUtils.convertExplicitTypeString(typeArg);
                    }
                }
            }
        }
        return null;
    }

    private String extractTypeWithGenerics(JhpParser.ActualArgumentContext argCtx) {
        if (argCtx.typeRefWithGenerics() != null) {
            JhpParser.TypeRefWithGenericsContext typeRefCtx = argCtx.typeRefWithGenerics();
            String baseType = typeRefCtx.qualifiedNamespaceName().getText();
            String generics = typeRefCtx.genericDynamicArgs().getText();
            return baseType + generics;
        }

        if (argCtx.expression() != null) {
            return argCtx.expression().getText();
        }

        return "";
    }


    public String getVariableType(String varName) { 
        String key = varName;

        // 1. 先查找局部变量（不带类前缀）
        if (varTypes.containsKey(varName)) {
            return varTypes.get(varName);
        }
        // 2. 如果在类内部，再查找类属性（带类前缀）
        if (currentClassName != null && !currentClassName.isEmpty()) {
            key = currentClassName + "." + varName;
        }
        return varTypes.getOrDefault(key, "Object");
    }

    public void setVariableType(String varName, String varType) {
        String key = varName;
        if (currentClassName != null && !currentClassName.isEmpty()) {
            key = currentClassName + "." + varName;
        }

        varTypes.put( key, varType);
    }
    public boolean isVariableDeclared(String varName) {
        return varTypes.containsKey(varName);
    }

    /**
     * 进入新作用域（如方法体），保存当前状态
     */
    public void enterScope() {
        // 将当前 varTypes 深拷贝一份，压入栈顶
        scopeStack.push(new HashMap<>(varTypes));
    }

    /**
     * 离开作用域，恢复之前的状态
     */
    public void leaveScope() {
        if (!scopeStack.isEmpty()) {
            Map<String, String> saved = scopeStack.pop();
            varTypes.clear();
            varTypes.putAll(saved);
        }
    }

    /**
     * 在当前作用域内声明变量
     */
    public void declareVariable(String varName, String varType) {
        varTypes.put(varName, varType);
    }

    public void setFunctionReturnType(String funcName, String returnType) {
        String key = funcName;
        if (currentClassName != null && !currentClassName.isEmpty()) {
            key = currentClassName + "." + funcName;
        }
        funcReturnTypes.put(key, returnType);
    }

    public void setGlobalTable(GlobalSymbolTable table) {
        this.globalTable = table;
    }

    public String getFunctionReturnType(String funcName) {
        if (funcName == null) return "Object";

        // 打印调试信息
        System.err.println("DEBUG: getFunctionReturnType called with funcName = " + funcName);
        System.err.println("DEBUG: currentClassName = " + currentClassName);

        // 如果在类内部，则优先尝试“类名.方法名”键
        if (currentClassName != null && !currentClassName.isEmpty()) {
            String classKey = currentClassName + "." + funcName;
            if (funcReturnTypes.containsKey(classKey)) {
                System.err.println("DEBUG: Found in local (classKey): " + classKey + " -> " + funcReturnTypes.get(classKey));
                return funcReturnTypes.get(classKey);
            }
        }
        // 其次尝试简单方法名（用于全局函数）
        if (funcReturnTypes.containsKey(funcName)) {
            System.err.println("DEBUG: Found in local (simple): " + funcName + " -> " + funcReturnTypes.get(funcName));
            return funcReturnTypes.get(funcName);
        }

        // 打印本地所有键（仅用于调试，正式发布可删除）
        System.err.println("DEBUG: Local funcReturnTypes keys: " + funcReturnTypes.keySet());

            // 3. 全局符号表查找
            if (globalTable != null) {
                String className, method;
                if (funcName.contains(".")) {
                    int lastDot = funcName.lastIndexOf('.');
                    className = funcName.substring(0, lastDot);
                    method = funcName.substring(lastDot + 1);
                    System.err.println("DEBUG: Querying globalTable for class " + className + ", method " + method);
                    String type = globalTable.getMethodReturnType(className, method);
                    System.err.println("DEBUG: Global table returned type: " + type);
                    if (!"Object".equals(type)) {
                        return type;
                    }
                } else if (currentClassName != null && !currentClassName.isEmpty()) {
                    className = currentClassName;
                    method = funcName;
                    System.err.println("DEBUG: Querying globalTable for current class " + className + ", method " + method);
                    String type = globalTable.getMethodReturnType(className, method);
                    System.err.println("DEBUG: Global table returned type: " + type);
                    if (!"Object".equals(type)) {
                        return type;
                    }
                }
            }

            System.err.println("DEBUG: No type found for " + funcName + ", returning Object");
            return "Object";

    }

    /**
     * 判断 assignable 是否包含静态属性访问（如 User::$prop 或 self::$prop）
     */
    private boolean isStaticPropertyAssignable(JhpParser.AssignableContext ctx) {
        if (ctx.chain() != null) {
            JhpParser.ChainContext chain = ctx.chain();
            JhpParser.ChainOriginContext origin = chain.chainOrigin();
            if (origin != null && origin.chainBase() != null) {
                JhpParser.ChainBaseContext base = origin.chainBase();
                // 如果 chainBase 中包含 qualifiedStaticTypeRef，说明是静态属性访问
                return base.qualifiedStaticTypeRef() != null;
            }
        }
        return false;
    }

    // 设置当前类的泛型参数列表
    public void setCurrentTypeParameters(List<String> params) {
        this.currentTypeParameters = new ArrayList<>(params);
    }

    // 清除当前类的泛型参数列表
    public void clearCurrentTypeParameters() {
        this.currentTypeParameters.clear();
    }

    // 判断标识符是否是当前类的泛型参数
    public boolean isTypeParameter(String name) {
        return currentTypeParameters.contains(name);
    }

    public List<String> getCurrentTypeParameters() {
        return new ArrayList<>(currentTypeParameters);
    }

    /** 注册类的泛型参数名列表 */
    public void setClassTypeParamNames(String className, List<String> paramNames) {
        classTypeParamNames.put(className, paramNames);
    }

    /** 获取类的泛型参数名列表 */
    public List<String> getClassTypeParamNames(String className) {
//        return classTypeParamNames.getOrDefault(className, Collections.emptyList());
        List<String> local = classTypeParamNames.getOrDefault(className, new ArrayList<>());
        if (!local.isEmpty()) return local;
        if (globalTable != null) {
            return globalTable.getClassTypeParams(className);
        }
        return local;
    }

    /** 设置变量的泛型实参绑定 */
    public void setVarGenericBinding(String varName, Map<String, String> bindings) {
        if (bindings != null && !bindings.isEmpty()) {
            varGenericBindings.put(varName, new HashMap<>(bindings));
        }
    }

    /** 获取变量的泛型实参绑定 */
    public Map<String, String> getVarGenericBinding(String varName) {
        return varGenericBindings.getOrDefault(varName, Collections.emptyMap());
    }

    /**
     * 根据类型字符串（如 "Box<Integer>"）和类原型参数名列表，
     * 生成参数名→实参的映射。假设实参顺序与原型参数顺序一致。
     */
    public Map<String, String> buildGenericBindings(String fullType, List<String> paramNames) {
        Map<String, String> bindings = new HashMap<>();
        if (paramNames.isEmpty()) return bindings;
        int start = fullType.indexOf('<');
        int end = fullType.lastIndexOf('>');
        if (start == -1 || end <= start) return bindings;
        String argsPart = fullType.substring(start + 1, end);
        String[] args = splitGenericArgs(argsPart);
        for (int i = 0; i < paramNames.size() && i < args.length; i++) {
            bindings.put(paramNames.get(i), args[i].trim());
        }
        return bindings;
    }

    /** 简单分割泛型实参，支持嵌套尖括号 */
    private String[] splitGenericArgs(String s) {
        List<String> result = new ArrayList<>();
        int depth = 0, start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '<') depth++;
            else if (c == '>') depth--;
            else if (c == ',' && depth == 0) {
                result.add(s.substring(start, i).trim());
                start = i + 1;
            }
        }
        result.add(s.substring(start).trim());
        return result.toArray(new String[0]);
    }

    /** 从完整类型字符串中提取纯类名 */
    private String extractClassNameFromType(String javaType) {
        int i = javaType.indexOf('<');
        return i == -1 ? javaType : javaType.substring(0, i).trim();
    }

    /**
     * 获取基础变量的类型，不带类名前缀。
     * 适用于局部变量、函数参数等。
     */
    public String getBaseVariableType(String varName) {
        return varTypes.getOrDefault(varName, "Object");
    }

}