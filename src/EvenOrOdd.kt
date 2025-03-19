//Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.

fun main(){
    println(evenOrOdd(30))

}
fun evenOrOdd(number: Int): String {
    return if(number%2 == 0) {
        "Even"
    } else {
        "Odd"
    }
}