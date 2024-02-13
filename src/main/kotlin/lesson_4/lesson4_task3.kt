package org.example.lesson_4

/*
Задача 3 к Уроку 4

На территории агрокомплекса функционирует система автоматического мониторинга условий для роста растений.
Напиши программу, которая будет определять, подходят ли текущие условия для успешного роста бобовых культур.

Критерии благоприятных условий включают:

- наличие солнечной погоды;
- открытый тент;
- влажность воздуха составляет 20%;
- текущее время года - не зима.

Программа должна выводить результат анализа условий в формате:
“Благоприятные ли условия сейчас для роста бобовых? true/false”

Для проверки работы программы, инициализируй переменные следующими значениями:

- погода сегодня - солнечная;
- тент на данный момент - открыт;
- влажность воздуха - 20%;
- текущее время года - зима.

И типами данных - boolean, boolean, int, String.
 */

/**
 * Благоприятные условия для роста бобовых
 */
const val WEATHER_SUNNY = true
const val TENT_OPEN = true
const val AIR_HUMIDITY = (20.0 / 100)
const val SEASON_SPRING = "весна"
const val SEASON_SUMMER = "лето"
const val SEASON_AUTUMN = "осень"

fun main() {

    /**
     * Ниже вводим текущее состояние условий
     */
    val weatherTodaySunny = true
    val tentOpen = true
    val airHumidity = (20.0 / 100)
    val season = "зима"

    val positiveCondition = (weatherTodaySunny == WEATHER_SUNNY) &&
            (tentOpen == TENT_OPEN) && (airHumidity == AIR_HUMIDITY) &&
            (season == SEASON_SPRING || season == SEASON_SUMMER || season == SEASON_AUTUMN)

    println("Благоприятные ли условия сейчас для роста бобовых? $positiveCondition")

}
