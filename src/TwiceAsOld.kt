/*
* Your function takes two arguments:
    1. current father's age (years)
    2. current age of his son (years)
* Сalculate how many years ago the father was twice as old as his son (or in how many years he will be twice as old).
* The answer is always greater or equal to 0, no matter if it was in the past or it is in the future.
*
* */

fun main(){
    println(twiceAsOld(45, 25))
}

fun twiceAsOld(dadAgeToday: Int, sonAgeToday: Int): Int {
    var dadIsTwice = sonAgeToday * 2
    if (dadAgeToday > dadIsTwice) {
        var dadWasTwice = dadAgeToday - dadIsTwice
        println("The son is currently $sonAgeToday and the dad would have been twice as old $dadWasTwice years ago")
        return dadWasTwice
    } else {
        var dadWillTwice = dadIsTwice - dadAgeToday
        println("The son is currently $sonAgeToday and the dad would have to be $dadWillTwice years older")
        return dadWillTwice
    }
}