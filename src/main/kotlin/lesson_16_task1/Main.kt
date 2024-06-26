package org.example.lesson_16_task1

import kotlin.random.Random
import kotlin.random.nextInt

/*
Задача 1 к Уроку 16

На игральном кубике может выпасть одно число от 1 до 6.

Создай класс кубика, в котором будет проинициализировано одно поле со случайным числом.
Единственный способ узнать это число – вызвать специальный метод, который напечатает информацию в консоль.
 */

class Dice() {

    private val randomDigit = Random.nextInt(1..6)

    fun rollDice() {
        println("Выпало число: $randomDigit")
    }
}

fun main() {

    val dice1 = Dice()
    dice1.rollDice()
}