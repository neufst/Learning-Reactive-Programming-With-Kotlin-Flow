import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.take
import kotlinx.coroutines.runBlocking
import java.math.BigInteger

fun main() {
    runBlocking {
        fibonacciFlow.take(12).collect {
            println(it.toString())
        }
    }
}

val fibonacciFlow: Flow<BigInteger> = flow {
    var x = BigInteger.ZERO
    var y = BigInteger.ONE
    while (true) {
        delay(600)
        emit(x)
        x = y.also {
            y += x
        }
    }
}
