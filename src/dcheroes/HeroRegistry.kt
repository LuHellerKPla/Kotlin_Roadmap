package dcheroes

// Simple class definition
class Superhero {
    var name: String = ""
    var power: String = ""
    var powerLevel: Int = 0

    fun useAbility(){
        println("$name uses $power!")
    }
}

// Primary constructor
class JusticeLeagueMember(
    val name: String,
    var isActive: Boolean = true,
    private val secretIdentity: String
) {
    var missionCount: Int = 0

    init {
        println("New Justice League member registered: $name")
    }

    init {
        if(secretIdentity.isNotEmpty()) {
            println("Secret identity secured in database")
        }
    }
}

// Custom Accessors
class Batmobile {
    var fuelLevel = 100
    private set

    var isRunning = false
        get() = field && fuelLevel > 0
        set(value) {
            println("Batmobile status changing to: $value")
            field = value
        }

    fun drive (distance: Int) {
        if (isRunning && fuelLevel >= distance) {
            fuelLevel -= distance
            println("Batmobile drove $distance units. Fuel remaining: $fuelLevel")
        } else {
            println("Cannot drive: ${ if (!isRunning) "Engine off" else "Not enough fuel"}")
        }
    }
}

// Multiple Ways to Create Objects
class Villain(val name: String, var threatLevel)

fun main() {
    val batman = Superhero()
    batman.name = "Batman"
    batman.power = "Detective Skills"
    batman.powerLevel = 90
    batman.useAbility()

    val superman = JusticeLeagueMember("Superman", true, "Clark Kent")

    println(Batmobile().drive(5))
}