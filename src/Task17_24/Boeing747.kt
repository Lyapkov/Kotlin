package Task17_24

class Boeing747(aircraftNumber: Int, maximumFlightRange: Int, tankCapacity: Int, override val passengerCapacity: Int) :
    Aircraft(aircraftNumber, maximumFlightRange, tankCapacity), Passenger {
    override fun info() {
        println("Самолет с номером $aircraftNumber, с максимальной дальностью полета $maximumFlightRange, с объемом бака $tankCapacity, с расходом топлива на 100 км $fuelConsumption и $passengerCapacity количством посадочных мест")
    }
}