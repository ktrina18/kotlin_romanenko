//42.Индекс первого вхождения: Напишите функцию, которая возвращает
//индекс первого вхождения элемента в массиве, или -1, если элемент не
//найден

fun indexOfFirstOccurrence(array: IntArray, element: Int): Int {
    for (i in array.indices) {
        if (array[i] == element) {
            return i
        }
    }
    return -1
}
fun main() {
    val a = intArrayOf(1, 2, 3, 4, 5)
    val e = 3
    val i = indexOfFirstOccurrence(a, e)

    if (i != -1) {
        println("первый индекс $e: $i")
    } else {
        println(" $e не найден")
    }
}