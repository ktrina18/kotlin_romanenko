//10.Создайте рекурсивную функцию, которая принимает два параметра и
//повторяет строку n количество раз. Первый параметр txt - это строка,
//которую нужно повторить, а второй параметр - количество повторений
//строки.

fun repeatString(txt: String, n: Int) {
    if (n > 0) {
        println(txt)
        repeatString(txt, n - 1)
    }
}

fun main() {
    val txt = "Help!!!!!!"
    val n = 10
    repeatString(txt, n)
}