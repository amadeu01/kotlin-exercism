fun transcribeToRna(dna: String): String {
    return when (dna) {
        "" -> ""
        "G" -> "C"
        "C" -> "G"
        "T" -> "A"
        "A" -> "U"
        else -> {
            transcribeToRna(dna.removeRange(1, dna.length)) + transcribeToRna(dna.removeRange(0, 1))
        }
    }
}
