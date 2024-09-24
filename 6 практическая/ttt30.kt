//30.Распределение по группам: Создайте массив из 100 целых чисел и
//разделите их на 10 групп по 10 элементов, затем выведите результаты.

import kotlin.random.Random

fun main() {
    // Создаем массив размером 100 и заполняем его случайными целыми числами
    val n = IntArray(100) { Random.nextInt(1, 101) } // Случайные числа от 1 до 100

    // Выводим исходные числа
    println("Исходные числа:")
    println(n.joinToString())

    // Разделяем числа на 10 групп по 10 элементов
    val groups = Array(10) { IntArray(10) }

    for (i in n.indices) {
        val g = i / 10  // Индекс группы
        val e = i % 10 // Индекс элемента внутри группы
        groups[g][e] = n[i]
    }

    // Выводим группы
    println("\nГруппы:")
    for (i in groups.indices) {
        println("Группа ${i + 1}: ${groups[i].joinToString()}")
    }
}







