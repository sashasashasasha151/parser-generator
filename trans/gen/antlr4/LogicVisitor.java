// Generated from /home/sasha/Code/MT/trans/src/main/java/antlr4/Logic.g4 by ANTLR 4.7
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LogicParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LogicVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LogicParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(LogicParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicParser#add_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_or(LogicParser.Add_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicParser#n_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN_expression(LogicParser.N_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicParser#add_xor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_xor(LogicParser.Add_xorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicParser#n_n_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN_n_expression(LogicParser.N_n_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicParser#add_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_and(LogicParser.Add_andContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicParser#l_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_expression(LogicParser.L_expressionContext ctx);
}