// Step 2: Create a higher-order function
fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun increaseDirty(start: Int) = start + 1

fun main() {
    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
    var dirtyLevel = 19
    dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23 }

    println(updateDirty(30, waterFilter))
    println(updateDirty(15, ::increaseDirty))
    println(dirtyLevel)
}