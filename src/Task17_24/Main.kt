package Task17_24

fun main(args: Array<String>) {
    var aircrafts: MutableList<Aircraft> = mutableListOf<Aircraft>(
        Boeing747(1, 7500, 270, 200),
        Douglas(2, 7000, 300, 1500),
        Saab(3, 6000, 250)
    )
    var isExit: Boolean = false
    while (!isExit) {
        println(
            """Выберите, что хотите сделать: 
            |1. Посмотреть список самолетов
            |2. Добавить самолет Boeing
            |3. Добавить самолет Douglas
            |4. Добавить самолет Saab
            |5. Выйти из программы
        """.trimMargin()
        )
        when (readLine().toString().toInt()) {
            1 -> for (value in aircrafts)
                println(value.info())
            2 -> {
                println("Введите номер самолета: ")
                val aircraftNumber = readLine().toString().toInt()
                println("Введите дальность полета самолета: ")
                val maximumFlightRange = readLine().toString().toInt()
                println("Введите обьем бака самолета: ")
                val tankCapacity = readLine().toString().toInt()
                println("Введите количество пассажиров самолета: ")
                val passengerCapacity = readLine().toString().toInt()
                aircrafts.add(Boeing747(aircraftNumber, maximumFlightRange, tankCapacity, passengerCapacity))
            }
            3 -> {
                println("Введите номер самолета: ")
                val aircraftNumber = readLine().toString().toInt()
                println("Введите дальность полета самолета: ")
                val maximumFlightRange = readLine().toString().toInt()
                println("Введите обьем бака самолета: ")
                val tankCapacity = readLine().toString().toInt()
                println("Введите грузоподъемность самолета: ")
                val liftingCapacity = readLine().toString().toInt()
                aircrafts.add(Douglas(aircraftNumber, maximumFlightRange, tankCapacity, liftingCapacity))
            }
            4 -> {
                println("Введите номер самолета: ")
                val aircraftNumber = readLine().toString().toInt()
                println("Введите дальность полета самолета: ")
                val maximumFlightRange = readLine().toString().toInt()
                println("Введите обьем бака самолета: ")
                val tankCapacity = readLine().toString().toInt()
                aircrafts.add(Saab(aircraftNumber, maximumFlightRange, tankCapacity))
            }
            5 -> isExit = true
        }
    }
}