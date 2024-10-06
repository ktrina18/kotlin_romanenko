//25.Объединение строк: Создайте функцию, которая принимает две строки
//и возвращает их объединение.

fun concatenateStrings(str1: String, str2: String): String {
    return str1 + str2
}

fun main() {
    val s1 = "Привет, "
    val s2 = "мир!"
    val r = concatenateStrings(s1, s2)
    println(r)
}