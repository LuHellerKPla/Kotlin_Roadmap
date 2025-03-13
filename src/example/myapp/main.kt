package example.myapp


fun buildAquarium() {
    val aquarium1 = Aquarium()
    aquarium1.printSize()

    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()

    val aquarium3 = Aquarium(height = 35, length = 110)
    aquarium3.printSize()

    val aquarium4 = Aquarium(width = 10, height = 75, length = 150)
    aquarium4.printSize()

    // volume will print twice, once by the init block in the primary constructor before the second is executed, and once by the code in buildAquarium()
    println("-----")
    val aquarium6 = Aquarium(numberOfFish = 29)
    aquarium6.printSize()
    println("Volume: ${aquarium6.width * aquarium6.length * aquarium6.height / 1000}L")
}

fun main(){
    buildAquarium()
}