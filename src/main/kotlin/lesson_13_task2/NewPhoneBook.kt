package org.example.lesson_13_task2

/*
Задача 2 к Уроку 13

Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.

На его основе создай экземпляр. Для поля с названием компании значение по умолчанию должно быть null.

Дополни класс методом, который будет печатать информацию о контакте сообщением в одном println() и
без использования многострочного ввода такого типа (пример):

- Имя: Ростислав
- Номер: 89123456789
- Компания: Reddit

Вместо null значения, в консоль должна выводиться строка <не указано>.
 */

class NewPhoneBook(
    private val name: String,
    private val phoneNumber: Long,
    private val companyName: String? = null,
) {

    fun printInfo() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${companyName ?: "Не указано."}")
    }
}

fun main() {

    val firstPeople = NewPhoneBook("Peter", 9000800)
    println("Информация из записной книжки:")
    firstPeople.printInfo()
}

