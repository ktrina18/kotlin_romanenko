//2. Напишите функцию, которая получает на вход список целых чисел и
//возвращает разность самого большого и самого маленького из них.

fun findDifference(numbers: List<Int>): Int {  // принимает список целых чисел в качестве входных данных и возвращает разницу между максимальным и минимальным числами в списке.
    val max = numbers.maxOrNull() ?: 0   // определяется максимальное число
    val min = numbers.minOrNull() ?: 0   // определяется минимальное число

    return max - min
}
fun main() {
    val n = listOf(11,4,9,2,54)
    println(findDifference(n))
}
