import kotlin.random.Random

class ValidCompare {
    val nm = ValidNumValue()

    fun getComp(mn: MutableList<Value>): Pair<String, String> {
        val ex1 = nm.getNum(mn,1)
        val ex2 = nm.getNum(mn,1)

        val rnd = Random.nextInt(3)

        val sb: String
        val out: Boolean

        when (rnd) {
            0 -> {
                sb = "== ${ex1.first} ${ex2.first}"
                out = ex1.second.toLong() == ex2.second.toLong()
            }
            1 -> {
                sb = "< ${ex1.first} ${ex2.first}"
                out = ex1.second.toLong() == ex2.second.toLong()
            }
            2 -> {
                sb = "<= ${ex1.first} ${ex2.first}"
                out = ex1.second.toLong() == ex2.second.toLong()
            }
            3 -> {
                sb = ">= ${ex1.first} ${ex2.first}"
                out = ex1.second.toLong() == ex2.second.toLong()
            }
            4 -> {
                sb = "> ${ex1.first} ${ex2.first}"
                out = ex1.second.toLong() == ex2.second.toLong()
            }
            else -> {
                sb = "!= ${ex1.first} ${ex2.first}"
                out = ex1.second.toLong() == ex2.second.toLong()
            }
        }

        return Pair(sb, out.toString())
    }
}