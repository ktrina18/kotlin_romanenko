//9. Копирование массива: Создайте новый массив, скопировав в него
//элементы из другого массива.

fun main() {
    val a1 = arrayOf(1, 2, 3, 4, 5)
    val b2 = Array(a1.size) { i -> a1[i] }
    println("Оригинальный массив: ${a1.joinToString()}")
    println("Копированный массив: ${b2.joinToString()}")
}