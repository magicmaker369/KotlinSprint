package org.example.lesson_15_task1

/*
Задача 1 к Уроку 15

В мобильной игре есть разные существа.
Напиши интерфейсы для летающих и плавающих существ.

- создай интерфейсы с методами передвижения для: карась, чайка, утка;
- создай для каждого существа классы, реализующие соответствующие интерфейсы;
- выведи сообщения в консоль, о том как они могут передвигаться.
 */

class Crucian(val name: String = "Карась") : Swimming {

    override fun swim() {
        println("$name умеет плавать под водой.")
    }
}

class Duck(val name: String = "Утка") : Flying, Swimming {

    override fun swim() {
        println("$name умеет плавать на поверхности воды.")
    }

    override fun fly() {
        println("$name умеет летать.")
    }
}

class Seagull(val name: String = "Чайка") : Flying, Swimming {

    override fun swim() {
        println("$name умеет плавать на поверхности воды.")
    }

    override fun fly() {
        println("$name умеет летать.")
    }
}

interface Swimming {

    fun swim()
}

interface Flying {

    fun fly()
}

fun main() {

    val crucian = Crucian()
    crucian.swim()

    println("")

    val duck = Duck()
    duck.swim()
    duck.fly()

    println("")

    val seagull = Seagull()
    seagull.swim()
    seagull.fly()
}
