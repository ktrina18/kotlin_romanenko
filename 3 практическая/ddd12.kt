//Дано двузначное число. Определить: а) какая из его цифр больше:
//первая или вторая; б) одинаковы ли его цифры.

fun main() {
    println("Введите двузначное число a: ")
    val a = readLine()!!.toInt()
    println("Введите двузначное число b: ")
    val b = readLine()!!.toInt()

        // Определяем, какая из цифр больше
        if (a > b) {
            println("Первая цифра $a больше второй цифры $b.")
        } else if (a < b) {
            println("Вторая цифра ($b) больше первой цифры ($a.")
        } else {
            println("Цифры одинаковы: $a и $b.")
        }
    }
