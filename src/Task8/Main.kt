package Task8

fun main(args: Array<String>) {
    println("Введите сумму: ")
    var sum = readLine().toString().toDouble()
    println("Введите количество месяцев: ")
    var count = readLine().toString().toInt()
    println("Введите процент: ")
    var percent = readLine().toString().toDouble()
    for (n in 1..count) {
        sum = (Math.round((sum + (sum * percent / 100)) * 100).toDouble() / 100)
        println("Сумма за $n месяц составит $sum")
    }
}