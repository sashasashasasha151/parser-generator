// Generated from /home/sasha/Code/MT/trans/src/main/java/antlr4/Logic.g4 by ANTLR 4.7
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogicParser}.
 */
public interface LogicListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LogicParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LogicParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LogicParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicParser#add_or}.
	 * @param ctx the parse tree
	 */
	void enterAdd_or(LogicParser.Add_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicParser#add_or}.
	 * @param ctx the parse tree
	 */
	void exitAdd_or(LogicParser.Add_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicParser#n_expression}.
	 * @param ctx the parse tree
	 */
	void enterN_expression(LogicParser.N_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicParser#n_expression}.
	 * @param ctx the parse tree
	 */
	void exitN_expression(LogicParser.N_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicParser#add_xor}.
	 * @param ctx the parse tree
	 */
	void enterAdd_xor(LogicParser.Add_xorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicParser#add_xor}.
	 * @param ctx the parse tree
	 */
	void exitAdd_xor(LogicParser.Add_xorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicParser#n_n_expression}.
	 * @param ctx the parse tree
	 */
	void enterN_n_expression(LogicParser.N_n_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicParser#n_n_expression}.
	 * @param ctx the parse tree
	 */
	void exitN_n_expression(LogicParser.N_n_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicParser#add_and}.
	 * @param ctx the parse tree
	 */
	void enterAdd_and(LogicParser.Add_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicParser#add_and}.
	 * @param ctx the parse tree
	 */
	void exitAdd_and(LogicParser.Add_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicParser#l_expression}.
	 * @param ctx the parse tree
	 */
	void enterL_expression(LogicParser.L_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicParser#l_expression}.
	 * @param ctx the parse tree
	 */
	void exitL_expression(LogicParser.L_expressionContext ctx);
}