//29.Сумма ряда: Напишите программу, которая находит сумму ряда 1, 1/2,
//1/3, ..., 1/N

fun main() {
    println("Введите любое число: ")
    val a = readLine()!!.toInt()
    var b = 0.0

    for (i in 1..a) {
        b += 1.0 / i
    }

    println("Сумма ряда 1 + 1/2 + 1/3 + ... + 1/$a = $b")
}