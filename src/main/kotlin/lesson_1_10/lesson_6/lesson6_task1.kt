package org.example.lesson_6

/*
Задача 1 к Уроку 6

На этапе авторизации в приложении пользователь, не имея аккаунта, выбрал регистрацию.
Нужно создать блок программы, который сначала предлагает создать логин и пароль,
затем запрашивает их, чтобы войти в приложение.

Если логин или пароль введены неверно – данные запрашиваются заново.
Если данные верны, выводится сообщение – “Авторизация прошла успешно”.
 */

fun main() {

    println(
        """
        Для регистрации создайте логин и пароль. 
        
        Придумайте и введите логин: 
    """.trimIndent()
    )
    val createLogin = readln()

    println("Придумайте и введите пароль:")
    val createPassword = readln()

    do {
        println("Введите свой логин")
        val enterLogin = readln()

        println("Введите свой пароль")
        val enterPassword = readln()
    } while (createLogin != enterLogin && createPassword != enterPassword)
    println("Авторизация прошла успешно")

}