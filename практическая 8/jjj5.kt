////4. Создайте функцию, которая принимает три аргумента prob, prize, pay и
////возвращает True, если prob * prize > pay, в противном случае
////возвращает False.

fun main() {
    val prob = 0.5
    val prize = 100
    val pay = 40

    println(isProfitable(prob, prize, pay)) // Выведет true
}

fun isProfitable(prob: Double, prize: Int, pay: Int): Any {
    return prob * prize > pay
}
