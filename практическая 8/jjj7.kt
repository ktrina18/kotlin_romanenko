//7. Напишите функцию, которая принимает целое число и возвращает
//True, если оно делится на 100. В противном случае функция должна
//вернуть False

fun isDivisibleBy100(number: Int): Boolean {
    // Проверка деления на 100
    return number % 100 == 0
}

fun main() {
    // Примеры значений для проверки
    val testNumber1 = 200
    val r = isDivisibleBy100(testNumber1)
    println("Число $testNumber1 делится на 100? $r")
}