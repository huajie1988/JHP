package compiler;

import jhp.parser.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.PrintWriter;
import java.util.List;

public class JhpVisitor extends JhpParserBaseVisitor<Void> {

    private final PrintWriter out;
    private int indentLevel = 0;

    // 变量处理逻辑现在在这个独立的对象中
    private final VariableProcessor varProc;
    private final ExpressionProcessor exprProc;

    public JhpVisitor(PrintWriter out) {
        this.out = out;
        this.varProc = new VariableProcessor(out);
        this.exprProc = new ExpressionProcessor(varProc, out);
        this.varProc.setExprProcessor(exprProc);  // 解决循环依赖
    }

    private void indent() {
        for (int i = 0; i < indentLevel; i++) out.print("    ");
    }

    // 收集属性，传递给 processor
    @Override
    public Void visitAttributes(JhpParser.AttributesContext ctx) {
        varProc.setCurrentAttributes(ctx.attributeGroup());
        return null;
    }

    @Override
    public Void visitPhpFile(JhpParser.PhpFileContext ctx) {
        out.println("import java.util.*;");
        out.println("import java.math.BigDecimal;");
        out.println("public class GeneratedClass {");
        indentLevel++;
        out.println("    public static void main(String[] args) {");
        indentLevel++;
        for (ParseTree child : ctx.children) {
            if (child instanceof JhpParser.TopStatementContext) {
                visit(child);
            }
        }
        indentLevel--;
        out.println("    }");
        indentLevel--;
        out.println("}");
        return null;
    }

    @Override
    public Void visitExpressionStatement(JhpParser.ExpressionStatementContext ctx) {
        if (ctx.expression() instanceof JhpParser.AssignmentExpressionContext) {
            varProc.handleAssignment(
                (JhpParser.AssignmentExpressionContext) ctx.expression(),
                indentLevel
            );
        }
        return null;
    }

    @Override
    public Void visitEchoStatement(JhpParser.EchoStatementContext ctx) {
        List<JhpParser.ExpressionContext> expressions = ctx.expressionList().expression();
        
        StringBuilder args = new StringBuilder();
        for (int i = 0; i < expressions.size(); i++) {
            if (i > 0) {
                args.append(", ");
            }
            args.append(exprProc.generateExpression(expressions.get(i), indentLevel));
        }
        
        indent();
        out.printf("runtime.JhpRuntime.echo(%s);%n", args.toString());
        return null;
    }

    @Override
    public Void visitChainExpression(JhpParser.ChainExpressionContext ctx) {
        // 单独的变量表达式不产出代码
        return null;
    }

    @Override
    public Void visitScalarExpression(JhpParser.ScalarExpressionContext ctx) {
        return null;
    }
}