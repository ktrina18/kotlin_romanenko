//


fun findLongestWord(input: String): String {
    // Удаляем знаки препинания с помощью регулярного выражения
    val c = input.replace(Regex("[^\\w\\s]"), "")
    // Разбиваем строку на слова
    val w = c.split("\\s+".toRegex())
    return w.maxByOrNull { it.length } ?: "" // Находим самое длинное слово
    }
    fun main() {    println("Введите строку:")
        val i = readLine()
        if (!i.isNullOrBlank()) {
            val longestWord = findLongestWord(i)
            println("Самое длинное слово: \"$longestWord\"")
        }}