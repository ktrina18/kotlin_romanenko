//13.Дано четырехзначное число. Определить: а) равна ли сумма двух
//первых его цифр сумме двух его последних цифр; б) кратна ли трем
//сумма его цифр; в) кратно ли четырем произведение его цифр; г)
//кратно ли произведение его цифр числу а

fun main() {
    print("Введите четырехзначное число: ")
    val a = readLine()!!.toInt()

// Проверяем, является ли число четырехзначным
    if (a < 1000 || a > 9999) {
        println("Число не является четырехзначным.")
        return
    }
    // Получаем цифры числа
    val thousands = a / 1000
    val hundreds = (a % 1000) / 100
    val tens = (a % 100) / 10
    val units = a % 10

    // а) Сумма первых двух цифр равна сумме последних двух
    val sumFirstTwo = thousands + hundreds
    val sumLastTwo = tens + units
    if (sumFirstTwo == sumLastTwo) {
        println("Сумма первых двух цифр равна сумме последних двух.")
    } else {
        println("Сумма первых двух цифр не равна сумме последних двух.")
    }

    //6) Сумма цифр кратна трем
    val sumAllDigits = thousands + hundreds + tens + units
    if (sumAllDigits % 3 == 0) { println("Сумма цифр кратна трем.")
    } else {
        println("Сумма цифр не кратна трем.")
    }

    // в) Произведение цифр кратно четырем
    val productDigits = thousands * hundreds * tens * units
    if (productDigits % 4== 0) {
        println("Произведение цифр кратно четырем.")
    }
    else {
        println("Произведение цифр не кратно четырем.")
    }

    // г) Произведение цифр кратно числу а print("Введите число а: ")
    val f = readLine()!!.toInt()
    if (productDigits % f == 0) {
        println("Произведение цифр кратно фа.")
    }
    else {
        println("Произведение цифр не кратно Ѕа.")
    }}