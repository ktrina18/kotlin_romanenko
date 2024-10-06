//4. Создайте функцию, которая принимает три аргумента prob, prize, pay и
//возвращает True, если prob * prize > pay, в противном случае
//возвращает False.

fun main() {
    val prob = 1
    val prize = 4
    val pay = 40

    println(isProfitable(prob, prize, pay)) // Выведет false
}

fun isProfitable(prob: Int, prize: Int, pay: Int): Any {
    return prob * prize > pay
}


