package org.example.lesson_2

/*
Задача 4 к Уроку 2

В мобильной стратегии есть бафф (временное усиление какого-либо юнита или процесса),
который дает +20% к добытым материалам.
Было добыто 7 кристаллической и 11 железной руды без баффа – заранее известные данные, объявить и проинициализировать.

Напиши программу, которая будет учитывать действие баффа и выводить в консоль количество “бонусных”
(то есть тех материалов, которые даются “сверху” баффом).
По одной строке на материал с его названием.

Если получается нецелое число, то дробная часть должна отбрасываться.
 */

const val CONVERT_PERCENT = 100

fun main() {

    val crystalOre = 7
    val ironOre = 11
    val boosterValue = 20.0

    val qtyCrystalOreAddedBooster = (crystalOre * (boosterValue / CONVERT_PERCENT)).toInt()
    println("Количество бонусных материалов с применение баффа: $qtyCrystalOreAddedBooster")

    val qtyIronOreAddedBooster = (ironOre * (boosterValue / CONVERT_PERCENT)).toInt()
    println("Количество бонусных материалов с применение баффа: $qtyIronOreAddedBooster")

}
