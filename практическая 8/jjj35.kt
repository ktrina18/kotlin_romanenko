//35.Сумма первых N натуральных чисел: Создайте функцию, которая
//возвращает сумму первых N натуральных чисел.

fun sumOfNaturalNumbers(n: Int): Int {
    // Формула для вычисления суммы первых N натуральных чисел
    return n * (n + 1) / 2
}
fun main() {
    val n = 22
    val sum = sumOfNaturalNumbers(n)

    println("Сумма первых $n натуральных чисел: $sum")
}