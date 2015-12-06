package net.wuerl.test.kotlin.builder

data class Data(val timestamp: Long, override val longitude: Float, override val latitude: Float, val description: String) : Location {
}

interface Location {
    val longitude: Float
    val latitude: Float
}


fun test() {
    val data = Data(System.currentTimeMillis(), 12.0f, 49f, "meins")

    val data2 = data.copy(description = "deins")
}


