package org.example.lesson_15_task3

/*
Задача 3 к Уроку 15

На форуме есть два типа пользователей – обычные пользователи и администраторы.

Пользователи могут читать форум и писать сообщения.
Администраторы дополнительно могут удалять сообщения и пользователей.

Опиши классы для сущностей пользователей и администраторов, используя абстрактный класс.
У абстрактного класса должны быть соответствующие общие поля и методы.
Действия на форуме отобрази сообщениями в консоль.
 */

abstract class TypeUser(val name: String) {

    abstract fun readMessage()
    abstract fun sendMessage()
}

class Users() : TypeUser(name = "User") {
    override fun readMessage() {
        println("$name читатет сообщение.")
    }

    override fun sendMessage() {
        println("$name отпрваляет сообщение.")
    }
}

class Administrators() : TypeUser(name = "Administrator") {
    override fun readMessage() {
        println("$name читатет сообщение.")
    }

    override fun sendMessage() {
        println("$name отпрваляет сообщение.")
    }

    fun deleteMessage() {
        println("$name удаляет сообщение.")
    }

    fun deleteUsers() {
        println("$name удаляет юзера.")
    }
}

fun main() {

    val userFirst = Users()
    userFirst.readMessage()
    userFirst.sendMessage()

    val administratorFirst = Administrators()
    administratorFirst.readMessage()
    administratorFirst.sendMessage()
    administratorFirst.deleteUsers()
    administratorFirst.deleteMessage()
}
