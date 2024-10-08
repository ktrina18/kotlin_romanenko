//27.Печать числа "пирамида": Напишите программу, которая выводит
//"пирамиду" из чисел от 1 до N.

fun main() {
    print("Введите число N: ")
    val a = readLine()!!.toInt()

    for (i in 1..a) {
        // Вывод пробелов для создания отступов
        for (j in 1..(a - i)) {
            print("  ")
        }
        // Вывод чисел в строке
        for (j in 1..i) {
            print("$j ")
        }
        // Вывод чисел в обратном порядке
        for (j in (i - 1) downTo 1) {
            print("$j ")
        }
        // Переход на новую строку
        println()
    }
}