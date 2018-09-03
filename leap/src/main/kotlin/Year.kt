class Year(val year: Int) {
    val isLeap: Boolean

    init {
        isLeap = isYearLeap()
    }

    private fun isYearLeap() : Boolean {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)
    }
}
