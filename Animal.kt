open class Animal {
    var type: String = ""
    open var age: Int = 0
    var nama: String = ""
    internal var umur = 0
    open fun animalState(): String {

        return when{
            umur < 1 -> "Belum siap diternakkan"
            umur in 1..4 -> "Siap diternakkan"
            else -> "Hewan Sudah Tua"
        }
    }
}