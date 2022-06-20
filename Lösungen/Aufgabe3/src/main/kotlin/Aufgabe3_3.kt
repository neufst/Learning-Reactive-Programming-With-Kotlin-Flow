import datasource.Datasource
import domain.Person
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking

fun main() {
    val dataSource = Datasource()
    val nameFlow = dataSource.getPerson()
    runBlocking {
        nameFlow.map {
            Person(
                firstName = it.name.firstName(),
                lastName = it.name.lastName(),
                birthday = it.birthday
            )
        }.collect{
            println(it)
        }
    }
}