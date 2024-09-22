//23.Сложение и умножение: Напишите программу, которая запрашивает у
//пользователя две цифры и повторяет сложение или умножение, до тех
//пор, пока пользователь не введет "стоп".

fun main() {
    while (true) {
        print("Введите первое число: ")
        val a = readLine()!!
        if (a == "СТОП") break

        print("Введите второе число: ")
        val b = readLine()!!
        if (b == "СТОП") break

        try {
            val a1 = a.toFloat()
            val b2 = b.toFloat()

            print("Выберите + или *: ")
            val c = readLine()!!

            when (c) {
                "+" -> println("$a1 + $b2 = ${a1 + b2}")
                "*" -> println("$a1 * $b2 = ${a1 * b2}")
                else -> println("Непонятная операция. Доступны + и *.")
            }
        } catch (e: NumberFormatException) {
            println("Непонятный ввод. Пожалуйста, введите числа.")
        }
    }
}