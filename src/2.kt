fun countDistinctChars(input: String): Map<Char, Int> {
    return input.groupingBy { it }.eachCount().toSortedMap()
}

fun main() {
    println("Введите строку для задачи 2:")
    val input = readLine() ?: ""
    val counts = countDistinctChars(input)

    for ((char, count) in counts) {
        println("$char - $count")
    }
}