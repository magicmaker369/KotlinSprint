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
) {

}