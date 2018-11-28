import kotlin.random.Random

class ValidNumValue {
    fun getNum(mn: MutableList<Value>, depth: Int = 3): Pair<String, String> {
        if (depth == 0) {
            if (Random.nextBoolean() || mn.size == 0) {
                val v = Random.nextInt(100).toString()
                return Pair(v, v)
            } else {
                val v = mn[Random.nextInt(mn.size)]
                return Pair(v.name, v.value)
            }
        }


        val rnd = Random.nextInt(3)
        val sb: String
        val out: Long
        val ex1 = getNum(mn, depth - 1)
        val ex2 = getNum(mn, depth - 1)

        when (rnd) {
            0 -> {
                sb = "+ ${ex1.first} ${ex2.first}"
                out = ex1.second.toLong() + ex2.second.toLong()
            }
            1 -> {
                sb = "- ${ex1.first} ${ex2.first}"
                out = ex1.second.toLong() - ex2.second.toLong()
            }
            2 -> {
                sb = "* ${ex1.first} ${ex2.first}"
                out = ex1.second.toLong() * ex2.second.toLong()
            }
            else -> {
                if (ex2.second.toLong() != 0L) {
                    sb = "/ ${ex1.first} ${ex2.first}"
                    out = ex1.second.toLong() / ex2.second.toLong()
                } else {
                    sb = "+ ${ex1.first} ${ex2.first}"
                    out = ex1.second.toLong() + ex2.second.toLong()!!
                }
            }
        }
        return Pair(sb, out.toString())
    }
}