//Определить знак числа
//определяет его знак положительное, отрицательное или нулевое

fun main() {
    print("Введите число:")
    val a = readLine()!!.toInt()

    if (a > 0) {
        println("Число $a является положительным")
    }
    else if (a < 0) {
        println("Число $a является отрицательным")
    }
    else {
        println("Число $a является нулём")
    }
}
