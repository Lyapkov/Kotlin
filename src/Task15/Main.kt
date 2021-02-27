package Task15

fun main(args: Array<String>) {
    val info = { arr: Array<String> -> for (value in arr) println(value) }
    info(listOf<String>("Первая", "Вторая", "Третья").toTypedArray())
}