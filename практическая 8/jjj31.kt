//31.Преобразование Celsius в Fahrenheit: Создайте функцию, которая
//конвертирует температуру из Цельсия в Фаренгейт.

fun celsiusToFahrenheit(celsius: Double): Double {
    // Формула преобразования Цельсия в Фаренгейт
    return (celsius * 9 / 5) + 32
}

fun main() {
    val celsius = 25.0
    val fahrenheit = celsiusToFahrenheit(celsius)
    println("$celsius °C = $fahrenheit °F")
}