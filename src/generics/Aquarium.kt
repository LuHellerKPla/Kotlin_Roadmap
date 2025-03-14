package generics

fun main(){
    genericsExample()
}

fun genericsExample(){
    val aquarium = Aquarium(TapWater())
    println("Water needs processing: ${aquarium.waterSupply.needsProcessing}")
    aquarium.waterSupply.addChemicalCleaners()
    println("Water needs processing: ${aquarium.waterSupply.needsProcessing}")
}

open class WaterSupply(var needsProcessing: Boolean)

class TapWater : WaterSupply(true) {
    fun addChemicalCleaners(){
        needsProcessing = false
    }
}

class FishStoreWater : WaterSupply (false)

class LakeWater : WaterSupply (true) {
    fun filter() {
        needsProcessing = false
    }
}

class Aquarium<T>(val waterSupply: T)


