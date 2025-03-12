import java.util.*

fun swim(speed: String = "fast") {
    println("Swimming $speed")
}

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        day == "Sunday" -> true
        temperature > 30 -> true
        dirty > 30 -> true
        else -> false
    }
}

fun fishFood (day: String): String {
    return when (day) {
        "Monday" -> "Apple"
        "Tuesday" -> "Banana"
        "Wednesday" -> "Meet"
        "Thursday" -> "Grapes"
        "Friday" -> "Pepper"
        "Saturday" -> "Pineapple"
        "Sunday" -> "Carrot"
        else -> "No food"
    }
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWater(day)}")
}

fun randomDay(): String {
    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun main() {
    feedTheFish()
    swim() // default value
    swim("slow") // positional argument
    swim(speed = "turle-like") // named parameter
}