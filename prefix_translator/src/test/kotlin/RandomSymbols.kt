import java.lang.StringBuilder
import kotlin.random.Random

class RandomSymbols {
    val symbols = arrayListOf(
        "if",
        "(",
        ")",
        "print",
        "def",
        "|",
        "&",
        "!",
        "true",
        "false",
        "+",
        "-",
        "*",
        "/",
        "==",
        "!=",
        "<",
        "<=",
        ">",
        ">=",
        "="
    )

    val vars = arrayListOf(
        "a",
        "A",
        "a_A",
        "a0",
        "a97ad8f6sdfs98",
        "fd_87_SDF_sDFSF",
        "sdfsdf",
        "f345345345",
        "f111",
        "f0",
        "ADDWDW_ewfwef_F_E"
    )

    val not_valid = arrayListOf("@", "#", "$", "%", ";", "fe%", "!!!", "0ff", "<>")

    fun getValidSymbols(): String {
        val sb = StringBuilder()
        for (i in 0..100) {
            val rnd = Random.nextInt(symbols.size + 2)
            if (rnd == 0) {
                sb.append(vars[Random.nextInt(vars.size)]).append(" ")
                continue
            }

            if (rnd == 1) {
                sb.append(Random.nextInt(Int.MAX_VALUE)).append(" ")
                continue
            }

            sb.append(symbols[rnd - 2]).append(" ")
        }
        return sb.toString()
    }

    fun getNotValidSymbols(): String = when (Random.nextInt(3)) {

        0 -> "${not_valid[Random.nextInt(not_valid.size)]} ${getValidSymbols()}"

        1 -> "${getValidSymbols()} ${not_valid[Random.nextInt(not_valid.size)]} ${getValidSymbols()}"

        else -> "${getValidSymbols()} ${not_valid[Random.nextInt(not_valid.size)]}"
    }
}