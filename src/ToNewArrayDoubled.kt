// Given an array of integers, return a new array with each value doubled.

fun main() {
    val numbers = intArrayOf(2,2,2,2,2,2,2)
    val doubledNumbers = maps(numbers)
    println(doubledNumbers.joinToString())
}

fun maps(x:IntArray): IntArray {
    return x.map { it * 2 }.toIntArray()
}