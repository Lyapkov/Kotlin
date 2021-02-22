package Task6

fun main(args: Array<String>) {
    print("Введите первое число: ")
    var a = readLine()
    print("Введите второе число: ")
    var b = readLine()
    print(a.toString().toInt() > b.toString().toInt())
}