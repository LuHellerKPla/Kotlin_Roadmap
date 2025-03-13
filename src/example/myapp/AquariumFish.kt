package example.myapp

interface FishAction {
    fun eat()
}

abstract class AquariumFish {
    abstract val color: String
}

class Shark: AquariumFish(), FishAction {
    override val color = "gray"
    override fun eat() {
        println("Hunt and eat fish")
    }
}

class GoldFish: AquariumFish(), FishAction {
    override val color = "gold"
    override fun eat() {
        println("Eat algae")
    }
}