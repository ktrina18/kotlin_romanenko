//25.Линейный поиск: Реализуйте линейный поиск элемента в массиве с
//возвратомBool-значения (найден или нет)

fun main() {
    val a = intArrayOf(1, 5, 8, 2, 9, 3)
    val t = 2
    val f = linearSearch(a, t)

    if (f) {
        println("Элемент $t найден в массиве.")
    } else {
        println("Элемент $t не найден в массиве.")
    }
}
fun linearSearch(array: IntArray, target: Int): Boolean {
    for (element in array) {
        if (element == target) {
            return true
        }
    }
    return false
}

