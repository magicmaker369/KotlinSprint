package org.example.lesson_7

import kotlin.random.Random

/*
Задача 1 к Уроку 7

Создай программу, которая генерирует шестизначные пароли.
Пусть пароль будет состоять из чередующихся цифр и строчных букв латинского алфавита (без специальных символов).
Например, k5p6m2. Выведи сгенерированный пароль в консоль.
 */

fun main() {

    println("Вариант решения №1")
    for (firstSymbol in 'a' .. 'z') {
        if (firstSymbol == 'k')
            println("$firstSymbol")
    }
    for (secondSymbol in 1 .. 9) {
        if (secondSymbol == 5)
            println("$secondSymbol")
    }
    for (thirdSymbol in 'a' .. 'z') {
        if (thirdSymbol == 'p')
            println("$thirdSymbol")
    }
    for (fouthSymbol in 1 .. 9) {
        if (fouthSymbol == 6)
            println("$fouthSymbol")
    }
    for (fifthSymbol in 'a' .. 'z') {
        if (fifthSymbol == 'm')
            println("$fifthSymbol")
    }
    for (sixthSymbol in 1 .. 9) {
        if (sixthSymbol == 2)
            println("$sixthSymbol")
    }

    println("")

    println("Вариант решения №2")
    val randomDigit = Random
    val digit1 = randomDigit.nextInt(1, 9)
    val digit2 = randomDigit.nextInt(1, 9)
    val digit3 = randomDigit.nextInt(1, 9)

    val startChar = 'a'.code
    val endChar = 'z'.code
    val randomLetter = Random
    val letter1 = randomLetter.nextInt(startChar, endChar).toChar()
    val letter2 = randomLetter.nextInt(startChar, endChar).toChar()
    val letter3 = randomLetter.nextInt(startChar, endChar).toChar()

    println("$digit1$letter1$digit2$letter2$digit3$letter3")
}
