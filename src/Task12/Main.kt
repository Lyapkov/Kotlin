package Task12

fun main(args: Array<String>) {
    if (isLeap(2000)) print("Год високосный!") else print("Год не високосный!")
}

fun isLeap(year: Int): Boolean {
    return !((year % 4 != 0) || (year % 100 == 0) && (year % 400 != 0))
}