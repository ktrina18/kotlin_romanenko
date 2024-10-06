// 14.Сумма двух чисел: Создайте функцию, которая принимает два числа и
//возвращает их сумму.

fun sum(num1: Int, num2: Int): Int {
    return num1 + num2
}
fun main() {
    val num1 = 56
    val num2 = 11
    val result = sum(num1, num2)
    println("Сумма чисел $num1 и $num2 равна $result")
}