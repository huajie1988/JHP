package compiler;

import jhp.parser.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class UnaryExpressionProcessor {
    private final ExpressionProcessor exprProc;
    private final PrintWriter out;


    public UnaryExpressionProcessor(ExpressionProcessor exprProc, PrintWriter out) {
        this.exprProc = exprProc;
        this.out = out;
    }
    public String generateCast(JhpParser.CastExpressionContext ctx, int indent) {
        JhpParser.ExpressionContext inner = ctx.expression();

        // 检查内部是否为闭包
        if (inner instanceof JhpParser.LambdaFunctionExpressionContext) {
            JhpParser.LambdaFunctionExpressionContext lambdaCtx = (JhpParser.LambdaFunctionExpressionContext) inner;
            JhpParser.LambdaFunctionExprContext lambda = lambdaCtx.lambdaFunctionExpr();

            String targetType = mapCastTargetType(ctx.castOperation());

            if (lambda.blockStatement() != null) {
                // 多行闭包 → 生成匿名内部类
                return generateAnonymousClassForCast(lambda, targetType, indent);
            } else {
                // 单行闭包 → lambda 表达式（目标类型信息被 lambda 自身携带，忽略 cast）
                return generateLambda(lambda, indent);
            }
        }

        // 普通类型转换
        String castType = ctx.castOperation().getText();
        String javaType;
        if (ctx.castOperation().qualifiedStaticTypeRef() != null) {
            javaType = JhpUtils.qualifiedStaticTypeRefToJava(ctx.castOperation().qualifiedStaticTypeRef());
        } else {
            javaType = JhpUtils.mapJhpTypeToJavaType(castType);
        }
        String innerCode = exprProc.generateExpression(inner, indent);
        return "((" + javaType + ") " + innerCode + ")";
    }

    public String generateUnaryOp(JhpParser.UnaryOperatorExpressionContext ctx, int indent) {
        // 操作符可能是 '!' '+' '-' '~' '@' 等，需要根据实际语法分支选取操作符文本
        String op = ctx.getChild(0).getText();
        String inner = exprProc.generateExpression(ctx.expression(), indent);
        if (op.equals("@")) {
            return inner; // PHP 错误抑制符，Java 忽略
        }
        return op + inner;
    }

    public String generatePrefixIncDec(JhpParser.PrefixIncDecExpressionContext ctx, int indent) {
        String op = ctx.getChild(0).getText();   // 第一个孩子是 '++' 或 '--'
        String operand = exprProc.generateChainCode(ctx.chain(), indent);
        return op + operand;
    }

    public String generatePostfixIncDec(JhpParser.PostfixIncDecExpressionContext ctx, int indent) {
        String op = ctx.getChild(ctx.getChildCount() - 1).getText();
        String operand = exprProc.generateChainCode(ctx.chain(), indent);
        return operand + op;
    }
    
    public String generateNewExpression(JhpParser.NewExpressionContext ctx, int indent) {
        // 提取类型并转换为 Java 类名
        JhpParser.TypeRefContext typeRef = ctx.newExpr().typeRef();
        String javaType = JhpUtils.mapTypeRefToJava(typeRef);   // 将 PHP 类型引用转为 Java 类型字符串

        // 生成参数列表字符串
        String args = "";
        if (ctx.newExpr().arguments() != null) {
            // 复用现有的参数生成方式（直接从 arguments 提取）
            args = JhpUtils.generateArgumentsString(ctx.newExpr().arguments(), exprProc, indent);
        }

        if(typeRef.anonymousClass()!=null){
            ClassProcessor classProcessor = new ClassProcessor(exprProc.getVarProc(),
                    exprProc,
                    exprProc.getVisitor(),
                    out);
            return "new " + javaType + "(" + args + ")"+classProcessor.generateAnonymousClass(typeRef.anonymousClass(),indent);
        }else{
            return "new " + javaType + "(" + args + ")";
        }
    }

    private String mapCastTargetType(JhpParser.CastOperationContext castOp) {
        if (castOp.qualifiedStaticTypeRef() != null) {
            return JhpUtils.qualifiedStaticTypeRefToJava(castOp.qualifiedStaticTypeRef());
        }
        return JhpUtils.mapJhpTypeToJavaType(castOp.getText());
    }

    private String generateAnonymousClassForCast(JhpParser.LambdaFunctionExprContext ctx, String targetType, int indent) {
        // 提取参数和返回类型（用于生成方法签名）
        List<String> paramStrs = new ArrayList<>();
        if (ctx.formalParameterList() != null) {
            for (JhpParser.FormalParameterContext p : ctx.formalParameterList().formalParameter()) {
                String paramType = "Object";
                if (p.typeHint() != null) paramType = JhpUtils.mapTypeHint(p.typeHint());
                String paramName = p.variableInitializer().VarName().getText().substring(1);
                paramStrs.add(paramType + " " + paramName);
            }
        }
        String paramsStr = String.join(", ", paramStrs);
        String returnType = JhpUtils.mapTypeHint(ctx.typeHint());

        // 捕获方法体
        String bodyStr = exprProc.captureBlock(ctx.blockStatement(), indent + 1);

        // 构建匿名内部类
        StringBuilder sb = new StringBuilder();
        sb.append("new ").append(targetType).append("() {\n");
        sb.append(JhpUtils.indentStr(indent + 1)).append("@Override\n");
        String methodSig = JhpUtils.getFunctionalMethodSignature(targetType, returnType, paramsStr);
        sb.append(JhpUtils.indentStr(indent + 1)).append("public ").append(methodSig).append(" \n");
        sb.append(bodyStr);
        sb.append(JhpUtils.indentStr(indent + 1)).append("\n");
        sb.append(JhpUtils.indentStr(indent)).append("}");
        return sb.toString();
    }

    // 单行闭包的 lambda 生成（保持在 Atomic 也可，移到 Unary 更集中）
    private String generateLambda(JhpParser.LambdaFunctionExprContext ctx, int indent) {
        List<String> paramNames = new ArrayList<>();
        if (ctx.formalParameterList() != null) {
            for (JhpParser.FormalParameterContext p : ctx.formalParameterList().formalParameter()) {
                paramNames.add(p.variableInitializer().VarName().getText().substring(1));
            }
        }
        String body = exprProc.generateExpression(ctx.expression(), indent);
        String params;
        if (paramNames.isEmpty()) params = "()";
        else if (paramNames.size() == 1) params = paramNames.get(0);
        else params = "(" + String.join(", ", paramNames) + ")";
        return params + " -> " + body;
    }

    public String generateClone(JhpParser.CloneExpressionContext ctx, int indent) {
        String innerCode = exprProc.generateExpression(ctx.expression(), indent);
        String innerType = exprProc.inferTypeFromExpression(ctx.expression());

        System.err.println("WARNING: innerType "+innerType);
        // 如果推断结果是 Object，但表达式是变量，尝试直接从符号表获取（作为后备）
        if ("Object".equals(innerType) && ctx.expression() instanceof JhpParser.ChainExpressionContext) {
            JhpParser.ChainExpressionContext chainCtx = (JhpParser.ChainExpressionContext) ctx.expression();
            String varName = JhpUtils.getVarNameFromChain(chainCtx.chain());
            System.err.println("WARNING: varName "+varName);
            if (varName != null && !varName.isEmpty()) {
                String directType = exprProc.getVariableTypes(varName);
                System.err.println("WARNING: directType "+directType);
                if (!"Object".equals(directType)) {
                    innerType = directType;
                }
            }
        }

        // 如果推断出具体类型且不是基本类型，则生成强转；否则直接调用
        if (innerType != null && !"Object".equals(innerType) && !isPrimitive(innerType)) {
            return "(" + innerType + ") JhpRuntime.cloneObject(" + innerCode + ")";
        } else {
            return "JhpRuntime.cloneObject(" + innerCode + ")";
        }
    }

    private boolean isPrimitive(String type) {
        return type.equals("int") || type.equals("double") || type.equals("boolean") ||
                type.equals("Integer") || type.equals("Double") || type.equals("Boolean") ||
                type.equals("void") || type.equals("Void");
    }

}
