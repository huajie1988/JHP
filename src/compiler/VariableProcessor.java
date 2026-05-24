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
    public VariableProcessor(PrintWriter out) {
        this.out = out;
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

        String rightCode = exprProc.generateExpression(rightExpr, indentLevel);

        if (!varTypes.containsKey(leftVar)) {
            // 首次声明
            varTypes.put(leftVar, rightType);
            JhpUtils.printIndent(this.out, indentLevel);
            out.printf("%s %s = %s;%n", rightType, leftVar, rightCode);
        } else {
            String declaredType = varTypes.get(leftVar);
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

    public void setFunctionReturnType(String funcName, String returnType) {
        String key = funcName;
        if (currentClassName != null && !currentClassName.isEmpty()) {
            key = currentClassName + "." + funcName;
        }
        funcReturnTypes.put(key, returnType);
    }

    public String getFunctionReturnType(String funcName) {
        if (funcName == null) return "Object";
        // 如果在类内部，则优先尝试“类名.方法名”键
        if (currentClassName != null && !currentClassName.isEmpty()) {
            String classKey = currentClassName + "." + funcName;
            if (funcReturnTypes.containsKey(classKey)) {
                return funcReturnTypes.get(classKey);
            }
        }
        // 其次尝试简单方法名（用于全局函数）
        if (funcReturnTypes.containsKey(funcName)) {
            return funcReturnTypes.get(funcName);
        }

        // 提取最后一段名字
        // String[] parts = funcName.split("\\.");
        // String simpleName = parts[parts.length - 1];
        // return funcReturnTypes.getOrDefault(simpleName, "Object");

        // 都没有，返回 Object
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

}