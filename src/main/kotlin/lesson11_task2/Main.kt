package org.example.lesson11_task2

fun main() {

    val user = User2(
        3,
        "asd123",
        "abc@google.com",
    )

    user.printUserInfo()

    println("---")

    user.updateUserBio()

    println("---")

    user.printUserInfo()

    println("---")

    user.updateUserPassword()

    println("---")

    user.printUserInfo()

}