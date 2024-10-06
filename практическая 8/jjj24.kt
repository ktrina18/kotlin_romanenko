//24.Конвертация в верхний регистр: Напишите функцию, которая
//принимает строку и возвращает её в верхнем регистре

fun convertToUpperCase(inputString: String): String {
    return inputString.toUpperCase()
}

fun main() {
    val i = "Hello, World!"
    val u = convertToUpperCase(i)
    println(u)
}