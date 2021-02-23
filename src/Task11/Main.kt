package Task11

fun main(args: Array<String>) {
    var workers: Map<Int, String> =
        mapOf(1 to "Иванов Иван Иванович", 2 to "Сидоров Петр Николаевич", 3 to "Бондаренко Николай Николаевич")
    print("Введите номер сотрудника: ")
    println(workers[readLine().toString().toInt()])
}