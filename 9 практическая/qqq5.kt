//5. Нахождение простых чисел: Реализуйте программу, которая находит и
//выводит все простые числа до заданного числа N.

fun main() {
    println("Введите число N:")
    val i = readLine() ?: return

    val n = i.toIntOrNull()
    if (n == null || n < 2) {
        println("Пожалуйста, введите положительное целое число больше 1.")
        return
    }
    val p = findPrimesUpTo(n)
    println("Простые числа до $n:")
    println(p.joinToString(", "))
}
fun findPrimesUpTo(n: Int): List<Int> {
    val r = mutableListOf<Int>()
    for (i in 2..n) {
        if (isPrime(i)) {
            r.add(i)
        }
    }
    return r
}
fun isPrime(num: Int): Boolean {
    if (num < 2) return false
    for (i in 2 until Math.sqrt(num.toDouble()).toInt() + 1) {
        if (num % i == 0) {
            return false
        }
    }
    return true
}