package org.example.lesson_7

/*
Задача 3 к Уроку 7

Создай программу, которая выводит все чётные числа от нуля до числа, введенного пользователем.
Сначала нужно вывести в консоль запрос на ввод числа.
Полученное число сохранить в отдельную переменную.
При реализации должна использоваться прогрессия.
 */

fun main() {

    println("Введите число: ")
    val enterDigit = readln().toInt()

    val resultEnterDigit = enterDigit

    for (i in 0..resultEnterDigit step 2)
        println(i)

}