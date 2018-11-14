package main

import main.Token.*
import java.io.InputStream

class Parser {
    lateinit var lex: LexicalAnalyzer

    fun parse(input: InputStream): Tree {
        lex = LexicalAnalyzer(input)
        lex.nextToken()
        val tree = S()
        if (lex.curToken == END) {
            return tree
        } else {
            throw AssertionError("${lex.curToken} not expected in the end")
        }
    }

    private fun S(): Tree =
            when (lex.curToken) {
                VAR, NOT, LPAREN ->
                    Tree("S",
                            listOf(A(), T())
                    )
                else ->
                    throw AssertionError("${lex.curToken} not expected in S()")
            }

    private fun T(): Tree =
            when (lex.curToken) {
                OR -> {
                    lex.nextToken()
                    Tree("T",
                            listOf(Tree("|"), A(), T())
                    )
                }
                RPAREN, END ->
                    Tree("T",
                            listOf(Tree("eps"))
                    )
                else ->
                    throw AssertionError("${lex.curToken} not expected in T()")
            }

    private fun A() =
            when (lex.curToken) {
                VAR, NOT, LPAREN ->
                    Tree("A",
                            listOf(B(), U())
                    )
                else ->
                    throw AssertionError("${lex.curToken} not expected in A()")
            }

    private fun U(): Tree =
            when (lex.curToken) {
                XOR -> {
                    lex.nextToken()
                    Tree("U",
                            listOf(Tree("^"), B(), U())
                    )
                }
                OR, RPAREN, END ->
                    Tree("U",
                            listOf(Tree("eps"))
                    )
                else ->
                    throw AssertionError("${lex.curToken} not expected in U()")
            }


    private fun B() =
            when (lex.curToken) {
                VAR, NOT, LPAREN ->
                    Tree("B",
                            listOf(C(), V())
                    )
                else ->
                    throw AssertionError()
            }


    private fun V(): Tree =
            when (lex.curToken) {
                AND -> {
                    lex.nextToken()
                    Tree("V",
                            listOf(Tree("&"), C(), V())
                    )
                }
                XOR, OR, RPAREN, END ->
                    Tree("V",
                            listOf(Tree("eps"))
                    )
                else ->
                    throw AssertionError("${lex.curToken} not expected in V()")
            }

    private fun C(): Tree {
        when (lex.curToken) {
            VAR, LPAREN -> {
                return Tree("C",
                        listOf(D())
                )
            }
            NOT -> {
                lex.nextToken()
                return Tree("C",
                        listOf(Tree("!"), D())
                )
            }
            else ->
                throw AssertionError("${lex.curToken} not expected in C()")
        }
    }

    private fun D(): Tree {
        when (lex.curToken) {
            VAR -> {
                lex.nextToken()
                return Tree("D",
                        listOf(Tree("var"))
                )
            }
            LPAREN -> {
                lex.nextToken()
                val sub = S()
                if (lex.curToken != RPAREN) {
                    throw AssertionError("${lex.curToken} not expected in D()")
                }
                lex.nextToken()
                return Tree("D",
                        listOf(Tree("("), sub, Tree(")"))
                )
            }
            else ->
                throw AssertionError("${lex.curToken} not expected in D()")
        }
    }
}