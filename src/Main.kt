fun sayHello(greeting: String, itemsToGreet: List<String>) {
    itemsToGreet.forEach{ itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun main() {
    // Multiple Things
    val interestingThings = listOf("Kotlin", "Programming", "Comic Books")
    sayHello("Hi", interestingThings)
}