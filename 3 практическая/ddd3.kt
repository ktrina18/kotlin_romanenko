//3.Из двух чисел с разной четностью вывести на экран нечетное число.

fun main(){
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()

    if (a % 2 != b % 2) {
        if (a % 2 != 0) {
            println(a)
        } else {
            println(b)
        }
    }

}




