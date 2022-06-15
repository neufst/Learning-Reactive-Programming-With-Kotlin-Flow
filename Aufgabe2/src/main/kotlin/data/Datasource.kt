package data

import kotlinx.coroutines.delay
import kotlin.random.Random

class Datasource {
    suspend fun getLatestValue(): Int {
        delay(1000)
        return Random.nextInt(0, 100)
    }
}