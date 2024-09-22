//7. Даны два различных вещественных числа. Определить: а) какое из них
//больше; б) какое из них меньше.

fun main() {
    println("Введите первое число:")
    val a = readLine()!!.toInt()

    println("Введите второе число:")
    val b = readLine()!!.toInt()

    if (a > b) {
        println("$a больше, чем $b")
        println("$b меньше, чем $a")
    } else {
        println("$b больше, чем $a")
        println("$a меньше, чем $b")

    }

}