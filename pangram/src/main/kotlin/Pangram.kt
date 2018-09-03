class Pangram {
    companion object {
        fun isPangram(pangram: String) : Boolean {
            for (letter in 'a'..'z') {
                if (!pangram.contains(letter, true)) return false
            }
            return true
        }
    }
}
