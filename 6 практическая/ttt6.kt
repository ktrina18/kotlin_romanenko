//6. Четные и нечетные числа: Создайте массив и разделите его на четные и
//нечетные числа, сохранив их в разные массивы.

fun main() {
    val numbers = arrayOf(26,33,1,22,95,44,43,5,7,22)

    val a = mutableListOf<Int>()
    val b = mutableListOf<Int>()

    for (number in numbers) {
        if (number % 2 == 0) {
            a.add(number)
        } else {
            b.add(number)
        }
    }
    println("Четные числа: $a")
    println("Нечетные числа: $b")
}
