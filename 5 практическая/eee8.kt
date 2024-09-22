//8. Наибольший общий делитель (НОД): Напишите программу, которая
//находит НОД двух введенных чисел с использованием алгоритма
//Евклида

fun main() {
    println("Введите первое число:")
    val a = readLine()!!.toInt()
    println("Введите второе число:")
    val b = readLine()!!.toInt()

    val gcd = gcd(a, b)
    println("НОД($a, $b) = $gcd")
}

fun gcd(a: Int, b: Int): Int {
    if (b == 0) {
        return a
    } else {
        return gcd(b, a % b)
    }
}