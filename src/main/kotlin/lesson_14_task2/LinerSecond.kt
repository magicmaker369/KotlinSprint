package org.example.lesson_14_task2

open class LinerSecond(
    val name: String,
    val speed: Int,
    val passengerCapacity: Int,
) {

    open fun printInfoShipSecond() {
        println(
            """
            Тип корабля $name имеет следующие характеристики:
            Скорость: $speed
            Вместимость пассажиров: $passengerCapacity
        """.trimIndent()
        )
    }

    open fun printLoadingMethod() {
        println("Способ погрузки у ${name}: Выдвигает горизонтальный трап со шкафута.")
    }
}
