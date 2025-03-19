val name = "Nate"
var greeting: String? = null

fun main() {
    greeting = "Hello"
    val greetingToPrintIf = if(greeting != null) greeting else "Hi"
    val greetingToPrintWhen = when (greeting) {
        null -> "Hi"
        else -> greeting
    }

    println(greetingToPrintIf)
    println(greetingToPrintWhen)
    println(name)
}
