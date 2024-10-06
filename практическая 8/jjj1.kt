//1. Напишите функцию, которая принимает список на вход, и возвращает
//сумму всех элементов этого списка.

fun sumOfList(list: List<Int>): Int {  // возвращает сумму значений
    var s = 0
    for (num in list) {
        s += num
    }
    return s
}
fun main() {
    val m = listOf(1, 2, 3, 4, 5)
    println("Сумма всех элементов списка: ${sumOfList(m)}")
}