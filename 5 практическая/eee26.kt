//.Сумма четных и нечетных чисел: Пользователь вводит N, программа
//считает сумму четных и нечетных чисел от 1 до N.

fun main() {
    print("Введите число N: ")
    val a = readLine()!!.toInt()

    val b = sumEvenOdd(a)
    val c = sumEvenOdd(a)

    println("Сумма четных чисел от 1 до $a: $b")
    println("Сумма нечетных чисел от 1 до $a: $c")
}

fun sumEvenOdd(n: Int): Pair<Int, Int> {
    var e = 0
    var o = 0

    for (i in 1..n) {
        if (i % 2 == 0) {
            e += i
        }
        else {
            o += i
        }
    }

    return Pair(e, o)
}