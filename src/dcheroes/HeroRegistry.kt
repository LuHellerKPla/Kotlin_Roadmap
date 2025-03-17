package dcheroes

//Create a hero profile system

fun createHeroProfile(
    name: String,
    secretIdentity: String?,
    powerLevel: Int,
    isMetahuman: Boolean
) {
    println(
        """
            Hero Profile:
                Name: $name
                Secret identity: ${secretIdentity ?: "CLASSIFIED"}
                Power level: $powerLevel
                Metahuman: $isMetahuman
                
            """.trimIndent()
    )
}

fun analyzeHero(hero: Any) {
    when(hero) {
        is String -> println("Hero name: $hero")
        is Int -> println("Hero power level: $hero")
        else -> println("Unknown hero data")
    }
}

fun main() {
    // Create various hero profiles
    createHeroProfile("Batman", "Bruce Wayne", 90, false)
    createHeroProfile("Superman", "Clark Kent", 100, true)
    createHeroProfile("Wonder Woman", "Diana Prince", 95, true)
    createHeroProfile("The Flash", null, 85, true)

    analyzeHero("Batman")
    analyzeHero(95)
    analyzeHero(true)
}