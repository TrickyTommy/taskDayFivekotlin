class Fish internal constructor(nama: String, age: Int, type: String) : Animal() {

    init {
        super.age = age
        super.type = type
        super.nama = nama
    }

    override var age = 0
    fun calculateMass(weight:Int) : Int{
        return age * weight

    }
    fun calculateMass(weight:Int,waterContent:Int) : Int{
        return age * weight - waterContent

    }

}