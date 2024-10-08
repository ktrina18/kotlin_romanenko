//11.Пересечение массивов: Напишите программу, которая находит
//пересечение двух массивов и выводит результат

fun main() {
    val a1 = arrayOf(1, 7, 9, 3, 6)
    val a2 = arrayOf(4, 5, 6, 9, 8)

    // Находим пересечение
    val i = a1.toSet().intersect(a2.toSet())
    // Преобразуем пересечение обратно в массив
    val r = i.toTypedArray()
    println("Пересечение массивов: ${r.joinToString(", ")}")
}