fun calculate(input: String): Double? {
    val parts = input.split(" ")
    if (parts.size != 3) return null

    val num1 = parts[0].toDoubleOrNull()
    val num2 = parts[1].toDoubleOrNull()
    val operation = parts[2]

    if (num1 == null || num2 == null) return null

    return when (operation) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0.0) num1 / num2 else null
        else -> null
    }
}

fun main() {
    println("Введите два числа и операцию в формате 'ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ' для задачи 4:")
    val input = readLine() ?: ""
    val result = calculate(input)

    if (result != null) {
        println("Результат: $result")
    } else {
        println("Некорректный ввод или ошибка деления на ноль.")
    }
}