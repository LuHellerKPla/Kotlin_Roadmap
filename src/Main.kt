fun sayHello(greeting: String, vararg itemsToGreet: String) {
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun main() {
    val interestingThings = listOf("Kotlin", "Programming", "Comic Books")
    sayHello("Hi")

    // vararg
    sayHello("Hey", "Kotlin", "Programming", "Comic Books")

    println("-----")
    // Spread Operator
    val animals = arrayOf("Dogs", "Cats", "Ducks")
    sayHello("Hi", *animals)

    // Named arguments

}