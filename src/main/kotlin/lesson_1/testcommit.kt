package org.example.lesson_1

/*
Задача 5* к Уроку 1

Объяви переменную с количеством секунд, которые Гагарин провел в космосе.

- Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
- Значения часов, минут и секунд отображать двумя цифрами.
 */

const val SECONDS_IN_ONE_HOUR = 3600
const val SECONDS_IN_ONE_MINUTE = 60

fun main() {

    val secondsInSpace = 6480

    val qtyHours = secondsInSpace / SECONDS_IN_ONE_HOUR
    val formattedHours = String.format("%02d", qtyHours)

    val qtyMinutes = (secondsInSpace % SECONDS_IN_ONE_HOUR) / SECONDS_IN_ONE_MINUTE
    val formattedMinute = String.format("%02d", qtyMinutes)

    val qtySeconds = secondsInSpace % SECONDS_IN_ONE_MINUTE
    val formattedSeconds = String.format("%02d", qtySeconds)

    println("Время которое Гагарин провел в космосе: $formattedHours:$formattedMinute:$formattedSeconds")
}
