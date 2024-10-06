//15.Сравнение чисел: Напишите функцию, которая принимает два числа и
//возвращает большее из них.

fun compareNumbers(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}

fun main() {
    val number1 = 45
    val number2 = 46

    val result = compareNumbers(number1, number2)
    println("Большее число: $result")
}