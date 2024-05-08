package org.example.lesson_14_task1

open class Liner(
    val name: String,
    val speed: Int,
    val passengerCapacity: Int,
) {

    open fun printInfoShip() {
        println(
            """
            Тип корабля $name имеет следующие характеристики:
            Скорость: $speed
            Вместимость пассажиров: $passengerCapacity
        """.trimIndent()
        )
        println("---")
    }
}
