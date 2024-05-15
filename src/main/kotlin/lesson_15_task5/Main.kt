package org.example.lesson_15_task5

/*
Задача 5* к Уроку 15

В логике мобильной игры есть грузовые и легковые автомобили с такими параметрами:

- грузовые машины могут перевозить одного пассажира и 2 тонны груза;
- легковые не перевозят груз, но могут вместить до 3 пассажиров.

Создай интерфейсы, обеспечивающие передвижение машин, перевозку пассажиров и перевозку грузов.

- учитывай максимальное и текущее количество перевозимых людей или грузов;
- интерфейсы должны содержать методы загрузки и разгрузки пассажиров или грузов.

Спроектируй классы и несколько объектов.
Вызови их методы, «перевезя» таким образом 6 человек и 2 тонны груза.
 */

abstract class Vehicle(
    val name: String,
    val qtyCarriedPassengers: Int,
    val qtyCarriedTons: Int,
)

class PassengerCar(
    qtyCarriedPassengers: Int,
    qtyCarriedTons: Int,
) : Vehicle(name = "Лековой автомобиль", qtyCarriedPassengers, qtyCarriedTons), Movement, PassengerTransportation {

    override fun startTrip() {
        println("$name начинает движение.")
    }

    override fun endTrip() {
        println("$name заканчивает движение.")
    }

    override fun pickUpPassenger() {
        println("$name забирает пассажиров в количестве $qtyCarriedPassengers человек.")
    }

    override fun dropOffPassenger() {
        println("$name высаживает пассажиров в количестве $qtyCarriedPassengers человек.")
    }
}

class CargoCar(
    qtyCarriedPassengers: Int,
    qtyCarriedTons: Int,
) : Vehicle(name = "Грузовой автомобиль", qtyCarriedPassengers, qtyCarriedTons), Movement, PassengerTransportation,
    CargoTransportation {
    override fun startTrip() {
        println("$name начинает движение.")
    }

    override fun endTrip() {
        println("$name заканчивает движение.")
    }

    override fun pickUpPassenger() {
        println("$name забирает пассажиров в количестве $qtyCarriedPassengers человек.")
    }

    override fun dropOffPassenger() {
        println("$name высаживает пассажиров в количестве $qtyCarriedPassengers человек.")
    }

    override fun pickUpCargo() {
        println("$name загружает груз в количестве $qtyCarriedTons тонн.")
    }

    override fun dropOffCargo() {
        println("$name выгружает груз в количестве $qtyCarriedTons тонн.")
    }
}

interface Movement {

    fun startTrip()
    fun endTrip()
}

interface PassengerTransportation {

    fun pickUpPassenger()
    fun dropOffPassenger()
}

interface CargoTransportation {

    fun pickUpCargo()
    fun dropOffCargo()
}

fun main() {

    val passengerCar1 = PassengerCar(3, 0)
    passengerCar1.pickUpPassenger()
    passengerCar1.startTrip()
    passengerCar1.endTrip()
    passengerCar1.dropOffPassenger()

    println()

    val cargoCar1 = CargoCar(1, 2)
    cargoCar1.pickUpPassenger()
    cargoCar1.pickUpCargo()
    cargoCar1.startTrip()
    cargoCar1.endTrip()
    cargoCar1.dropOffCargo()
    cargoCar1.dropOffPassenger()

    println()

    val passengerCar2 = PassengerCar(2, 0)
    passengerCar2.pickUpPassenger()
    passengerCar2.startTrip()
    passengerCar2.endTrip()
    passengerCar2.dropOffPassenger()

}
