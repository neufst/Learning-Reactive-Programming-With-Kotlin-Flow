import jdk.internal.net.http.common.Pair
import kotlin.collections.*
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

    fun main() = runBlocking<Unit> {
        // Hier Lösung implementieren
    }

    fun simple(): Flow<String> = flow {

        val longerPause:Long = 500;
        val typingDelay:Long = 50;

        val textInput = listOf(Pair("j",typingDelay),Pair("jav",typingDelay),Pair("java",typingDelay),
            Pair("",longerPause),
            Pair("ko",typingDelay),Pair("kotl",typingDelay),Pair("kotlin",typingDelay))
        for (i in textInput) {
            emit(i.first)
            delay(i.second) // Pause bis zum nächsten Tastenanschlag
        }
    }


