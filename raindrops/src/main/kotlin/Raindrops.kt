class Raindrops {
    companion object {
        fun convert(input: Int, ignoreQuotient: Boolean = false) : String {
            return when {
                input % 3 == 0 -> "Pling" + convert(input.removeFactor(3), true)
                input % 5 == 0 -> "Plang" + convert(input.removeFactor(5), true)
                input % 7 == 0 -> "Plong" + convert(input.removeFactor(7), true)
                ignoreQuotient -> ""
                else -> input.toString()
            }
        }
    }
}

fun Int.removeFactor(factor: Int) : Int {
    return if (this % factor != 0) this
    else (this/factor).removeFactor(factor)
}
