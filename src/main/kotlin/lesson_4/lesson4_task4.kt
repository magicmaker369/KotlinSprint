package org.example.lesson_4

/*
Задача 4 к Уроку 4

Программа тренировок разбивает упражнения на две группы: упражнения для мышц рук/пресса и ног/спины.
Она рекомендует делать упражнения на каждую группу мышц через день.
Пользователь начал занятия с рук и пресса.
Напиши программу, которая будет сообщать, какие упражнения нужно выполнить сегодня.

Предположим, что сегодня 5 день тренировок.
В первый день выполнялись упражнения для рук и пресса.
Выведи сообщение в виде нескольких красивых ровных строк.

Вывод должен быть таким:

Упражнения для рук: true
Упражнения для ног: false
Упражнения для спины: false
Упражнения для пресса: true

- все сообщение должно печататься в одном println();
- при изменении значения переменной дня тренировки на 1 день вперед, вывод должен меняться.
 */

const val EXERCISE_HAND = true
const val EXERCISE_PRESS = true
const val EXERCISE_LEG = false
const val EXERCISE_BACK = false

fun main() {

    val workoutDay = 1

    val firstTraning = true
    val secondTraning = false

    val workoutTodayHandPress =
        (firstTraning == EXERCISE_HAND) && (firstTraning == EXERCISE_PRESS)

    val workoutTodayLegHand =
        !(secondTraning == EXERCISE_LEG) && !(secondTraning == EXERCISE_BACK)

//    val test1 = workoutDay in (EXERCISE_HAND && EXERCISE_PRESS) .. (EXERCISE_LEG && EXERCISE_BACK)

    println("""
        Упражнения для рук: $
        Упражнения для ног: $workoutTodayLegHand
        Упражнения для спины: $workoutTodayLegHand
        Упражнения для пресса: $workoutTodayHandPress
    """.trimIndent())

}
