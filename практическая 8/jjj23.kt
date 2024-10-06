//23.Количество символов: Создайте функцию, которая принимает строку и
//возвращает количество символов в ней.

fun countCharacters(str: String): Int {
    return str.length
}

fun main() {
    val text = "Hello, World!"
    println(" ${countCharacters(text)}")
}