package example.myapp

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

object GoldColor : FishColor {
    override val color = "gold"
}

//abstract class AquariumFish {
//    abstract val color: String
//}

class Shark : FishAction, FishColor {
    override val color = "gray"
    override fun eat() {
        println("Hunt and eat fish")
    }
}

class GoldFish(fishColor: FishColor = GoldColor) :
    FishAction by PrintingFishAction("Eat algae"),
    FishColor by fishColor {

}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

sealed class Seal
class SeaLion: Seal()
class Walrus: Seal()

fun matchSeal(seal: Seal): String {
    return when(seal) {
        is Walrus -> "walrus"
        is SeaLion -> "sea lion"
    }
}