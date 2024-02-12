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

const val qtyMinutePerHour = 60

fun main() {

    val departureHour = 9
    val departureMinute = 39
    val routeTimeMinute = 457

    //переводим в минуты время отправления поезда
    val departureTimeInMinute = (departureHour * qtyMinutePerHour) + departureMinute

    //получаем общее количество минут
    val allTimeInRoute = departureTimeInMinute + routeTimeMinute

    //получаем количество часов
    val convertAllMinuteInHour = allTimeInRoute / qtyMinutePerHour

    //получаем количество минут
    val convertAllMinuteInMinute = allTimeInRoute % qtyMinutePerHour

    println("Время прибытия поезда: $convertAllMinuteInHour:$convertAllMinuteInMinute")
}
