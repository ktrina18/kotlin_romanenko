//.Проверка на простоту: Напишите функцию, которая проверяет,
//является ли заданное число простым.

fun isPrime(number: Int): Boolean {
    if (number <= 1) {
        return false
    }
    for (i in 2 until number) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}
fun main() {
    val n = 17
    if (isPrime(n)) {
        println("$n является простым числом")
    }
    else {
        println("$n не является простым числом")
    }
}
