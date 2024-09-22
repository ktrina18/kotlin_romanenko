//30.Конвертация в двоичную систему: Напишите программу, которая
//конвертирует целое число в двоичную систему

fun main() {
    println("Введите целое число для преобразования в двоичную систему:")
    val a = readLine()!!.toInt()

    val b = decimalToBinary(a)
    println("$a в двоичной системе: $b")
}

fun decimalToBinary(d10: Int): String {
    var c = ""
    var e = d10

    while (e > 0) {
        val r = e % 2
        c = r.toString() + c
        e /= 2
    }

    return if (c.isEmpty()) "0" else c
}