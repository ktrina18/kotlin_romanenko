//10.Способы оплаты: Напишите программу, которая принимает способ
//оплаты (наличные, кредитная карта, PayPal) и выдает соответствующее
//сообщение.


fun main() {
    println("Введите способ оплаты (наличные, кредитная карта, PayPal):")
    val a = readLine()!!.lowercase()

    when (a) {
        "наличные" -> println("Оплата наличными принята.")
        "кредитная карта" -> println("Введите данные кредитной карты.")
        "paypal" -> println("Оплата через PayPal.")
        else -> println("Неверный способ оплаты.")
    }
}