//6. Функция получает на вход два числа. Она должна вернуть True, если
//сумма этих чисел меньше 100 и False в противном случае

fun isSumLessThan100(num1: Int, num2: Int): Boolean {
    // Проверка условия: если сумма меньше 100
    return (num1 + num2) < 100
}

fun main() {
    // Примеры значений для проверки
    val n1 = 35
    val n2 = 20

    val result = isSumLessThan100(n1, n2)
    println("Сумма чисел меньше 100? $result")
}