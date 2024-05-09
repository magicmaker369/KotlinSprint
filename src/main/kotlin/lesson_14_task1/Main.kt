package org.example.lesson_14_task1

/*
Задача 1 к Уроку 14

В компьютерной игре есть три типа кораблей: лайнер, грузовой и ледокол.
Все корабли построены на основе лайнера, но у каждого свой функционал и дополнительные свойства.

У грузовых скорость меньше, а грузоподъемность больше.
У ледоколов ниже и скорость, и вместительность, но они могут колоть лёд.
Лайнер может вмещать наибольшее количество пассажиров.

- спроектируй иерархию классов со значениями по умолчанию для каждого типа корабля;
- создай по 1 экземпляру каждого типа корабля.
 */

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

class Icebreaker(
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

fun main() {

    val linerShip = Liner("Лайнер", 100, 1300)
    linerShip.printInfoShip()

    val cargoShip = Cargo("Грузовой", 80, 0, 50000)
    cargoShip.printInfoShip()

    val icebreakerShip = Icebreaker("Ледокол", 50, 300, true)
    icebreakerShip.printInfoShip()
}
