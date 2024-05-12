package org.example.lesson_15_task2

/*
Задача 2 к Уроку 15

Необходимо разработать простую систему мониторинга погодных условий,
которая будет собирать данные о температуре и количестве осадков.

Создай абстрактный класс WeatherStationStats.
Он будет служить родителем для классов-объектов погодных данных: Temperature и PrecipitationAmount.

Реализуй логику имитации отправки сообщения на сервер в классе WeatherServer.
Метод отправки сообщения должен определять тип переданного сообщения и
в зависимости от результата передавать соответствующие данные.

Создай по одному объекту для разных типов погодных данных и протестируй работу программы.
 */

//abstract class WeatherStationStats {
//
//    abstract fun displayTemp(temperature: Int)
//    abstract fun displayPrecipitationAmount(precipitationAmount: Int)
//}

class Temperature() : DataForTemperature {
    override fun displayTemp(temperature: Int) {
        println("Температура на улице: $temperature°C")
    }
}

interface DataForTemperature {
    fun displayTemp(temperature: Int)
}

class PrecipitationAmount() : DataForPrecipitationAmount {
    override fun displayPrecipitationAmount(precipitationAmount: Int) {
        println("Количество осадков составит: $precipitationAmount мм")
    }
}

interface DataForPrecipitationAmount {
    fun displayPrecipitationAmount(precipitationAmount: Int)
}

class WeatherServer(
    private val temperature: Int,
    private val precipitationAmount: Int
) {

    fun getTemperature() {
        println("Температура на улице: $temperature°C")
    }

    fun getPrecipitationAmount() {
        println("Количество осадков составит: $precipitationAmount мм")
    }
}

fun main() {

//    Вариант решения №1: с помощью класса WeatherServer, который при создании объекта создает данные
//    температуры и уровня осадков
    val weatherMonday = WeatherServer(29, 5)
    println("Погода в понедельник:")
    val tempMonday = weatherMonday.getTemperature()
    val precipitationAmountMonday = weatherMonday.getPrecipitationAmount()
    println(tempMonday)
    println(precipitationAmountMonday)

    println("---")

//    Вариант решения №2, с помощью классов Temperature и PrecipitationAmount и интерфейсов для них
    println("Погода во вторник:")
    val tempTuesday = Temperature()
    tempTuesday.displayTemp(30)
    val precipitationAmount = PrecipitationAmount()
    precipitationAmount.displayPrecipitationAmount(10)
}
