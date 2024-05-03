package org.example.lesson_9

/*
Задача 1 к Уроку 9

Продолжи разработку приложения с рецептами, но с реализацией через список.
Создай список ингредиентов блюда в виде списка, инициализируй любыми значениями.

 – выведи в консоль сообщение: "В рецепте есть следующие ингредиенты: [список_ингредиентов]";
 – выведи все ингредиенты, каждый с новой строки.
 */

fun main() {

    val ingredientsForPasta = listOf("pasta", "pesto", "cream", "salmon", "nuts")

    println("В рецепте есть следующие ингрединенты:")

    for (i in ingredientsForPasta)
        println(i)

    //  вариант с использование forEach
    //    ingredientsForPasta.forEach { println(it) }

}
