//14.Числа Прокопенко: Напишите программу, которая выводит все числа в
//массиве, делящиеся на 3.

fun main() {
    // Создаем массив чисел
    val n= arrayOf(22, 56, 3, 33, 18, 6, 7, 4, 9, 23, 11, 12, 90, 15, 16, 17)

    // Фильтруем числа, делящиеся на 3
    val c = n.filter { it % 3 == 0 }

    println("Числа, делящиеся на 3:")
    println(c.joinToString(", "))
}