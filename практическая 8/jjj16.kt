//16.Определение четности: Создайте функцию, которая принимает одно
//число и возвращает true, если оно четное, и false, если нечетное

fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

fun main() {
    val number = 56
    val result = isEven(number)
    if (result) {
        println("$number — четное число.")
    } else {
        println("$number — нечетное число.")
    }
}