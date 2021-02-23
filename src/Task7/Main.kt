package Task7

fun main(args: Array<String>) {
    println("""В чем измеряется сила тока? 
        |1 в Джоулях
        |2 в Ньютонах
        |3 в Омах
        |4 в Амперах
        |5 Ваттах
    """.trimMargin())
    when(readLine().toString().toInt()){
        1 -> print("Ты серьезно?")
        2 -> print("Конечно, нет!")
        3 -> print("Загугли!")
        4 -> print("Верно!")
        5 -> print("НЕТ!")
        else -> print("Вариантов всего 5!")
    }
}