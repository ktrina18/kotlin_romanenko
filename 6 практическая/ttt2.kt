//2. Сумма элементов массива: Напишите программу, которая находит
//сумму всех элементов массива чисел.

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5)
    var sum = 0

    for (element in array) {
        sum += element
    }

    println("Сумма элементов массива: $sum")
}
