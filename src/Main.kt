fun sayHelloTwoParams(greeting: String, itemToGreet: String) = println("$greeting $itemToGreet")

fun main() {
    // Lists
    val interestingThings = listOf("Kotlin", "Programming", "Comic Books")
    interestingThings.forEach{ interestingThing ->
        println(interestingThing)
    }
}