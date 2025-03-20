fun sayHelloTwoParams(greeting: String, itemToGreet: String) = println("$greeting $itemToGreet")

fun main() {
    val interestingThings = arrayOf("Kolin", "Programming", "Comic Books")
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))
    println("-----")

    // Iterating Over Collections
    for (interestingThing in interestingThings) {
        println(interestingThing)
    }
    println("-----")
    interestingThings.forEach {
        println(it)
    }
    println("-----")
    // Using another name for it
    interestingThings.forEach { interestingThing->
        println(interestingThing)
    }

    println("-----")
    // Pass the current index as well as the current string
    interestingThings.forEachIndexed{index, interestingThing ->
        println("$interestingThing is at index $index")
    }
}