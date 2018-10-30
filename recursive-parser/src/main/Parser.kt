package main

import main.Token.*
import java.io.InputStream

class Parser {
    lateinit var lex: LexicalAnalyzer

    fun parse(input: InputStream): Tree {
        lex = LexicalAnalyzer(input)
        lex.nextToken()
        return S()
    }

    private fun S(): Tree {
        when (lex.curToken) {
            VAR, NOT, LPAREN -> {
                val aFun = A()
                val tFun = T()
                return Tree("S", listOf(aFun, tFun))
            }
            else -> {
                throw AssertionError()
            }
        }
    }

    private fun T(): Tree {
        when (lex.curToken) {
            XOR -> {
                lex.nextToken()
                val aFun = A()
                val tFun = T()
                return Tree("T", listOf(Tree("^"), aFun, tFun))
            }
            RPAREN, END -> {
                return Tree("T", listOf(Tree("e")))
            }
            else -> {
                throw AssertionError()
            }
        }
    }

    private fun A(): Tree {
        when (lex.curToken) {
            VAR, NOT, LPAREN -> {
                val bFun = B()
                val uFun = U()
                return Tree("A", listOf(bFun, uFun))
            }
            else -> {
                throw AssertionError()
            }
        }
    }

    private fun U(): Tree {
        when (lex.curToken) {
            OR -> {
                lex.nextToken()
                val bFun = B()
                val uFun = U()
                return Tree("U", listOf(Tree("|"), bFun, uFun))
            }
            XOR, RPAREN, END -> {
                return Tree("U", listOf(Tree("e")))
            }
            else -> {
                throw AssertionError()
            }
        }
    }

    private fun B(): Tree {
        when (lex.curToken) {
            VAR, NOT, LPAREN -> {
                val cFun = C()
                val vFun = V()
                return Tree("B", listOf(cFun, vFun))
            }
            else -> {
                throw AssertionError()
            }
        }
    }

    private fun V(): Tree {
        when (lex.curToken) {
            AND -> {
                lex.nextToken()
                val cFun = C()
                val vFun = V()
                return Tree("V", listOf(Tree("&"), cFun, vFun))
            }
            XOR, OR, RPAREN, END -> {
                return Tree("V", listOf(Tree("e")))
            }
            else -> {
                throw AssertionError()
            }
        }
    }

    private fun C(): Tree {
        when (lex.curToken) {
            VAR -> {
                lex.nextToken()
                return Tree("C", listOf(Tree("n")))
            }
            NOT -> {
                lex.nextToken()
                return Tree("C", listOf(Tree("!"), S()))
            }
            LPAREN -> {
                lex.nextToken()
                val sub = S()
                lex.nextToken()
                return Tree("C", listOf(Tree("("), sub, Tree(")")))
            }
            else -> {
                throw AssertionError()
            }
        }
    }
}