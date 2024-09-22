//4. Определение времени суток

fun main() {
    print("Введите время в формате ЧЧ:ММ: ")
    val a = readLine()!!.split(":")
    val b = a[0].toInt()

    if (b in 0..5) {
        println("Ночь")
    }
    else if (b in 6..11) {
        println("Утро")
    }
    else if (b in 12..17) {
        println("День")
    }
    else if (b in 18..23) {
        println("Вечер")
    }
    else {
        println("Неверное время")
    }}