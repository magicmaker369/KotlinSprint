package org.example.lesson_14_task2

class IcebrakerSecond(
    name: String,
    speed: Int,
    passengerCapacity: Int,
    private val isSplittingIce: Boolean
) : LinerSecond(name, speed, passengerCapacity) {

    override fun printInfoShipSecond() {
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
    }

    override fun printLoadingMethod() {
        println("Способ погрузки у ${name}: Открывает ворота со стороны кормы.")
    }
}
