package compiler;

import jhp.parser.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.*;
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
        }else {
            String exprCode = exprProc.generateExpression(ctx.expression(), indentLevel);
            indent();
            out.println(exprCode + ";");
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

    @Override
    public Void visitIfStatement(JhpParser.IfStatementContext ctx) {
        JhpParser.ExpressionContext condExpr = ctx.parentheses().expression();
        String condCode = exprProc.generateExpression(condExpr, indentLevel);

        JhpUtils.printIndent(out, indentLevel);
        out.println("if (" + condCode + ")");
        visit(ctx.statement());

        if (ctx.elseIfStatement() != null) {
            for (JhpParser.ElseIfStatementContext elseIf : ctx.elseIfStatement()) {
                String elseIfCond = exprProc.generateExpression(elseIf.parentheses().expression(), indentLevel);
                JhpUtils.printIndent(out, indentLevel);
                out.println("else if (" + elseIfCond + ")");
                visit(elseIf.statement());
            }
        }

        if (ctx.elseStatement() != null) {
            JhpUtils.printIndent(out, indentLevel);
            out.println("else");
            visit(ctx.elseStatement().statement());
        }

        return null;
    }

    @Override
    public Void visitBlockStatement(JhpParser.BlockStatementContext ctx) {
        // 用于独立语句块（非if分支）
        JhpUtils.printIndent(out, indentLevel);
        out.println("{");
        indentLevel++;
        visit(ctx.innerStatementList());
        indentLevel--;
        JhpUtils.printIndent(out, indentLevel);
        out.println("}");
        return null;
    }

    @Override
    public Void visitWhileStatement(JhpParser.WhileStatementContext ctx) {
        JhpParser.ExpressionContext condExpr = ctx.parentheses().expression();
        String condCode = exprProc.generateExpression(condExpr, indentLevel);

        JhpUtils.printIndent(out, indentLevel);
        out.println("while (" + condCode + ")");
        visit(ctx.statement());
        return null;
    }

    @Override
    public Void visitForStatement(JhpParser.ForStatementContext ctx) {
        String initCode = (ctx.forInit() != null && ctx.forInit().expressionList() != null) ? generateForInit(ctx.forInit().expressionList(), indentLevel) : "";
        String[] initCodes = initCode.split(",");
        // 只取最后一个表达式作为循环条件，默认 true
        String condCode = "true";
        if (ctx.expressionList() != null && !ctx.expressionList().expression().isEmpty()) {
            List<JhpParser.ExpressionContext> condExprs = ctx.expressionList().expression();
            // 只使用最后一个表达式
            condCode = exprProc.generateExpression(condExprs.get(condExprs.size() - 1), indentLevel);
            if (condExprs.size() > 1) {
                System.err.println("Warning: multiple expressions in for condition, only the last one is used as the loop condition.");
            }
        }

        String updateCode = (ctx.forUpdate() != null && ctx.forUpdate().expressionList() != null) ? exprProc.generateExpressionList(ctx.forUpdate().expressionList(), indentLevel) : "";
        
        if(initCodes.length > 1) {
            initCode = initCodes[0]; // 取第一个表达式作为循环初始化
            for (int i = 1; i < initCodes.length; i++) {
                String code = initCodes[i];
                if (!code.trim().isEmpty()) {
                    indent();
                    out.println(code.trim() + ";");
                }
            }
        }
        JhpUtils.printIndent(out, indentLevel);
        out.printf("for (%s; %s; %s)%n", initCode, condCode, updateCode);
        visit(ctx.statement());
        return null;
        
    }

    private String generateForInit(JhpParser.ExpressionListContext ctx, int indentLevel) {
        List<JhpParser.ExpressionContext> exprs = ctx.expression();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < exprs.size(); i++) {
            if (i > 0) sb.append(", ");
            
            JhpParser.ExpressionContext expr = exprs.get(i);
            if (expr instanceof JhpParser.AssignmentExpressionContext) {
                JhpParser.AssignmentExpressionContext assignCtx = (JhpParser.AssignmentExpressionContext) expr;
                String leftVar = JhpUtils.getAssignableVarName(assignCtx.assignable());
                String rightCode = exprProc.generateExpression(assignCtx.expression(), indentLevel);
                
                // 检查是否是首次声明
                if (!varProc.isVariableDeclared(leftVar)) {
                    String varType = exprProc.inferTypeFromExpression(assignCtx.expression());
                    varProc.setVariableType(leftVar, varType);
                    sb.append(varType).append(" ").append(leftVar).append(" = ").append(rightCode);
                } else {
                    sb.append(leftVar).append(" = ").append(rightCode);
                }
            } else {
                sb.append(exprProc.generateExpression(expr, indentLevel));
            }
        }
        return sb.toString();
    }

    @Override
    public Void visitDoWhileStatement(JhpParser.DoWhileStatementContext ctx) {
        JhpParser.ExpressionContext condExpr = ctx.parentheses().expression();
        String condCode = exprProc.generateExpression(condExpr, indentLevel);

        JhpUtils.printIndent(out, indentLevel);
        out.println("do");
        visit(ctx.statement());
        JhpUtils.printIndent(out, indentLevel);
        out.println("while (" + condCode + ");");
        return null;
    }


    @Override
    public Void visitSwitchStatement(JhpParser.SwitchStatementContext ctx) {
        // 1. 条件表达式
        JhpParser.ExpressionContext condExpr = ctx.parentheses().expression();
        String condCode = exprProc.generateExpression(condExpr, indentLevel);

        // 2. switch 头
        JhpUtils.printIndent(out, indentLevel);
        out.println("switch (" + condCode + ") {");
        indentLevel++;

        // 3. 遍历每个 switchBlock
        if (ctx.switchBlock() != null) {
            for (JhpParser.SwitchBlockContext block : ctx.switchBlock()) {
                System.err.println("DEBUG: Visiting switch block with text: " + block.getText());
                // 判断是 case 还是 default
                if (block.Case() != null) {
                    // case 标签
                    JhpParser.ExpressionContext expr = block.expression();
                    String caseCode = exprProc.generateExpression(expr, indentLevel);
                    JhpUtils.printIndent(out, indentLevel);
                    out.println("case " + caseCode + ":");
                } else if (block.Default() != null) {
                    // default 标签
                    JhpUtils.printIndent(out, indentLevel);
                    out.println("default:");
                }

                // 标签后的语句体（都包裹在 switchBlockBody 中）
                if (block.switchBlockBody() != null && block.switchBlockBody().innerStatementList() != null) {
                    indentLevel++;
                    visit(block.switchBlockBody().innerStatementList());
                    indentLevel--;
                }
            }
        }

        // 4. 闭合花括号
        indentLevel--;
        JhpUtils.printIndent(out, indentLevel);
        out.println("}");

        return null;
    }



    @Override
    public Void visitContinueStatement(JhpParser.ContinueStatementContext ctx) {
        indent();
        out.println("continue;");
        return null;
    }

    @Override
    public Void visitBreakStatement(JhpParser.BreakStatementContext ctx) {
        indent();
        out.println("break;");
        return null;
    }

    @Override
    public Void visitReturnStatement(JhpParser.ReturnStatementContext ctx) {
        String returnCode = (ctx.expression() != null) ? exprProc.generateExpression(ctx.expression(), indentLevel) : "";
        indent();
        out.println("return " + returnCode + ";");
        return null;
    }

}