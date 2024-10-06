//27.Проверка наличия элемента: Создайте функцию, которая проверяет,
//присутствует ли элемент в массиве.


fun <T> containsElement(array: Array<T>, element: T): Boolean {
    for (item in array) {
        if (item == element) {
            return true // Элемент найден
        }
    }
    return false // Элемент не найден
}

fun main() {
    val n = arrayOf(1, 2, 3, 4, 5)
    val b = 3
    val c = containsElement(n, b)
    println("Массив содержит число $b: $c")
}