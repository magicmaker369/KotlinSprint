package org.example.lesson_4

/*
Задача 2 к Уроку 4

При работе на таможенном терминале важно точно определить категорию каждого груза.
Напиши программу, которая проверяет, соответствует ли груз категории "Average".
Эта категория имеет следующие параметры: вес от 35 кг до 100 кг (включительно), и объем меньше 100 литров.

Создай программу, которая отображает соответствие данных груза категории "Average".
Вывод программы может выглядеть так:
"Груз с весом 42 кг и объемом 120 л соответствует категории 'Average': false".

- укажи предварительно заданные параметры категории;
- проверь, соответствуют ли следующие грузы категории "Average": 20 кг / 80 л и 50 кг / 100 л;
- сделай сравнение непосредственно внутри println() и без использования диапазонов.
 */

const val MIN_WEIGH = 35
const val MAX_WEIGH = 100
const val MAX_VOLUME = 100

fun main() {

    // вариант решение по комментарию https://github.com/magicmaker369/KotlinSprint/pull/16#pullrequestreview-1878222268
    var weight = 20
    var volume = 80

    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': " +
            "${(weight >= MIN_WEIGH) && (weight <= MAX_WEIGH) && (volume < MAX_VOLUME)}")

    weight = 50
    volume = 100

    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': " +
            "${(weight >= MIN_WEIGH) && (weight <= MAX_WEIGH) && (volume < MAX_VOLUME)}")

    /* изначальный вариант решения
    var weight = 20
    var volume = 80
    var average = (weight >= MIN_WEIGH) && (weight <= MAX_WEIGH) && (volume < MAX_VOLUME)

    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': $average")

    weight = 50
    volume = 100
    average = (weight >= MIN_WEIGH) && (weight <= MAX_WEIGH) && (volume < MAX_VOLUME)

    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': $average")
    */
}
