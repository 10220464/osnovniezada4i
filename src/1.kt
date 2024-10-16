fun countConsecutiveChars(input: String): String {
    if (input.isEmpty()) return ""

    val result = StringBuilder()
    var count = 1

    for (i in 1 until input.length) {
        if (input[i] == input[i - 1]) {
            count++
        } else {
            result.append(input[i - 1])
            if (count > 1) result.append(count)
            count = 1
        }
    }

    // Добавляем последний символ и его счётчик
    result.append(input.last())
    if (count > 1) result.append(count)

    return result.toString()
}

fun main() {
    println("Введите строку для задачи 1:")
    val input = readLine() ?: ""
    println("Результат: ${countConsecutiveChars(input)}")
}