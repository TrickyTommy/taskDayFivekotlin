
fun main (){
    val murai= Fowl()
    murai.nama ="murai batu"
    murai.age = 6
    murai.type = "vertebrata"
    println(murai.animalState())
    println(murai.toString())

    val tengiri =  Fish(nama = "tengiri laut", age = 3, type = "vertebrata")

    println(tengiri.toString())
    println("${tengiri.nama} state: ${tengiri.animalState()}")
    println("${tengiri.nama} dengan water content: ${tengiri.calculateMass(10, 5)}")
    println("${tengiri.nama}tanpa water content: ${tengiri.calculateMass(10)}")
}