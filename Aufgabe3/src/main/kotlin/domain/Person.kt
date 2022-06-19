package domain

import java.time.LocalDate
import java.time.format.DateTimeFormatter

data class Person(
    val firstName: String,
    val lastName: String,
    val birthday: LocalDate
) {
    override fun toString(): String {
        return """
            $firstName $lastName, geboren am ${birthday.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))}
        """.trimIndent()
    }
}