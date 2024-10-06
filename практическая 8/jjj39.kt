//39.Переворот массива: Создайте функцию, которая переворачивает
//массив целых чисел.

fun reverseArray(array: IntArray): IntArray {
    val reversedArray = IntArray(array.size) // Создаем новый массив той же длины
    for (i in array.indices) {
        reversedArray[i] = array[array.size - 1 - i] // Заполняем новый массив в обратном порядке
    }
    return reversedArray
}

fun main() {
    val o = intArrayOf(22, 44, 87, 35, 34)
    val r = reverseArray(o) // Переворачиваем массив
    println("Перевернутый массив: ${r.joinToString(", ")}")
}