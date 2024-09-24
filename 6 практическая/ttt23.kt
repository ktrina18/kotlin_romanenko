//23.Объединение массивов: Напишите функцию, которая объединяет
//несколько массивов чисел и выводит результирующий массив.

fun mergeArrays(vararg arrays: IntArray): IntArray {
    // Создаем список для хранения объединенных элементов
    val mergedList = mutableListOf<Int>()

    // Проходим по каждому массиву в аргументах
    for (array in arrays) {
        // Добавляем все элементы текущего массива в mergedList
        mergedList.addAll(array.toList())
    }
    // Преобразуем mergedList в массив и возвращаем его
    return mergedList.toIntArray()
}

fun main() {
    val a = intArrayOf(3, 4, 8)
    val b = intArrayOf(9, 5)
    val c = intArrayOf(6, 23, 65, 2)
    val m = mergeArrays(a, b, c)

    println("Объединенный массив: ${m.joinToString()}")
}