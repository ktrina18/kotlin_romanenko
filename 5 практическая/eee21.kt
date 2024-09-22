//21.Вывод даты: Пользователь вводит год и месяц, программа выводит все
//даты в этом месяце.

fun main() {
    print("Введите год: ")
    val a = readLine()!!.toInt()
    print("Введите месяц: ")
    val b = readLine()!!.toInt()

    // Проверка корректности ввода месяца
    if (b !in 1..12) {
        println("Нет такого месяца.")
        return
    }
    // Получение последнего дня месяца
    val d = when (b) {
        2 -> if (isLeapYear(a)) 29 else 28
        4, 6, 9, 11 -> 30
        else -> 31
    }
    // Вывод всех дат в заданном месяце
    for (day in 1..d) {
        println(String.format("%02d.%02d.%04d", day, b, a))
    }
}

// Функция для проверки високосного года
fun isLeapYear(year: Int): Boolean {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
}