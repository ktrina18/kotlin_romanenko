//41.Количество гласных в строке: Создайте функцию, которая считает
//количество гласных в строке.

fun countVowels(input: String): Int {
    val v = listOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    var c = 0
    for (char in input) {
        if (char in v) {
            c++
        }
    }

    return c
}

fun main() {
    val s = "Hello, World!"
    println("Количество гласных в строке: ${countVowels(s)}")
}