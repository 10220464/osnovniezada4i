fun decimalToBinary(n: Int): String {
    return Integer.toBinaryString(n)
}

fun main() {
    println("Введите натуральное число для задачи 3:")
    val input = readLine()?.toIntOrNull()
    if (input != null && input > 0) {
        println("Число в двоичной системе: ${decimalToBinary(input)}")
    } else {
        println("Некорректный ввод. Введите натуральное число.")
    }
}