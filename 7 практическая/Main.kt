//1.Написать консольный калькулятор

fun main() {
    var a: Double
    var b: Double
    var o: Char

    print("Введите первое число: ")
    a = readLine()!!.toDouble()

    print("Введите оператор (+, -, *, /): ")
    o = readLine()!![0]

    print("Введите второе число: ")
    b = readLine()!!.toDouble()

    when (o) {
        '+' -> println("Результат: ${a + b}")
        '-' -> println("Результат: ${a - b}")
        '*' -> println("Результат: ${a * b}")
        '/' -> {
            if (b != 0.0) {
                println("Результат: ${a / b}")
            } else {
                println("Ошибка: Деление на ноль")
            }
        }

        else -> println("Ошибка: Некорректный оператор")
    }
}