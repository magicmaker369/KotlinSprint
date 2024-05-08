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
