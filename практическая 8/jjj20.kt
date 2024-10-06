//20.Наибольшее число в массиве: Напишите функцию, которая находит и
//возвращает максимальное значение в массиве.

fun findMaxInArray(array: IntArray): Int? {
    // Используем встроенную функцию maxOrNull для нахождения максимального значения
    return array.maxOrNull()
}

fun main() {
    // Пример использования функции
    val n = intArrayOf(5, 3, 8, 1, 4, 7)
    val max = findMaxInArray(n)

    if (max != null) {
        println("Наибольшее число в массиве: $max")
    } else {
        println("Массив пуст.")
    }
}