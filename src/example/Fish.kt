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
    runExample()
}

fun runExample(){
    /*
    val runnable = object: Runnable {
        override fun run() {
            println("I'm a Runnable")
        }
    }
    JavaRun.runNow(runnable)
    */
    JavaRun.runNow {
        println("Passing a lambda as a Runnable")
    }
}