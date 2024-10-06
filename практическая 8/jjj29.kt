//29.Максимум и минимум: Создайте функцию, которая находит
//одновременно максимальное и минимальное значения в массиве.

fun findMaxAndMin(array: IntArray): Pair<Int, Int>? {
    if (array.isEmpty()) return null // Проверка на пустой массив

    var max = array[0]
    var min = array[0]

    for (item in array) {
        if (item > max) {
            max = item // обновляем максимум
        }
        if (item < min) {
            min = item // обновляем минимум
        }
    }
    return Pair(max, min) // Возвращаем пару (максимум, минимум)
}

fun main() {
    val n = intArrayOf(5, 7, 2, 8, 1, 4) // Исходный массив
    val m = findMaxAndMin(n) // Вызываем функцию

    if (m!= null) {
        println("Максимум: ${m.first}, Минимум: ${m.second}") // Выводим максимум и минимум
    } else {
        println("Массив пуст.") // Сообщение для пустого массива
    }
}