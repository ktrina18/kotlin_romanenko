//7. Изменение регистра: Создайте программу, которая принимает строку и
//меняет регистр всех букв на противоположный.

fun toggleCase(input: String): String {
    return input.map {
    when
    {
        it.isUpperCase() -> it.lowercaseChar()  // заглавные буквы в строчные
        it.isLowerCase() -> it.uppercaseChar()  //  строчные буквы в заглавные
     else -> it  // Оставляем символ без изменений
    }
    }.joinToString("")  // Объединяем список символов обратно в строку
}
fun main() {
    println("Введите строку: ")
    val i = readLine() ?: ""
    val t = toggleCase(i)
    println("Строка с измененным регистром: $t")}
