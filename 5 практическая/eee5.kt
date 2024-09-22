//5. Проверка числа на простоту: Пользователь вводит число, программа
//определяет, является ли оно простым

fun main() {
    println("Введите число:")
    val a = readLine()!!.toInt()

    var b = true

    if (a <= 1) {
        b = false
    }
    else {
        for (i in 2..Math.sqrt(a.toDouble()).toInt()) {
            if (a % i == 0) {
                b = false
                break
            }
        }
    }

    if (b) {
        println("$a - простое число")
    }
    else {
        println("$a - не простое число")
    }
}