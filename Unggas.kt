class Unggas : Animal() {
    override fun animalState(): String {
        return when {
            umur < 1 -> "Belum siap diternakan"
            umur >= 1 -> "Siap diternakan"
            else -> ""
        }
    }
}