package org.example.lesson_2

/*
Задача 3 к Уроку 2

Сайт с расписанием поездов получает данные с сервера.
Сервер посылает время выезда и время в пути, а время прибытия вычисляется из них.
Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.

 – Создай целочисленные переменные и проинициализируй их этими данными;
 – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
 – Выведи результат в консоль.
 */

fun main() {

    val departureHour = 9
    val departureMinute = 39
    val routeTimeMinute = 457

    //переводим в минуты время отправления поезда
    val departureTimeInMinute = (departureHour * 60) + departureMinute
//    println("Время отправления в минутах: $departureTimeInMinute")

    //получаем общее количество минут
    val allTimeInRoute = departureTimeInMinute + routeTimeMinute
//    println("Общее время в минутах: $allTimeInRoute")

    //получаем количество часов
    val convertAllMinuteInHour = allTimeInRoute / 60
//    println("Количество часов: $convertAllMinuteInHour")

    //получаем количество минут
    val convertAllMinuteInMinute = allTimeInRoute % 60
//    println("Количество минут: $convertAllMinuteInMinute")

    println("Время прибытия поезда: $convertAllMinuteInHour:$convertAllMinuteInMinute")
}
