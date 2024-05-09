package org.example.lesson_14_task2

/*
Задача 2 к Уроку 14

Скопируй классы из предыдущей задачи и измени их названия для избегания конфликтов.

Каждый тип корабля обладает уникальным способом погрузки:

- лайнер выдвигает горизонтальный трап со шкафута;
- грузовой корабль активирует погрузочный кран;
- ледокол открывает ворота со стороны кормы.

Реализуй методы погрузки, специфичные для каждого вида корабля.

Добавь метод вывода информации о свойствах корабля и выведи информацию в консоль.
 */

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

fun main() {

    val linerSecond = LinerSecond("Лайнер", 100, 1300)
    linerSecond.printInfoShipSecond()
    linerSecond.printLoadingMethod()

    println("---")

    val cagroSecond = CargoSecond("Грузовой", 80, 0, 50000)
    cagroSecond.printInfoShipSecond()
    cagroSecond.printLoadingMethod()

    println("---")

    val icebrakerSecond = IcebrakerSecond("Ледокол", 50, 300, true)
    icebrakerSecond.printInfoShipSecond()
    icebrakerSecond.printLoadingMethod()
}
