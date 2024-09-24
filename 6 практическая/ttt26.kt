//26.Среднее арифметическое: Напишите программу, которая находит
//среднее арифметическое всех чисел в массиве.

fun main() {
    val numbers = intArrayOf(22, 12, 8, 11, 23, 3)
    val a = calculateAverage(numbers)
    println("Среднее арифметическое чисел в массиве: $a")
}

fun calculateAverage(numbers: IntArray): Double {
    if (numbers.isEmpty()) {
        return 0.0 // Возвращаем 0.0, если массив пустой
    }
    var s = 0
    for (number in numbers) {
        s += number
    }
    return s.toDouble() / numbers.size
}


