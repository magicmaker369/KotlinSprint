package org.example.lesson_12_task_2

/*
Задача 2 к Уроку 12

Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.

- перепиши его, используя определение свойств в основном конструкторе;
- свойства не должны содержать значения по умолчанию (мы создаем каркас сущности для будущих объектов).

Cоздай объект с произвольными данными и выведи в консоль методом созданного класса.
 */

class Weather2(
    private val dayTemp: String,
    private val nightTemp: String,
    private val isRainy: Boolean,
) {

    fun printWeatherStatus() {
        println(
            """
            Дневная температура воздуха составит $dayTemp
            Ночная температура воздуха составит $nightTemp
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

    val weatherInDubai = Weather2("35", "28", false)

    println("Прогноз погоды в Дубае на сутки:")
    weatherInDubai.printWeatherStatus()
}
