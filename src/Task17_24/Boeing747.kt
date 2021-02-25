package Task17_24

class Boeing747(aircraftNumber: Int, maximumFlightRange: Int, tankCapacity: Int, override val passengerCapacity: Int) :
    Aircraft(aircraftNumber, maximumFlightRange, tankCapacity), Passenger