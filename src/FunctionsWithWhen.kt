fun disneyMovie (day: String) : String {
    var movie = ""
    when (day) {
        "Monday" -> movie = "The Lion King"
        "Tuesday" -> movie = "Lilo and Stitch"
        "Wednesday" -> movie = "Toy Story"
        "Thursday" -> movie = "Hercules"
        "Friday" -> movie = "Encanto"
        "Saturday" -> movie = "The Emperor's New Groove"
        "Sunday" -> movie = "Tarzan"
        else -> movie = "None"
    }
    return movie
}

fun chooseMovie(){
    val day = randomDay()
    val movie = disneyMovie(day)

    println("Today is $day and I will watch $movie")
}

fun main (){
    chooseMovie()
}