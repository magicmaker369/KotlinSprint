package org.example.lesson_5

/*
Задача 3 к Уроку 5

Для алгоритма простого приложения-лотереи, нужно угадать два числа от 0 до 42.
Если угадать только одно – игрок получает утешительный приз.
Напиши программу, проверяющую выигрыш.
Пользователь должен вводить числа в консоль.
Правильные числа заранее известны и хранятся в переменных.
Оформить ввод текстовыми подсказками о том, что нужно вводить.
Вывести отдельным сообщением, какие числа были нужны для победы.

- если оба числа угаданы вывести “Поздравляем! Вы выиграли главный приз!”;
- если угадано только одно число, вывести “Вы выиграли утешительный приз!”;
- если не угадано ничего, вывести “Неудача!”;
- программа должна учитывать ввод чисел в обратном порядке.
 */

fun main() {

    val firstSuccessDigit = 1
    val secondSuccessDigit = 41
    val minDigit = 0
    val maxDigit = 42

    println("Введите первое число от $minDigit до $maxDigit в консоль, чтобы проверить свой выйгрыш: ")
    val enterFirstDigit = readlnOrNull()?.toIntOrNull()

    println("Введите второе число от $minDigit до $maxDigit  в консоль, чтобы проверить свой выйгрыш: ")
    val enterSecondDigit = readlnOrNull()?.toIntOrNull()

    if (enterFirstDigit == firstSuccessDigit &&
        enterSecondDigit == secondSuccessDigit ||
        enterSecondDigit == firstSuccessDigit &&
        enterFirstDigit == secondSuccessDigit)
        println("""
            Поздравляем! Вы выиграли главный приз!
        """.trimIndent())
    else if (enterFirstDigit == firstSuccessDigit ||
        enterSecondDigit == secondSuccessDigit ||
        enterFirstDigit == secondSuccessDigit ||
        enterSecondDigit == firstSuccessDigit)
        println("""
        Вы выиграли утешительный приз!
        В этот раз выигрышными числами были $firstSuccessDigit и $secondSuccessDigit
        """.trimIndent())
    else println("""
        Неудача!
        В этот раз выигрышными числами были $firstSuccessDigit и $secondSuccessDigit
    """.trimIndent())

    // вариант, если создать отдельную переменную для if (+ можно будет отказаться от println() в каждом блоке)
//    println(resultLottery)

}
