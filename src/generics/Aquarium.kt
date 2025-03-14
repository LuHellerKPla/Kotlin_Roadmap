package generics

fun main(){
    genericsExample()
}

fun genericsExample(){
    val aquarium = Aquarium(TapWater())
    println("Water needs processing: ${aquarium.waterSupply.needsProcessing}")
    aquarium.waterSupply.addChemicalCleaners()
    println("Water needs processing: ${aquarium.waterSupply.needsProcessing}")

//    val aquarium2 = Aquarium("String")
//    println(aquarium2.waterSupply)

//    val aquarium3 = Aquarium(null)
//    if(aquarium3.waterSupply == null) {
//        println("waterSupply is null")
//    }

    val aquarium4 = Aquarium(LakeWater())
    aquarium4.waterSupply.filter()
    aquarium4.addWater()

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

//class Aquarium<T>(val waterSupply: T) // Equivalent to: class Aquarium<T: Any?>(val waterSupply: T)

class Aquarium<T: WaterSupply>(val waterSupply: T){
    fun addWater(){
        check(!waterSupply.needsProcessing) {"water supply needs processing first"}
        println("Adding water from $waterSupply")
    }
}

