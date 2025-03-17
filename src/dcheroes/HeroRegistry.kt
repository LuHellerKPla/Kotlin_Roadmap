package dcheroes

fun main() {
    //String templates
    val hero = "Batman"
    val city = "Gotham"
    println("$hero protects $city")
    println("${ hero.length} letters in $hero")

    //Raw Strings (Triple Quotes)
    val heroProfile = """
        Hero Name: Batman
        Secret Identity: Bruce Wayne
        Base: Gotham City
        Abilities:
            - Master Detective
            - Peak Human Condition
            - Expert Fighter
    """.trimIndent()
    println(heroProfile)
}