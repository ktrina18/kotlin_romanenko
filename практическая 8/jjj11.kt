
//11.Создайте функцию, которая принимает уравнение (например, "1+1") и
//возвращает ответ

fun calculateEquation(equation: String): Int {
    val numbers = equation.split("+")
    val num1 = numbers[0].toInt()
    val num2 = numbers[1].toInt()
    return num1 + num2
}

fun main() {
    val equation = "1+1"
    val result = calculateEquation(equation)
    println("Result: $result")
}