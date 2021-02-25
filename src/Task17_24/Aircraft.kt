package Task17_24

abstract class Aircraft(var aircraftNumber: Int, var maximumFlightRange: Int, var tankCapacity: Int) {
    var fuelConsumption: Int? = null
        get() = tankCapacity / maximumFlightRange * 100
}