package org.example.lesson_14_task2

class CargoSecond(
    name: String,
    speed: Int,
    passengerCapacity: Int,
    private val loadCapacity: Int,
) : LinerSecond(name, speed, passengerCapacity) {

    override fun printInfoShipSecond() {
        println(
            """
            Тип корабля $name имеет следующие характеристики:
            Скорость: $speed
            Вместимость пассажиров: $passengerCapacity
            Грузоподъемность: $loadCapacity
        """.trimIndent()
        )
    }

    override fun printLoadingMethod() {
        println("Способ погрузки у ${name}: Активирует погрузочный кран.")
    }
}
