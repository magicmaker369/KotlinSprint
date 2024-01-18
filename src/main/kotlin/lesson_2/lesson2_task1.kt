package org.example.lesson_2

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
