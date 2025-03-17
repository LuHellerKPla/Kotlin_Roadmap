package dcheroes

fun main() {
    println("Welcome to the Justice League Registry!")

    val leagueName = "Justice League"
    println("Welcome to the $leagueName")
    println("The ${leagueName.length} heroes are assembled")

    val heroName = "Batman" //Immutable
    var villainCount = 5 // Mutable
    villainCount = 6

    // Basic Types:
    val speedForce: Int = 9000
    val heroStrength: Double = 99.9
    val villainPower: Float = 45.5f
    val sidekickCount: Short = 123
    val universeNumber: Long = 52L

    // Characters and Strings
    val heroInitial: Char = 'B'
    val heroAlias: String = "Dark Knight"

    //Boolean
    val isSuperhuman: Boolean = false

    //Type Inference and Explicity Declaration
    val hero = "Wonder Woman" // type is string
    val powerLevel = 95 // type is Int

    val heroo: String = "Flash"
    val powerLevell: Int = 100

    //Null Safety
    //Non-nullable (regular) types
    val superman: String = "Clark Kent"
    // superman = null -> error

    //Nullable types
    var batman: String? = "Bruce Waynee"
    batman = null

    //Working with nullable types
    val batcave: String? = null
    println(batcave?.length)
    println(batcave?.length ?: 0)

}