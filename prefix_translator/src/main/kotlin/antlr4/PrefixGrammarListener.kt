// Generated from java-escape by ANTLR 4.7.1

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PrefixGrammarParser}.
 */
interface PrefixGrammarListener : ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PrefixGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	fun enterStart(ctx: PrefixGrammarParser.StartContext)
	/**
	 * Exit a parse tree produced by {@link PrefixGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	fun exitStart(ctx: PrefixGrammarParser.StartContext)
	/**
	 * Enter a parse tree produced by {@link PrefixGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterExpression(ctx: PrefixGrammarParser.ExpressionContext)
	/**
	 * Exit a parse tree produced by {@link PrefixGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitExpression(ctx: PrefixGrammarParser.ExpressionContext)
	/**
	 * Enter a parse tree produced by {@link PrefixGrammarParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	fun enterSimple_expression(ctx: PrefixGrammarParser.Simple_expressionContext)
	/**
	 * Exit a parse tree produced by {@link PrefixGrammarParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	fun exitSimple_expression(ctx: PrefixGrammarParser.Simple_expressionContext)
	/**
	 * Enter a parse tree produced by {@link PrefixGrammarParser#if_expression}.
	 * @param ctx the parse tree
	 */
	fun enterIf_expression(ctx: PrefixGrammarParser.If_expressionContext)
	/**
	 * Exit a parse tree produced by {@link PrefixGrammarParser#if_expression}.
	 * @param ctx the parse tree
	 */
	fun exitIf_expression(ctx: PrefixGrammarParser.If_expressionContext)
	/**
	 * Enter a parse tree produced by {@link PrefixGrammarParser#else_expression}.
	 * @param ctx the parse tree
	 */
	fun enterElse_expression(ctx: PrefixGrammarParser.Else_expressionContext)
	/**
	 * Exit a parse tree produced by {@link PrefixGrammarParser#else_expression}.
	 * @param ctx the parse tree
	 */
	fun exitElse_expression(ctx: PrefixGrammarParser.Else_expressionContext)
	/**
	 * Enter a parse tree produced by {@link PrefixGrammarParser#print}.
	 * @param ctx the parse tree
	 */
	fun enterPrint(ctx: PrefixGrammarParser.PrintContext)
	/**
	 * Exit a parse tree produced by {@link PrefixGrammarParser#print}.
	 * @param ctx the parse tree
	 */
	fun exitPrint(ctx: PrefixGrammarParser.PrintContext)
	/**
	 * Enter a parse tree produced by {@link PrefixGrammarParser#define}.
	 * @param ctx the parse tree
	 */
	fun enterDefine(ctx: PrefixGrammarParser.DefineContext)
	/**
	 * Exit a parse tree produced by {@link PrefixGrammarParser#define}.
	 * @param ctx the parse tree
	 */
	fun exitDefine(ctx: PrefixGrammarParser.DefineContext)
	/**
	 * Enter a parse tree produced by {@link PrefixGrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	fun enterVariable(ctx: PrefixGrammarParser.VariableContext)
	/**
	 * Exit a parse tree produced by {@link PrefixGrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	fun exitVariable(ctx: PrefixGrammarParser.VariableContext)
	/**
	 * Enter a parse tree produced by {@link PrefixGrammarParser#logic_value}.
	 * @param ctx the parse tree
	 */
	fun enterLogic_value(ctx: PrefixGrammarParser.Logic_valueContext)
	/**
	 * Exit a parse tree produced by {@link PrefixGrammarParser#logic_value}.
	 * @param ctx the parse tree
	 */
	fun exitLogic_value(ctx: PrefixGrammarParser.Logic_valueContext)
	/**
	 * Enter a parse tree produced by {@link PrefixGrammarParser#int_value}.
	 * @param ctx the parse tree
	 */
	fun enterInt_value(ctx: PrefixGrammarParser.Int_valueContext)
	/**
	 * Exit a parse tree produced by {@link PrefixGrammarParser#int_value}.
	 * @param ctx the parse tree
	 */
	fun exitInt_value(ctx: PrefixGrammarParser.Int_valueContext)
	/**
	 * Enter a parse tree produced by {@link PrefixGrammarParser#logic_operation}.
	 * @param ctx the parse tree
	 */
	fun enterLogic_operation(ctx: PrefixGrammarParser.Logic_operationContext)
	/**
	 * Exit a parse tree produced by {@link PrefixGrammarParser#logic_operation}.
	 * @param ctx the parse tree
	 */
	fun exitLogic_operation(ctx: PrefixGrammarParser.Logic_operationContext)
	/**
	 * Enter a parse tree produced by {@link PrefixGrammarParser#int_operations}.
	 * @param ctx the parse tree
	 */
	fun enterInt_operations(ctx: PrefixGrammarParser.Int_operationsContext)
	/**
	 * Exit a parse tree produced by {@link PrefixGrammarParser#int_operations}.
	 * @param ctx the parse tree
	 */
	fun exitInt_operations(ctx: PrefixGrammarParser.Int_operationsContext)
	/**
	 * Enter a parse tree produced by {@link PrefixGrammarParser#compare_op}.
	 * @param ctx the parse tree
	 */
	fun enterCompare_op(ctx: PrefixGrammarParser.Compare_opContext)
	/**
	 * Exit a parse tree produced by {@link PrefixGrammarParser#compare_op}.
	 * @param ctx the parse tree
	 */
	fun exitCompare_op(ctx: PrefixGrammarParser.Compare_opContext)
}