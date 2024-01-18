package org.example.lesson_2

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
