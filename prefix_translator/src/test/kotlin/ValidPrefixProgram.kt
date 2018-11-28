import java.lang.StringBuilder
import kotlin.random.Random
import java.util.HashMap


class ValidPrefixProgram {

    val num = ValidNumValue()
    val b = ValidLogicValue()
    var cur_i = 0

    fun getProgram(
        depth: Int = 50,
        mn: MutableList<Value> = mutableListOf(),
        ml: MutableList<Value> = mutableListOf()
    ): Pair<String, String> {
        val sb = StringBuilder()
        val out = StringBuilder()
        val mapn = mutableListOf<Value>()
        val mapl = mutableListOf<Value>()
        mapn.addAll(mn)
        mapl.addAll(ml)

        loop@ for (i in 1..depth) {
            val rnd = Random.nextInt(5)

            when (rnd) {
                0 -> {
                    if (Random.nextInt(2) == 0) {
                        val n = num.getNum(mapn)
                        sb.append("def a$cur_i ${n.first} ")
                        mapn.add(Value("a${cur_i++}", n.first, n.second))
                    } else {
                        val l = b.getLogic(mapn, mapl)
                        sb.append("def a$cur_i ${l.first} ")
                        mapl.add(Value("a${cur_i++}", l.first, l.second))
                    }
                }
                1 -> {
                    if (Random.nextInt(2) == 0 && mapn.size != 0) {
                        val n = num.getNum(mapn)
                        val r = Random.nextInt(mapn.size)
                        val st = mapn[r].name
                        sb.append("= $st ${n.first} ")
                        mapn[r].expr = n.first
                        mapn[r].value = n.second
                    } else {
                        if (mapl.size == 0) {
                            continue@loop
                        }
                        val r = Random.nextInt(mapl.size)
                        val st = mapl[r].name
                        val l = b.getLogic(mapn, mapl)
                        sb.append("= $st ${l.first} ")
                        mapl[r].expr = l.first
                        mapl[r].value = l.second
                    }
                }
                2 -> {
                    if (Random.nextInt(2) == 0) {
                        val n = num.getNum(mapn)
                        sb.append("print ${n.first} ")
                        out.append(n.second)
                    } else {
                        val l = b.getLogic(mapn, mapl)
                        sb.append("print ${l.first} ")
                        out.append(l.second)
                    }
                }
                3 -> {
                    val l = b.getLogic(mapn, mapl)
                    val ex = getProgram((depth - i) / 2, mapn, mapl)
                    if (ex.first != "") {
                        sb.append("if ${l.first} ( ${ex.first} ) ")
                        if (l.second == "true") {
                            out.append(ex.second)
                        }
                    }
                }
                else -> {
                    val l = b.getLogic(mapn, mapl)
                    val ex1 = getProgram((depth - i) / 2, mapn, mapl)
                    val ex2 = getProgram((depth - i) / 2, mapn, mapl)
                    if (ex1.first != "" && ex2.first != "") {
                        sb.append("if ${l.first} ( ${ex1.first} ) ( ${ex2.first} ) ")
                        if (l.second == "true") {
                            out.append(ex1.second)
                        } else {
                            out.append(ex2.second)
                        }
                    }
                }
            }
        }

        return Pair(sb.toString(), out.toString())
    }
}