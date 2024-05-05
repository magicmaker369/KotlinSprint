package org.example.lesson_12_task4

/*
Задача 4 к Уроку 12

Измени программу таким образом, чтобы информация о погоде выводилась в консоль сразу при создании объекта.
 */

class Weather4(
    private var dayTemp: Int = 35,
    private var nightTemo: Int = 28,
    private var isRainy: Boolean = false,
) {

    init {
        println(
            """
            Дневная температура воздуха составит: $dayTemp°C
            Ночная температура воздуха составит: ${nightTemo}°C
            ${
                if (isRainy != true) {
                    "Наличие осадков в течении суток: НЕ ожидается"
                } else "Наличие осадков в течении суток: Ожидаются"
            }
        """.trimIndent()
        )
    }
}

fun main() {

    println("Прогноз погоды в Мале на сутки:")
    val weatherInMale = Weather4()
}
