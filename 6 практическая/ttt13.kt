//13.Заполнение случайными числами: Создайте массив из 20 случайных
//чисел от 1 до 100 и выведите его на экран.

import kotlin.random.Random

fun main() {
    // Создаем массив из 20 элементов
    val a = IntArray(20) { Random.nextInt(1, 101) }

    println("Случайные числа: ")
    println(a.joinToString(", "))
}