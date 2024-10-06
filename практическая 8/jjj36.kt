//36.Проверка строки на наличие подстроки: Напишите функцию, которая
//проверяет, содержится ли одна строка в другой.

fun containsSubstring(mainString: String, substring: String): Boolean {
    // Используем метод contains для проверки наличия подстроки
    return mainString.contains(substring)
}

fun main() {
    val m = "Я люблю учится в ФСПО "
    val s = "ФСПО ?"
    val r = containsSubstring(m, s)

    if (r) {
        println("Строка \"$s\" содержится в строке \"$m\".")
    } else {
        println("Строка \"$s\" не содержится в строке \"$m\".")
    }
}