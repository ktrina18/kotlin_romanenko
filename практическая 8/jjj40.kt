//40.Копирование массива: Напишите функцию, которая копирует массив и
//возвращает новый массив.

fun copyArray(array: IntArray): IntArray {
    // Создаем новый массив с тем же размером, что и исходный
    val c = IntArray(array.size)
    for (i in array.indices) {
        c[i] = array[i] // Копируем элементы из одного массива в другой
    }
    return c
}
fun main() {
    val o = intArrayOf(10, 89, 76, 44, 56)
    val n = copyArray(o) // Копируем массив

    println("Скопированный массив: ${n.joinToString(", ")}")
}