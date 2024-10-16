fun findIntegerExponent(n: Int, x: Int): Int? {
    var y = 0
    var result = 1

    while (result < n) {
        result *= x
        y++
    }

    return if (result == n) y else null
}

fun main() {
    println("Введите число n и основание степени x через пробел для задачи 5:")
    val input = readLine()?.split(" ")?.map { it.toIntOrNull() } ?: listOf()

    if (input.size == 2 && input[0] != null && input[1] != null) {
        val n = input[0]!!
        val x = input[1]!!

        val exponent = findIntegerExponent(n, x)
        if (exponent != null) {
            println("Целочисленный показатель степени: $exponent")
        } else {
            println("Целочисленный показатель не существует.")
        }
    } else {
        println("Некорректный ввод.")
    }
}