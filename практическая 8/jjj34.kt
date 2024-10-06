//34.Удаление пробелов из строки: Напишите функцию, которая удаляет все
//пробелы из переданной строки.

fun removeSpaces(input: String): String {
    return input.replace(" ", "")
}

fun main() {
    val o = "Что здесь происходит ?"
    val s = removeSpaces(o)

    println("Строка без пробелов: \"$s\"")
}