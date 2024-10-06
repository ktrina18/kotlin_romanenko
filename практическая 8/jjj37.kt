//37.Печать таблицы умножения: Создайте функцию, которая выводит
//таблицу умножения от 1 до 10 для заданного числа

fun printMultiplicationTable(number: Int) {
    println("Таблица умножения для числа $number:")
    for (i in 1..10) {
        val r = number * i
        println("$number x $i = $r")
    }
}

fun main() {
    val n = 9
    printMultiplicationTable(n)
}

