fun getGreeting(): String {
    return "Hello Kotlin"
}

//Single Expression Function
fun getGreetingSEF() = "Hello Single Expression Function"

fun sayHello() {
    println(getGreeting())
}

fun main() {
    println("Hello World")
    println(getGreeting())
    sayHello()
    println(getGreetingSEF())
}