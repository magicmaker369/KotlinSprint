package org.example.lesson_2

/**
Задача 2 к Уроку 2

В компании работало 50 человек с зарплатой по 30000 рублей. Затем в компанию устроилось 30 стажеров,
которым назначили зарплату в 20000 рублей каждому.
Пишем часть гипотетического софта для бухгалтерии, который будет считать:

– Расходы на выплату зарплаты постоянных сотрудников;
– Общие расходы по ЗП после прихода стажеров;
– Среднюю ЗП одного сотрудника после устройства стажеров.

Каждый пункт посчитать и сохранить в переменную с соответствующим названием.
Все значения необходимо вывести в виде целых чисел.
 */


fun main() {

    val quantityPermanentEmployees = 50
    val quantityInters = 30

    val salaryPermanentEmployees = 30000
    val salaryInters = 20000

    val salaryAllPermanentEmployees = quantityPermanentEmployees * salaryPermanentEmployees
    val totalSalaryExpenses = (quantityPermanentEmployees * salaryPermanentEmployees) + (quantityInters * salaryInters)
    val averageSalaryEmployees = totalSalaryExpenses / (quantityPermanentEmployees + quantityInters)

    println(salaryAllPermanentEmployees)
    println(totalSalaryExpenses)
    println(averageSalaryEmployees)
}
