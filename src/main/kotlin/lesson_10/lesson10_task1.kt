package org.example.lesson_10

import kotlin.random.Random

/*
Задача 1 к Уроку 10

Напиши небольшую игру, в которой пользователь и компьютер по очереди бросают кости.
Побеждает выбросивший наибольшее число.

- поочередно выводи сообщение о ходе игрока и компьютера (отображать кто бросил, какие значения на кубиках);
- бросок кости вынеси в отдельную функцию, в которой генерируется случайное число от 1 до 6;
- в отдельные переменные сохрани результат работы функции для игрока и компьютера;
- после сравнения результатов, выведи соответствующее сообщение в консоль.
Например: "Победило человечество" или "Победила машина".
 */

fun main() {

    val humanRoll = rollDice()
    printResultHumanRoll(humanRoll)

    val robotRoll = rollDice()
    printResultRobotRoll(robotRoll)

    if (humanRoll > robotRoll) {
        println("Победило человечество!")
    } else if (humanRoll == robotRoll) {
        println("Мировая ничья.")
    }
    else println("Победила машина!")

}

fun rollDice(): Int {
    val randomNumber = Random.nextInt(1, 6)
    return randomNumber
}

fun printResultHumanRoll(humanRoll: Int) {
    println("Человек бросил игральную кость с результатом: $humanRoll")
}

fun printResultRobotRoll(robotRoll: Int) {
    println("Компьютeр бросил игральную кость с результатом: $robotRoll")
}
