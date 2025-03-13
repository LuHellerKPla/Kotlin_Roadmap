package example.myapp.decor

data class Decoration (val rocks: String) {
}

fun main(){
    makeDecoration2()

    println(Direction.EAST.name)
    println(Direction.EAST.ordinal)
    println(Direction.EAST.degrees)

}

fun makeDecorations() {
    val decoration1 = Decoration("Granite")
    println(decoration1)

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)

    println("---")
    println(decoration1.equals(decoration2))
    println(decoration3.equals(decoration2))
    println("---")
}

data class Decoration2(val rocks: String, val wood: String, val diver: String) {

}
fun makeDecoration2() {
    println("---")
    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)

    // assign all properties to variables
    val (rock, _, diver) = d5
    println(rock)
//    println(wood)
    println(diver)
    println("---")
}

enum class Color(val rbg: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF)
}

enum class Direction(val degrees: Int) {
    NORTH(0),
    SOUTH(180),
    EAST(90),
    WEST(270)
}