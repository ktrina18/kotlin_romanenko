//17.Факториал числа: Реализуйте функцию, которая вычисляет факториал
//введенного числа.

fun factorial(n: Int): Long {
    return if (n == 0 || n == 1) {
        1
    } else {
        n * factorial(n - 1) // Рекурсивный вызов
    }
}
fun main() {
    println("Введите число для вычисления факториала:")
    val i = readLine()?.toIntOrNull()

    if (i != null) {
        try {
            val result = factorial(i)
            println("Факториал числа $i равен $result")
        } catch (e: IllegalArgumentException) {
            println(e.message)
        }
    } else {
        println("Пожалуйста, введите целое число.")
    }
}