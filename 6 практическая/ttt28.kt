//28.Ввод и вывод массива: Напишите программу, которая запрашивает у
//пользователя ввод массива чисел и затем выводит его

fun main() {
    println("Введите количество элементов массива:")
    val s = readLine()!!.toInt()

    println("Введите элементы массива, разделяя их пробелами:")
    val i = readLine()!!

    val numbers = i.split(" ").map { it.toInt() }.toIntArray()

    println("Введенный массив:")
    for (number in numbers) {
        print("$number ")
    }
    println()
}
