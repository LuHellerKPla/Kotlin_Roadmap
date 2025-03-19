/*
Your goal is to create a function that removes the first and last characters of a string.
You're given one parameter, the original string.
You don't have to worry about strings with less than two characters.
 */

fun main() {
    removeChar("Hello")
}

fun removeChar(string: String): String {
    val middle = string.subSequence(1, string.length - 1)
    return "$middle"
}