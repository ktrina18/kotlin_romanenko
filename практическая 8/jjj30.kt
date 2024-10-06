//30.Сумма чисел от 1 до N: Напишите функцию, которая рассчитывает
//сумму всех чисел от 1 до N.

fun sumOfNumbers(n: Int): Int {
    // Проверка на отрицательное значение
    if (n < 1) throw IllegalArgumentException("N должно быть положительным числом.")

    // Вычисление суммы чисел от 1 до N
    return (1..n).sum()
}

fun main() {
    val n = 10
    try {
        val sum = sumOfNumbers(n)
        println("Сумма чисел от 1 до $n = $sum")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}