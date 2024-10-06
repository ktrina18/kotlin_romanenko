//12.Напишите функцию, которая принимает число number, и возвращает
//слово Google с количеством букв o, равным number.

fun generateGoogleWord(number: Int): String {
    return "G" + "o".repeat(number) + "gle"
}

fun main() {
    val number = 3
    println(generateGoogleWord(number))
}