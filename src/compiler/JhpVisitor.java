package compiler;

import jhp.parser.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.PrintWriter;

public class JhpVisitor extends JhpParserBaseVisitor<Void> {

    private final PrintWriter out;
    private int indentLevel = 0;

    // 变量处理逻辑现在在这个独立的对象中
    private final VariableProcessor processor;
    private final BinaryExpressionProcessor binExprProc;

    public JhpVisitor(PrintWriter out) {
        this.out = out;
        this.processor = new VariableProcessor(out);
        this.binExprProc = new BinaryExpressionProcessor(processor, out);
        this.processor.setExprProcessor(binExprProc);  // 解决循环依赖
    }

    private void indent() {
        for (int i = 0; i < indentLevel; i++) out.print("    ");
    }

    // 收集属性，传递给 processor
    @Override
    public Void visitAttributes(JhpParser.AttributesContext ctx) {
        processor.setCurrentAttributes(ctx.attributeGroup());
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
            processor.handleAssignment(
                (JhpParser.AssignmentExpressionContext) ctx.expression(),
                indentLevel
            );
        }
        return null;
    }

    @Override
    public Void visitEchoStatement(JhpParser.EchoStatementContext ctx) {
        JhpParser.ExpressionContext expr = ctx.expressionList().expression(0);
        String exprCode = processor.getExpressionCode(expr);
        indent();
        out.printf("runtime.JhpRuntime.echo(%s);%n", binExprProc.generateExpression(expr, indentLevel));
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