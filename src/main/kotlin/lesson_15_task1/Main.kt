package org.example.lesson_15_task1

/*
Задача 1 к Уроку 15

В мобильной игре есть разные существа.
Напиши интерфейсы для летающих и плавающих существ.

- создай интерфейсы с методами передвижения для: карась, чайка, утка;
- создай для каждого существа классы, реализующие соответствующие интерфейсы;
- выведи сообщения в консоль, о том как они могут передвигаться.
 */

class Crucian(val name: String = "Карась") : SwimmingAnimal{

    override fun swimming() {
        println("$name умеет плавать под водой.")
    }
}

class Duck(val name: String = "Утка") : FlyingAndSwimmingAnimal {

    override fun swimming() {
        println("$name умеет плавать на поверхности воды.")
    }

    override fun flying() {
        println("$name умеет летать.")
    }
}

class Seagull(val name: String = "Чайка") : FlyingAndSwimmingAnimal {

    override fun swimming() {
        println("$name умеет плавать на поверхности воды.")
    }

    override fun flying() {
        println("$name умеет летать.")
    }
}

interface SwimmingAnimal {

    fun swimming()
}

interface FlyingAndSwimmingAnimal {

    fun swimming()
    fun flying()
}

fun main() {

    val crucian = Crucian()
    crucian.swimming()

    println("")

    val duck = Duck()
    duck.swimming()
    duck.flying()

    println("")

    val seagull = Seagull()
    seagull.swimming()
    seagull.flying()
}
