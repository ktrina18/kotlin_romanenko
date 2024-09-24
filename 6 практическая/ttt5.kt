//5. Уникальные элементы: Напишите программу, которая выводит
//уникальные элементы из массива.

fun main() {
    val arr = arrayOf(1,2,3,4,5,8,13,4,12,7,23)
    val uniqueElements = arr.distinct()

    println("Уникальные элементы массива:")
    for (element in uniqueElements) {
        println(element)
    }
}