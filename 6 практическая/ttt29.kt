//29.Нахождение медианы: Напишите программу, которая находит медиану
//в массиве.


fun main() {
    val numbers = intArrayOf(1, 5, 8, 2, 9, 3)
    val m = findMedian(numbers)

    println("Медиана массива: $m")
}

fun findMedian(numbers: IntArray): Double {
    if (numbers.isEmpty()) {
        return 0.0 // Возвращаем 0.0, если массив пустой
    }
    val middleIndex = numbers.size / 2

    return if (numbers.size % 2 == 0) {
        // Если количество элементов четное, медиана - среднее арифметическое двух средних элементов
        (numbers[middleIndex - 1] + numbers[middleIndex]).toDouble() / 2
    } else {
        // Если количество элементов нечетное, медиана - средний элемент
        numbers[middleIndex].toDouble()
    }
}



