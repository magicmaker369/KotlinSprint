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

    var enterText = ""

    do {
        println("Какой ингредиент Вы хотите заменить?")
        enterText = readln()
        if (enterText !in arrayIngredients)
            println("Такого ингрединта нет в списке, попробуйте ещё раз.")
        else println("Отлично, Вы хотите заменить $enterText.")
    } while (enterText !in arrayIngredients)

    val checkIndexIngredient = arrayIngredients.indexOf(enterText)

    println("Какой ингредиент Вы хотите добавить?")
    val enterChangeIngredient = readln()

    arrayIngredients[checkIndexIngredient] = enterChangeIngredient

    println("Готово! Вы сохранили следующий список:")
    for (i in arrayIngredients)
        println(i)

}
