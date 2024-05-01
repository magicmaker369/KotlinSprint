package org.example.lesson_11

fun main() {

    val firstUser: User = User(
        id = 1,
        password = "1q2w3e",
        email = "firstuser@google.com",
    )

    val secondUser: User = User(
        id = 2,
        password = "q1w2e3",
        email = "seconduser@google.com",
    )

    println("Данные первого юзера:")
    println(firstUser.id)
    println(firstUser.password)
    println(firstUser.email)

    println("")

    println("Данные второго юзера:")
    println(secondUser.id)
    println(secondUser.password)
    println(secondUser.email)

}
