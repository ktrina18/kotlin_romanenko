//Простые числа в диапазоне: Выведите все простые числа в заданном
//пользователем диапазоне.

fun main() {
    println("Введите начало диапазона:")
    val a = readLine()!!.toInt()
    println("Введите конец диапазона:")
    val b = readLine()!!.toInt()

    println("Простые числа в диапазоне от $a до $b:")
    for (number in a..b) {
        if (isPrime(number)) {
            print("$number ")
        }
    }
}

fun isPrime(number: Int): Boolean {
    if (number <= 1) {
        return false
    }
    for (i in 2..Math.sqrt(number.toDouble()).toInt()) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}

