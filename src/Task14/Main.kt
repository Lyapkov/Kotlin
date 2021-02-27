package Task14

fun main(args: Array<String>) {
    info("Иванов Иван Иванович", "Тестировщик")
    info("Сидоров Петр Михайлович", 30, "Разработчик")
    info("Петров Михаил Федорович", "Холост", "Аналитик")
    info("Пупкин Василий Николаевич", 35, "Женат", "Сис. админ")
}

fun info(fullName: String, position: String) {
    println("$fullName $position")
}

fun info(fullName: String, age: Int, position: String) {
    println("$fullName $age $position")
}

fun info(fullName: String, maritalStatus: String, position: String) {
    println("$fullName $maritalStatus $position")
}

fun info(fullName: String, age: Int, maritalStatus: String, position: String) {
    println("$fullName $age $maritalStatus $position")
}
