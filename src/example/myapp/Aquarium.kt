package example.myapp

class Aquarium (var length: Int = 100, var height: Int = 40, var width: Int = 20) {


    init {
        println("Aquarium initializing")
    }
    init {
        // 1 liter = 1000 cm^3
        println("Volume: ${width * length * height / 1000}L ")
    }

    constructor(numberOfFish: Int): this() {
        // 2000 cmˆ3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1

        // calculate height needed
        height = (tank / (length * width)).toInt()
    }

    fun printSize() {
        println(
            "Width: $width cm " +
                    "Length: $length cm " +
                    "Height: $height cm "
        )
    }
}