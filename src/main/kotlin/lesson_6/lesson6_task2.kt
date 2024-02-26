package org.example.lesson_6

/*
Задача 2 к Уроку 6

Создай простой таймер, который запрашивает у пользователя количество секунд, которые нужно засечь.
По истечении заданного времени, выведется сообщение в консоли: “Прошло N секунд”.
Где N – количество секунд, введенных пользователем. Программа должна вставать на паузу.
 */

fun main() {

    println("Введите количество секунд:")
    val enterValue = readln().toLong()
    val convertSecondToMillisec = enterValue * 1000

    Thread.sleep(convertSecondToMillisec)

    println("Прошло $enterValue секунд")


    /*
    решение с выводом количества секунд каждую секунду
    println("Введите количество секунд:")
    var enterValue = readln().toLong()
    val saveEnterValue = enterValue

    while (enterValue >= 0) {
        println("${enterValue--}")
        Thread.sleep(1000)
    }
    println("Прошло $saveEnterValue секунд")
     */

}
