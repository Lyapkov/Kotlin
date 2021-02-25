package Task17_24

open class Aircraft(var aircraftNumber: Int, var maximumFlightRange: Int, var tankCapacity: Int) {
    var fuelConsumption: Int? = null
        get() = tankCapacity / maximumFlightRange * 100
}