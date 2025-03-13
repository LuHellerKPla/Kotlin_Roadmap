package example.myapp

class Aquarium (var length: Int = 100, var height: Int = 40, var width: Int = 20) {
    var volume: Int
        get() = width * height * length / 1000
        set(value) { // value is the conventional name of the parameter
            height = (value * 1000) / (width * length)
        }

    init {
        println("Aquarium initializing")
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

        // 1L = 1000 cmˆ3
        println("Volume: $volume L")
    }
}