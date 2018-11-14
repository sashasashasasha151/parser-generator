import antlr4.LogicBaseVisitor;
import antlr4.LogicParser;

public class LogicVisitor extends LogicBaseVisitor<String> {
    @Override
    public String visitExpression(LogicParser.ExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitAdd_or(LogicParser.Add_orContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitN_expression(LogicParser.N_expressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitAdd_xor(LogicParser.Add_xorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitN_n_expression(LogicParser.N_n_expressionContext ctx) {
        System.out.print("(");
        visit(ctx.children.get(0));
        System.out.print(")");
        visit(ctx.children.get(1));

        return null;
    }

    @Override
    public String visitAdd_and(LogicParser.Add_andContext ctx) {
        if (ctx.children == null || ctx.children.size() != 3) {
            return "";
        } else {
            System.out.print("&(");
            visitChildren(ctx);
            System.out.print(")");
        }
        return null;
    }

    @Override
    public String visitL_expression(LogicParser.L_expressionContext ctx) {
        if (ctx.children.size() == 1) {
            System.out.print("VAR");
        }
        if (ctx.children.size() == 2) {
            System.out.print("!(");
            visitChildren(ctx);
            System.out.print(")");
        }
        if (ctx.children.size() == 3) {
            System.out.print("(");
            visitChildren(ctx);
            System.out.print(")");
        }
        return null;
    }
}
