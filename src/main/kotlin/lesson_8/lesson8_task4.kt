package org.example.lesson_8

/*
Задача 4 к Уроку 8

Представим, что мы получили массив ингредиентов.
Программа должна распечатать весь список ингредиентов,
затем заменить нужный ингредиент на новый по желанию пользователя.
После этого программа должна показать обновленный список.

 – создай массив со списком ингредиентов и напечатай его в консоль;
 – запроси у пользователя информацию об ингредиенте, который он хочет заменить;
 – если пользователь ввел ингредиент, которого нет в списке, вывести соответствующее сообщение;
 – если есть, запроси ингредиент, который пользователь хотел бы добавить;
 – выведи обновленный список с сообщением: “Готово! Вы сохранили следующий список: [список_ингредиентов]”.
 */

fun main() {

    val arrayIngredients = arrayOf("tomato", "apple", "basil", "mint")

    println("Ингредиенты которые есть сейчас в списке:")
    for (i in arrayIngredients)
        println(i)


    println("Какой ингредиент Вы хотите заменить?")
    val enterText = readln()

    val checkIndexIngredient = arrayIngredients.indexOf(enterText)

//    val checkIngredients = arrayIngredients.contains(enterText)
//    println("Такого ингрединта нет в списке, попробуйте ещё раз")

    println("Какой ингредиент Вы хотите добавить?")
    val enterChangeIngredient = readln()

    println("Принято. Вы хотите изменить $enterText на $enterChangeIngredient")

    arrayIngredients[checkIndexIngredient] = "$enterChangeIngredient"

    println("Обновленный список с ингредиентами выглядит так:")
    for (i in arrayIngredients)
        println(i)

}
