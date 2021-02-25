package Task17_24

fun main(args: Array<String>) {
    var aircraft: Aircraft = Aircraft(1, 7000, 25000)
    var boeing747: Boeing747 = Boeing747(2, 7500, 270, 200)
    print("${aircraft.maximumFlightRange} ${aircraft.aircraftNumber} ${aircraft.fuelConsumption} ${aircraft.tankCapacity}")
}