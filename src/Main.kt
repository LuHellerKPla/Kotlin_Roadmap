//Function Parameters
fun sayHello(itemToGreet: String) {
    val msg = "Hello " + itemToGreet
    println(msg)
}

// String Templates
fun sayHelloWithStringTemplate(itemToGreet: String) {
    val msg = "Hello $itemToGreet"
    println(msg)
    println("Hello $itemToGreet")
}

// Single expression function
fun sayHelloInSEF(itemToGreet: String) = println("Hello $itemToGreet")

// Take in two parameters
fun sayHelloTwoParams(greeting: String, itemToGreet: String) = println("$greeting $itemToGreet")

fun main() {
    sayHello("Kotlin")
    sayHello("Lion")

    sayHelloWithStringTemplate("String template")

    sayHelloInSEF("whale")

    sayHelloTwoParams("Hey", "Steve")
}