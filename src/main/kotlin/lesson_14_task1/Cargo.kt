package org.example.lesson_14_task1

class Cargo(
    name: String,
    speed: Int,
    passengerCapacity: Int,
    private val loadCapacity: Int,
) : Liner(name, speed, passengerCapacity) {

    override fun printInfoShip() {
        println(
            """
            Тип корабля $name имеет следующие характеристики:
            Скорость: $speed
            Вместимость пассажиров: $passengerCapacity
            Грузоподъемность: $loadCapacity
        """.trimIndent()
        )
        println("---")
    }
}
