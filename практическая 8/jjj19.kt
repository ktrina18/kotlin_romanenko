//19.Сумма чисел в массиве: Создайте функцию, которая принимает массив
//целых чисел и возвращает их сумму.

fun sumArray(numbers: IntArray): Int {
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    return sum
}

fun main() {
    val a = intArrayOf(23,11,22,34,6)
    println("Сумма чисел в массиве: ${sumArray(a)}")
}