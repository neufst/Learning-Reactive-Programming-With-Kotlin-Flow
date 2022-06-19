import datasource.Datasource
import domain.Person
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking

fun main() {
    val dataSource = Datasource()
    val nameFlow = dataSource.getPerson()
    runBlocking {

    }
}