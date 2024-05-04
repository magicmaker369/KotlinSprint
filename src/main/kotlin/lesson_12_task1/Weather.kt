package org.example.lesson_12_task1

/*
Задача 1 к Уроку 12

Программа отслеживает погоду по дням. Создай класс для хранения данных о температуре и осадках для одного дня.

Объекты класса будут хранить:

- дневная температура;
- ночная температура;
- наличие осадков в течение суток.

Создай два объекта, присвой им произвольные данные и выведи в консоль одним методом созданного класса.

- в классе создай переменные и проинициализируй их какими-нибудь значениями;
- затем в созданных объектах подставь другие значения этим переменным.

В этой задаче используй пустой конструктор.
 */

class Weather {

    var dayTemp = "20 °C"
    var nightTemp = "10 °C"
    var isRainy = false

    fun printStatusWeather() {
        println(
            """
            Дневная температура воздуха составит $dayTemp
            Ночная температура воздуха составит $nightTemp
            ${
                if (isRainy != false) {
                    "Наличие осадков в течении суток: Ожидаются"
                } else "Наличие осадков в течении суток: Не ожидаются"
            }
        """.trimIndent()
        )
        println("---")
    }

}

fun main() {

    val weatherInMoscow = Weather()
    val weatherInSpb = Weather()

    println("Прогноз погоды в Москве на ближайшие сутки:")
    weatherInMoscow.dayTemp = "28 °C"
    weatherInMoscow.nightTemp = "17 °C"
    weatherInMoscow.isRainy = false
    weatherInMoscow.printStatusWeather()

    println("Прогноз погоды в Санк-Петербурге на ближайшие сутки:")
    weatherInSpb.dayTemp = "23 °C"
    weatherInSpb.nightTemp = "14 °C"
    weatherInSpb.isRainy = true
    weatherInSpb.printStatusWeather()
}
