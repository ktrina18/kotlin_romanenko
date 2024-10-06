//22.Проверка палиндрома: Напишите функцию, которая проверяет,
//является ли строка палиндромом.


fun isPalindrome(input: String): Boolean {
    // Удаляем пробелы и приводим строку к нижнему регистру для корректного сравнения
    val cleanInput = input.replace(" ", "").lowercase()

    // Сравниваем строку с её обратной версией
    return cleanInput == cleanInput.reversed()
}

fun main() {
    // Примеры строк для проверки
    val testStrings = listOf("Давид, иди в ад!", "Кот", "Привет", "Кот на лужайке на кота")

    for (string in testStrings) {
        if (isPalindrome(string)) {
            println("\"$string\" является палиндромом.")
        } else {
            println("\"$string\" не является палиндромом.")
        }
    }
}