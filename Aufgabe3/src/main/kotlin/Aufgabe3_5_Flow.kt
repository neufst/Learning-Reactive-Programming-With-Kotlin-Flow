import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() = runBlocking<Unit> {
    // Hier Lösung mit den beiden gegebenen Flows implementieren
}


val employee = flowOf("Bob", "Alice", "Peter", "Oscar")
val order = (1..3).asFlow()
