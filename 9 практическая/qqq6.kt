//6. Сортировка строк: Напишите функцию, которая принимает массив
//строк и сортирует его по алфавиту.

fun sortStringsAlphabetically(strings: Array<String>): Array<String> {
    return strings.sortedArray()
}
fun main() {
    val s = arrayOf("albina","katya",  "dima", "dan")
    val e = sortStringsAlphabetically(s)
    println("Отсортированные строки: ")
    e.forEach { println(it) }
}