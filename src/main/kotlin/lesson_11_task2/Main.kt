package org.example.lesson11_task2

/*
Задача 2 к Уроку 11

Скопируй класс User из первой задачи и назови User2.
Добавь к классу новое необязательное свойство bio и несколько методов:

- вывод информации о пользователе в консоль;
- считывание из консоли текста и запись в поле bio;
- изменение пароля — сначала запросить текущий пароль, и, если он введен верно, запросить новый.
Записать его в поле и сообщить, что пароль изменен;

Далее создай объект, заполни информацию “о себе” и замени пароль.
В конце выведи обновленную информацию о пользователе.
 */

class User2(
    val id: Int,
    var password: String,
    val email: String,
    var bio: String? = null,
) {

    fun printUserInfo() {
        println(
            """
            Информация об юзере: 
            id = $id
            password = $password
            email = $email
            ${
                if (bio != null) {
                    "bio = $bio"
                } else ""
            }
        """.trimIndent()
        )
    }

    fun updateUserBio() {
        println("Заполните bio:")
        val newBio = readln()
        bio = newBio
        println("Отлично, Ваше описание в bio успешно обновлено.")
    }

    fun updateUserPassword() {
        println("Для обновления пароля, пожалуйста, подтвердите свою личность, введя текущий пароль:")

        do {
            val currentPassword = readln()

            if (currentPassword != password) {
                println(
                    """
                    Пароль введен не верно.
                    Попробуйте ещё раз:
                """.trimIndent()
                )
            }
        } while (currentPassword != password)

        println("Введите новый пароль:")
        val newPassword = readln()

        password = newPassword

        println("Отлично, Ваш новый пароль успешно обновлен.")

    }

}


fun main() {

    val user = User2(
        3,
        "asd123",
        "abc@google.com",
    )

    user.printUserInfo()

    println("---")

    user.updateUserBio()

    println("---")

    user.printUserInfo()

    println("---")

    user.updateUserPassword()

    println("---")

    user.printUserInfo()

}