//33.Поиск элемента по индексу: Создайте функцию, которая находит
//элемент по индексу в массиве.

fun findElementByIndex(array: Array<Int>, index: Int): Int? {
    // Проверяем, не выходит ли индекс за пределы массива
    return if (index in array.indices) {
        array[index] // Возвращаем элемент по индексу
    }
    else {
        null // Возвращаем null, если индекс вне диапазона
    }
}

fun main() {
    val numbers = arrayOf(11, 34, 22, 88, 45)
    val indexToFind = 2
    val element = findElementByIndex(numbers, indexToFind)

    if (element != null) {
        println("Элемент на индексе $indexToFind: $element")
    } else {
        println("Индекс $indexToFind вне диапазона массива.") 
    }
}