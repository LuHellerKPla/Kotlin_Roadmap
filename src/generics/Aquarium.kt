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

//    val aquarium4 = Aquarium(LakeWater())
//    aquarium4.waterSupply.filter()
//    aquarium4.addWater()

    val aquarium5 = Aquarium(TapWater())
    addItemTo(aquarium5)

    val cleaner = TapWaterCleaner()
    val aquarium6 = Aquarium(TapWater())
    aquarium6.addWater(cleaner)

    val aquarium7 = Aquarium(TapWater())
    isWaterClean(aquarium7)

    val aquarium8 = Aquarium(TapWater())
    println(aquarium8.hasWaterSupplyOfType<TapWater>())

    val aquarium9 = Aquarium(TapWater())
    println(aquarium9.waterSupply.isOfType<TapWater>())
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

class Aquarium<out T: WaterSupply>(val waterSupply: T){
    fun addWater(cleaner: Cleaner<T>){
        if(waterSupply.needsProcessing){
            cleaner.clean(waterSupply)
        }
        println("Water added")
    }

}

inline fun <reified R : WaterSupply> Aquarium<*>.hasWaterSupplyOfType() = waterSupply is R

fun addItemTo( aquarium: Aquarium<WaterSupply>) = println("item added")

interface Cleaner<in T: WaterSupply> {
    fun clean(waterSupply: T)
}

class TapWaterCleaner : Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) = waterSupply.addChemicalCleaners()
}

fun <T: WaterSupply> isWaterClean(aquarium: Aquarium<T>) {
    println("Aquarium water is clean: ${!aquarium.waterSupply.needsProcessing}")

}
inline fun <reified T : WaterSupply> WaterSupply.isOfType() = this is T

