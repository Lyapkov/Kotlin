package Task13

fun main(args: Array<String>) {
    print("Количество сотрудников ${numberOfEmployees("Дима", "Вася", "Петя")}")
}

fun numberOfEmployees(vararg employees: String): Int {
    var counter: Int = 0
    for (value in employees)
        counter++
    return counter
}