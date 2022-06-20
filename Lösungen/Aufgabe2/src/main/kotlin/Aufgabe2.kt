import data.Datasource
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() {
    val datasource = Datasource()
//    runBlocking {
//        println( datasource.getLatestValue() )
//    }
//
//    val time = measureTimeMillis {
//        runBlocking {
//            launch {
//                println( datasource.getLatestValue())
//            }
//            launch {
//                println( datasource.getLatestValue())
//            }
//            launch {
//                println( datasource.getLatestValue())
//            }
//        }
//    }
//    println("Benötigte Zeit: $time ms")

    val time2 = measureTimeMillis {
        runBlocking {
            var value1 = async {
                datasource.getLatestValue()
            }
            var value2 = async {
                datasource.getLatestValue()
            }
            println(
                value1.await() + value2.await()
            )
        }
    }
    println("Benötigte Zeit: $time2 ms")




}