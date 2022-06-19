package datasource

import io.github.serpro69.kfaker.Faker
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.time.LocalDate
import kotlin.random.Random

class Datasource() {
    val faker = Faker()

    fun getPerson(): Flow<Person> = flow{
        while (true) {
            delay(1000)
            emit(
                Person(
                    name = faker.name,
                    birthday = faker.person.birthDate(age = Random.nextLong(1, 100))
                )
            )
        }
    }
}

class Person(
    val name: io.github.serpro69.kfaker.provider.Name,
    val birthday: LocalDate
)