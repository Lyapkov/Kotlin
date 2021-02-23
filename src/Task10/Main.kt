package Task10

fun main(args: Array<String>) {
    var isExit: Boolean = false
    var citiesSet: MutableSet<String> = mutableSetOf()
    var cities: MutableList<String> = mutableListOf("Москва")
    while (!isExit) {
        println(
            """Выберите действие: 
            |1 Добавить название города в список
            |2 Посмотреть список
            |3 Посмотреть список городов без повторений
            |4 Выйти из программы
        """.trimMargin()
        )
        when (readLine().toString().toInt()) {
            1 -> {
                print("Введите название города: ")
                cities.add(readLine().toString())
            }
            2 -> println(cities)
            3 -> {
                citiesSet.addAll(cities)
                println(citiesSet)
            }
            4 -> isExit = true
            else -> println("Введи число из списка!")
        }
    }
}