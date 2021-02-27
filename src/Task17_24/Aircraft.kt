package Task17_24

abstract class Aircraft(
    protected var aircraftNumber: Int,
    protected var maximumFlightRange: Int,
    protected var tankCapacity: Int
) {
    protected var fuelConsumption: Int? = null
        get() = tankCapacity / maximumFlightRange * 100

    open fun info() {
        println(
            "Самолет с номером $aircraftNumber, с максимальной дальностью полета $maximumFlightRange и " +
                    "с объемом бака $tankCapacity"
        )
    }
}