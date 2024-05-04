package org.example.lesson12_task3

/*
Задача 3 к Уроку 12

Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.

- в этой задаче используй первичный конструктор без выделения памяти под свойства;
- поля должны быть объявлены и проинициализированы в теле класса;
- все поля с температурой должны иметь тип Int;
- программа не должна иметь других функций, кроме метода вывода информации о погоде.

В конструктор передается температура в Кельвинах. При обращении к полям с температурой возвращаются данные в Цельсиях.

Cоздай объект с произвольными данными и выведи в консоль методом созданного класса.
 */

const val CONVERT_IN_CELSIUS = 273.15

class Weather3(_dayTemp: Int, _nightTemp: Int, _isRainy: Boolean) {

    val dayTemp = _dayTemp
    val nightTemp = _nightTemp
    val isRainy = _isRainy

    fun printWeatherStatus() {
        println(
            """
            Дневная температура воздуха составит ${dayTemp - CONVERT_IN_CELSIUS.toInt()}°C
            Ночная температура воздуха составит ${nightTemp - CONVERT_IN_CELSIUS.toInt()}°C
            ${
                if (isRainy != false) {
                    "Наличие осадков в течении суток: Ожидаются"
                } else "Наличие осадков в течении суток: Не ожидается"
            } 
        """.trimIndent()
        )
    }

}

fun main() {

    val newTown = Weather3(300, 290, false)

    println("Прогноз погоды в Новый Город на сутки:")
    newTown.printWeatherStatus()
}
