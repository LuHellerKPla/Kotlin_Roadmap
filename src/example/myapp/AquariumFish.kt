package example.myapp

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

object GoldColor: FishColor {
    override val color = "gold"
}

//abstract class AquariumFish {
//    abstract val color: String
//}

class Shark: FishAction, FishColor {
    override val color = "gray"
    override fun eat() {
        println("Hunt and eat fish")
    }
}

class GoldFish(fishColor: FishColor = GoldColor): FishAction, FishColor by fishColor {
//    override val color = "gold"
    override fun eat() {
        println("Eat algae")
    }
}