package example

data class Fish (var name: String)

fun fishExamples(){
    val fish = Fish("splashy")
    with (fish.name) {
        println(capitalize())
    }
}

fun main() {
    fishExamples()
}