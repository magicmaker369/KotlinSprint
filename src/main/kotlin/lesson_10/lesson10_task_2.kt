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

    val login = enterLogin()

    val password = enterPassword()

    checkLengthData(login, password)

}

fun enterLogin() : String? {
    println("Введите Логин:")
    return readln()
}

fun enterPassword() : String? {
    println("Введите Пароль:")
    return readln()
}

fun checkLengthData(login: String?, password: String?) {
    val loginLenght = "${login?.length}"
    val passwordlengt = "${password?.length}"

    println(loginLenght)
    println(passwordlengt)

    if (loginLenght < 4.toString() || passwordlengt < 4.toString())
        println("Логин или пароль недостаточно длинные. Попробуйте ввести более 4х символов.")
    else println("Вы успешно зарегистрировались!")

}