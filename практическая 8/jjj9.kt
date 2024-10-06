//9. Напишите функцию, которая возвращает True, если k^k == n для
//входных данных (n, k), и возвращает False в противном случае.

fun isPowerEqual(n: Int, k: Int): Boolean {
    // Вычисляем k^k
    val power = Math.pow(k.toDouble(), k.toDouble()).toInt()

    // Сравниваем результат с n
    return power == n
}

fun main() {
    // Примеры значений для проверки
    val t = listOf(
        Pair(1, 1),
        Pair(4, 2),
        Pair(27, 3),
        Pair(34, 6),
        Pair(9, 3),
        Pair(0, 0), // 0^0 считается неопределенным
        Pair(1, 0)  // 0^0, обычно считается 1, но логика может быть неопределенной
    )

    for ((n, k) in t) {
        val r = isPowerEqual(n, k)
        println("Для n = $n и k = $k: ${if (r) "True" else "False"}")
    }
}