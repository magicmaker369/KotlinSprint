package org.example.lesson_15_task4

/*
Задача 4 к Уроку 15

На сайте музыкального магазина есть товары двух категорий: инструменты и комплектующие к ним.
Все товары имеют название и количество единиц на складе.

Для инструментов есть возможность поиска соответствующих комплектующих.

Опиши классы для категорий товаров.
Имитируй процесс поиска текстовым сообщением «Выполняется поиск».
Для выноса логики поиска используй интерфейс.
 */

abstract class MusicShop {

    abstract val name: String
    abstract val qtyInStock: Int
}

class Instrument(override val name: String, override val qtyInStock: Int) : MusicShop(), Search

class Accessories(override val name: String, override val qtyInStock: Int) : MusicShop()

interface Search {

    fun findAccessories() {
        println("Выполняется поиск...")
    }
}

fun main() {

    val hammer = Instrument("Молоток", 105)
    hammer.findAccessories()
}
