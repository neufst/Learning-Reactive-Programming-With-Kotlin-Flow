import kotlin.system.*
import kotlinx.coroutines.*
import java.sql.DriverManager.println

fun main() =
    runBlocking<Unit> {

        // Einen Mitarbeiter auswählen und einer Bestellung zuweisen
        for(x in 1..3){
            println (orders.size)
            async { processOrder() }}
}

suspend fun selectOrder() = coroutineScope {
    val order = async { getOrder() }
    order.await()
}

suspend fun selectEmployee() = coroutineScope {
    val employee = async { getEmployee() }
    employee.await()
}

suspend fun processOrder() = coroutineScope {
    val orderPromise = async { selectOrder() }
    val employeePromise = async { selectEmployee() }
    assignOrder(employeePromise.await(), orderPromise.await())
}

fun assignOrder(employee: String, order: Int) {
    println(employee + " is assigned to " + order)
}

// --------------

var employees = mutableListOf("Bob", "Alice", "Peter", "Oscar")
suspend fun getEmployee(): String {
    var first = employees.first()
    employees.remove(first)
    return first
}

var orders = mutableListOf(1,2,3)
suspend fun getOrder(): Int {
    var first = orders.first()
    orders.remove(first)
    return first
}
