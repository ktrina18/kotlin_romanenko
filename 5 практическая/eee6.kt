//6. Вывод таблицы умножения: Напишите программу, которая выводит
//таблицу умножения от 1 до 10

fun main() {
    for (i in 1..10) {
        for (j in 1..10) {
            print("$i * $j = ${i * j}\t") // t - это табуляция
        }
        println() // Переход на новую строку после каждой строки таблицы
    }
}