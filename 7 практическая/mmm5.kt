//Создайте программу, которая в качестве параметров принимает два числа и
//возвращает True, если эти числа равны, и False в противном случае.

fun areNumbersEqual(a: Int, b: Int): Boolean {
    return a == b
}
fun main() {
    println("Введите первое число:")
    val i = readLine()
    val n = i?.toIntOrNull()

    println("Введите второе число:")
    val i2 = readLine()
    val n2 = i2?.toIntOrNull()

    // Проверяем, были ли введены корректные числа
    if (n != null && n2 != null) {
        // Вызываем функцию и выводим результат
        val r = areNumbersEqual(n, n2)
        println("Числа равны: $r")
    }
    else {
        println("Одно или оба введенных значения непонятны.")
    }
}