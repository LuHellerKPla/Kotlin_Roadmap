/*
// Step 1: Create a filter
val decorations = listOf("Couch", "FlowerPot", "Art", "Pillows", "Carpet")
fun main(){
    println(decorations.filter { it[0] == 'P' })
}

 */

//Step 2: Compare eager and lazy filters
// By default filter is eager and each time you use the filter a list is created.
fun main() {
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    //eager, creates a new list
    val eager = decorations.filter { it[0] == 'p' }
    println("eager: $eager")

    // lazy, will wait until asked to evaluate
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered")

    // force evaluation of the lazy list
    val newList = filtered.toList()
    println("new list: $newList")

    // map()
    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }
    println("-----")
    println("lazy: $lazyMap") // prints a reference to the Sequence
    println("-----")
    println("first: ${lazyMap.first()}") // access only the first element
    println("-----")
    println("all: ${lazyMap.toList()}") // convert sequence to a list and access all the elements

    val lazyMap2 = decorations.asSequence().filter { it[0] == 'p' }.map { // represents each element that passed the filter
        println("access: $it")
        it // returns the element unchanged -> returning this ensures the sequence remains unchanged after mapping
    }
    println("---//---")
    println("filtered: ${lazyMap2.toList()}")
}