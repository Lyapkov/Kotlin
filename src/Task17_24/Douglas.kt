package Task17_24

class Douglas(aircraftNumber: Int, maximumFlightRange: Int, tankCapacity: Int, override var liftingCapacity: Int) :
    Aircraft(aircraftNumber, maximumFlightRange, tankCapacity), Cargo {
    override fun info() {
        println(
            "Самолет с номером $aircraftNumber, с максимальной дальностью полета $maximumFlightRange, " +
                    "с объемом бака $tankCapacity, с расходом топлива на 100 км $fuelConsumption и " +
                    "$liftingCapacity грузоподъемностью"
        )
    }
}