package org.example.lesson_2

/**
Задача 1 к Уроку 2

Задача на среднее арифметическое.
В классе с углубленным изучением английского языка учится 4 человека.
У них следующие баллы по профильному предмету 3, 4, 3, 5.
Пишем часть школьного софта, который посчитает средний балл по английскому для этого класса.

– Написать выражение, которое высчитывает средний балл;
– Распечатать результат в консоль;
– В консоли должно быть выведено дробное число с 2 знаками после запятой.
 */

fun main() {

    val quantityPeople = 4
    val pointFirstPeople = 3.0
    val pointSecondPeople = 4.0
    val pointThirdPeople = 3.0
    val pointFourthPeople = 5.0

    val sumAllPoints = pointFirstPeople + pointSecondPeople + pointThirdPeople + pointFourthPeople
    val averageScore = sumAllPoints / quantityPeople

    println(averageScore)

    /**
    решение с использованием extension sum()

    val quantityPeople = 4
    val sumAllPoints = listOf(3.0, 4.0, 3.0, 5.0)

    println(sumAllPoints.sum() / quantityPeople)
     */
}
