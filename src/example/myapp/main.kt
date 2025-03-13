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
    val aquarium5 = Aquarium(numberOfFish = 29)
    aquarium5.printSize()

    val aquarium6 = Aquarium(numberOfFish = 29)
    println("-----")
    aquarium6.printSize()
    aquarium6.volume = 70
    aquarium6.printSize()

    println("-----")
    val aquarium7 = Aquarium(length = 25, width = 25, height = 40)
    println("Aquarium 7")
    aquarium7.printSize()
    println("-----")

    println("-----")
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
    println("-----")
}

fun main(){
    buildAquarium()
}