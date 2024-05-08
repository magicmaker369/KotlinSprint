package org.example.lesson_14_task1

class Icebraker(
    name: String,
    speed: Int,
    passengerCapacity: Int,
    private var isSplittingIce: Boolean,
) : Liner(name, speed, passengerCapacity) {

    override fun printInfoShip() {
        println(
            """
            Тип корабля $name имеет следующие характеристики:
            Скорость: $speed
            Вместимость пассажиров: $passengerCapacity
            ${
                if (isSplittingIce) "Умеет колоть лёд: Да"
                else "Умеет колоть лёд: Нет"
            }
        """.trimIndent()
        )
        println("---")
    }
}
