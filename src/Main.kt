fun sayHelloTwoParams(greeting: String, itemToGreet: String) = println("$greeting $itemToGreet")

fun main() {
    // Map
    // Take in pairs -> simple wrapper class containing two values -> key | value
    val interestingThings = listOf("Kotlin", "Programming", "Comic Books")
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach { key, value -> println("$key -> $value") }

    // Mutable List
    val mutableInterestingThings = mutableListOf("Kotlin", "Programming", "Comic Books")
    mutableInterestingThings.add("Dogs")
}