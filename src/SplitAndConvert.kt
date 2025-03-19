//Write a function to split a string and convert it into an array of words.


fun main(){
stringToArray("Hello world")
}

fun stringToArray(s: String): List<String> {
    var splitted = s.split(" ")
    println(splitted)


    return splitted
}