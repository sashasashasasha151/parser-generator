package test_grammars.generated.generated_tests

import java.util.HashMap
import kotlin.random.Random

class ValidLogicValue {
    val nm = ValidCompare()

    fun getLogic(mn: MutableList<Value>, ml: MutableList<Value>, depth: Int = 3): Pair<String, String> {
        if (depth == 0) {
            val rn = Random.nextInt(3)
            when (rn) {
                0 -> {
                    val boo = Random.nextBoolean().toString()
                    return Pair(boo, boo)
                }
                1 -> {
                    if(ml.size != 0) {
                        val v = ml[Random.nextInt(ml.size)]
                        return Pair(v.name, v.value)
                    } else {
                        val boo = Random.nextBoolean().toString()
                        return Pair(boo, boo)
                    }
                }
                else -> {
                    return nm.getComp(mn)
                }
            }
        }


        val rnd = Random.nextInt(3)
        val sb: String
        val out: Boolean
        val ex1 = getLogic(mn, ml, depth - 1)
        val ex2 = getLogic(mn, ml, depth - 1)

        when (rnd) {
            0 -> {
                sb = "| ${ex1.first} ${ex2.first}"
                out = ex1.second.toBoolean() || ex2.second.toBoolean()
            }
            1 -> {
                sb = "& ${ex1.first} ${ex2.first}"
                out = ex1.second.toBoolean() && ex2.second.toBoolean()
            }
            else -> {
                sb = "! ${ex1.first}"
                out = !(ex1.second.toBoolean())
            }
        }
        return Pair(sb, out.toString())
    }
}