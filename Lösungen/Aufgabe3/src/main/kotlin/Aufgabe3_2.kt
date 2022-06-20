import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking

val numbersFlow = flowOf(1, 2, 3).onEach { delay(1000) }
val lettersFlow = flowOf("A", "B", "C").onEach { delay(2000) }

fun main() {
    runBlocking {
        numbersFlow.combine(lettersFlow) { number, letter ->
            "$number$letter"
        }.collect {
            println(it)
        }

    }
}