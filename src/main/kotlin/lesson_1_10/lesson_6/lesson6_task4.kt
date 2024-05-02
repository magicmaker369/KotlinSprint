package org.example.lesson_6

import kotlin.random.Random

/*
Задача 4 к Уроку 6

Напиши небольшую консольную игру, в которой нужно угадать число в промежутке от 1 до 9.
Игроку дается 5 попыток, чтобы угадать это число.

 – если игрок угадывает число, выводится сообщение “Это была великолепная игра!” и программа завершает работу;
 – если не угадывает, то отображается "Неверно" или что-то на твое усмотрение и оставшееся количество попыток;
 – после истечения попыток выводится сообщение “Было загадано число N”.
 */

fun main() {

    val randomNumber = Random.nextInt(1, 9)
    var numberOfAttempts = 5

    while (numberOfAttempts > 0) {
        println("Введите число от 1 до 9:")
        val enterDigit = readln().toInt()

        if (randomNumber == enterDigit) {
            println("Это была великолепная игра!")
            break
        } else
            println("Неверно, осталось попыток: ${--numberOfAttempts}")
    }
    println("Было загадано число $randomNumber")

}
