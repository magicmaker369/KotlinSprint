package org.example.lesson_13_task1

/*
Задача 1 к Уроку 13

Для программы телефонного справочника создай класс, который будет хранить имя, номер телефона и компанию.
Номер телефона – целочисленное значение (Long).

При создании объекта компания может оставаться незаполненной.
Вместо пустой строки поле может принимать null.

Все свойства класса не должны иметь инициализации по умолчанию.
 */

class PhoneBook(
    val name: String,
    val phoneNumber: Long,
    val companyName: String?,
)

fun main() {

    val firstCompany = PhoneBook("Xосе", 88888888, null)

    println(
        """
        Данные компании №1:
        Имя: ${firstCompany.name}
        Номер телефона: ${firstCompany.phoneNumber}
        Название компании: ${firstCompany.companyName ?: "Не найдено."}
    """.trimIndent()
    )
}