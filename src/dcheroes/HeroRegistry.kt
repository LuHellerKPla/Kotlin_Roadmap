package dcheroes

//Simple Function Declaration
fun assembleJusticeLeague() {
    println("Justice League assembled!")
}

fun getHeroName(): String {
    return "Batman"
}

//Functions with Parameters
fun announceHero(name: String, city: String) {
    println("$name is protecting $city")
}

//Functions with Default Values
fun heroAlert(
    hero: String,
    threat: String = "crime",
    urgency: Int = 1,
    location: String = "Gotham"
) {
    println("Alert: $hero is fighting $threat in $location! Urgency level: $urgency")
}

// Using Named Parameters
fun deployHero(
    heroName: String,
    location: String,
    teamSupport: Boolean = false,
    equipmentNeeded: Boolean = true
) {
    println("------")
    println("Deploying $heroName to $location")
    if(teamSupport) println("Backup team requested")
    if(equipmentNeeded) println("Equipment preparation required")
}

// Single-Expression Functions
// Compact functions declaration
fun isSuperman(hero: String): Boolean = hero.equals("Superman", ignoreCase = true)
fun calculateThreatLevel(villainPower: Int, minions: Int) = villainPower * minions

// Functions that don't return values
fun activateBatSignal(): Unit {
    println("Bat-Signal activated!")
}
// Unit return type can be omitted
fun deactivateBatSignal(){
    println("Bat-Signal deactivated")
}

fun main() {
    announceHero("Batman", "Gotham")
    announceHero("Superman", "Metropolis")

    heroAlert("Batman")
    heroAlert("Superman", "Brainiac")
    heroAlert("Wonder Woman", "Cheetah", 5, "Themyscira")

    deployHero(
        heroName = "Batman",
        location = "Crime Alley",
        equipmentNeeded = true,
        teamSupport = false
    )
}