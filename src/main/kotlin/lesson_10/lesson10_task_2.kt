package org.example.lesson_10

/*
Задача 2 к Уроку 10

Для регистрации в приложении пользователь придумывает логин и пароль.
И логин, и пароль должны содержать в себе хотя бы 4 символа.
Если всё верно, программа выводит приветственное сообщение.

- считывай логин и пароль с консоли поочередно;
- вынеси в отдельную функцию валидацию длины введенных данных;
- если логин или пароль меньше 4 символов – вывести сообщение: "Логин или пароль недостаточно длинные".
 */

fun main() {

    println("Для регистрации в приложении создайте Логин и Пароль")

    println("Введите Логин:")
    val login = fillField()

    println("Введите Пароль:")
    val password = fillField()

    val resultCheckForLogin = checkLengthField(login)
    val resultCheckForPassword = checkLengthField(password)

    if (!resultCheckForLogin || !resultCheckForPassword)
        println("Логин или пароль недостаточно длинные. Попробуйте ввести более 3х символов.")
    else println("Вы успешно зарегистрировались!")

}

fun fillField() : String? {
    return readln()
}

fun checkLengthField(nameField: String?): Boolean {

    val findLength = "${nameField?.length}"
    val minLength = 4

    return findLength >= minLength.toString()

}
