//Напишите программу, которая принимает на вход список чисел, и
//возвращает самое маленькое число из этого списка.

fun findMinNumber(numbers: List<Int>): Int? {
    // Возвращаем наименьшее число из списка, если он не пустой
    return numbers.minOrNull()
}
fun main() {
    println("Введите числа через пробел:")

    // Чтение строки и преобразование ее в список целых чисел
    val i = readLine()
    val numbers = i?.split(" ")?.mapNotNull { it.toIntOrNull() } ?: emptyList()

    // Находим минимальное число
    val m = findMinNumber(numbers)
    if (m != null) {
        println("Самое маленькое число: $m")
    }
    else {
        println("Список чисел пуст или не был введен корректно.")
    }
}