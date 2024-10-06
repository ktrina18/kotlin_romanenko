//26.Возвращение последнего элемента массива: Напишите функцию,
//которая возвращает последний элемент переданного массива.

fun <T> getLastElement(array: Array<T>): T? {
    return if (array.isNotEmpty()) {
        array[array.size - 1]
    } else {
        null // Возвращаем null, если массив пуст
    }
}

fun main() {
    val n = arrayOf(1, 2, 3, 4, 5)
    val l = getLastElement(n)
    println("Последний элемент массива: $l")
}