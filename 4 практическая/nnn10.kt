//11.Группа крови: вводится группа крови (A, B, AB, O) и выводится, какие
//типы крови можно применять для переливания.

fun main() {
    println("Введите группу крови (A, B, AB, O):")
    val a = readLine()!!.uppercase()

    val b = when (a) {
        "A" -> listOf("A", "O")
        "B" -> listOf("B", "O")
        "AB" -> listOf("A", "B", "AB", "O")
        "O" -> listOf("O")
        else -> listOf()
    }
    if (b.isEmpty()) {
        println("Неверная группа крови.")
    } else {
        println("Совместимые группы крови для переливания: ${b.joinToString(", ")}")
    }
}



