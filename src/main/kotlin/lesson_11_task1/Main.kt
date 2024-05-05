package org.example.lesson_11

/*
Задача 1 к Уроку 11

Создай класс, который будет хранить данные пользователя.
В свойствах должна храниться информация об уникальном идентификаторе, логине, пароле и почте.
Названием может быть, например, User.
Создай два экземпляра класса с произвольными данными и выведи в консоль содержимое их полей.
*/


class User(
    val id: Int,
    val password: String,
    val email: String,
)

fun main() {

    val firstUser: User = User(
        id = 1,
        password = "1q2w3e",
        email = "firstuser@google.com",
    )

    val secondUser: User = User(
        id = 2,
        password = "q1w2e3",
        email = "seconduser@google.com",
    )

    println("Данные первого юзера:")
    println(firstUser.id)
    println(firstUser.password)
    println(firstUser.email)

    println("")

    println("Данные второго юзера:")
    println(secondUser.id)
    println(secondUser.password)
    println(secondUser.email)

}
