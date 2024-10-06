//28.Создание массива от 1 до N: Напишите функцию, которая создает
//массив целых чисел от 1 до N.

fun createArrayFromOneToN(n: Int): IntArray {
    return IntArray(n) { it + 1 } // Создаёт массив от 1 до N
}

fun main() {
    val n = 10
    val a = createArrayFromOneToN(n)

    println("Массив от 1 до $n: ${a.joinToString()}")
}