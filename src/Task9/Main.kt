package Task9

fun main(args: Array<String>) {
    var arr = Array(3, { Array<String>(3, { "" }) })
    arr[0] = arrayOf("Россия ", "Москва ", "Гроши")
    arr[1] = arrayOf("Америка ", "Вашингтон ", "Доллар")
    arr[2] = arrayOf("Украина ", "Киев ", "Гривна")
    for (row in arr) {
        for (value in row)
            print(value)
        println()
    }
}