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
const val IS_SUNNY = true
const val IS_TENT_OPEN = true
const val AIR_HUMIDITY = 20.0
const val IS_SEASON_WINTER = false
const val CONVERT_PERCENT = 100

fun main() {

    /**
     * Ниже вводим текущее состояние условий
     */
    val weatherNowSunny = true
    val tentNowOpen = true
    val airHumidityNow = 20.0
    val seasonNowWinter = true

    val positiveCondition = (weatherNowSunny == IS_SUNNY) &&
            (tentNowOpen == IS_TENT_OPEN) &&
            ((airHumidityNow / CONVERT_PERCENT) == (AIR_HUMIDITY / CONVERT_PERCENT)) &&
            (seasonNowWinter == IS_SEASON_WINTER)

    println("Благоприятные ли условия сейчас для роста бобовых? $positiveCondition")

}
