//38.Нахождение длины строки: Напишите функцию, которая возвращает
//длину переданной ей строки.

fun getStringLength(input: String): Int {
    // Используем свойство length для получения длины строки
    return input.length
}

fun main() {
    val i = "Привет, мир!"
    val l = getStringLength(i)
    println("Длина строки составляет: $l")
}