package org.example.lesson_6

/*
Задача 2 к Уроку 6

Создай простой таймер, который запрашивает у пользователя количество секунд, которые нужно засечь.
По истечении заданного времени, выведется сообщение в консоли: “Прошло N секунд”.
Где N – количество секунд, введенных пользователем. Программа должна вставать на паузу.
 */

fun main() {

    println("\"Основное решение задания\"")
    println("Введите количество секунд:")
    val enterValue = readln().toLong()
    val convertSecondToMillisec = enterValue * 1000

    Thread.sleep(convertSecondToMillisec)

    println("Прошло $enterValue секунд")

    println()

    println("\"Дополнительное решение с выводом количества секунд каждую секунду\"")
    println("Введите количество секунд:")
    var enterValue2 = readln().toLong()
    val saveEnterValue = enterValue

    while (enterValue2 >= 0) {
        println("${enterValue2--}")
        Thread.sleep(1000)
    }
    println("Прошло $saveEnterValue секунд")

}
