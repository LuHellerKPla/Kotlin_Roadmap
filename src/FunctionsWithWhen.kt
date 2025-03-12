import java.util.*

fun pickRandomDay() : String {
    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun disneyMovie(day: String): String {
    return when (day) {
        "Monday" -> "The Lion King"
        "Tuesday" -> "Lilo and Stitch"
        "Wednesday" -> "Toy Story"
        "Thursday" -> "Hercules"
        "Friday" -> "Encanto"
        "Saturday" -> "The Emperor's New Groove"
        "Sunday" -> "Tarzan"
        else -> "None"
    }
}

fun chooseMovie() {
    val day = pickRandomDay()
    val movie = disneyMovie(day)

    println("Today is $day and I will watch $movie")
}

fun main() {
    chooseMovie()
}