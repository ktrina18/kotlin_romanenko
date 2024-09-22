//Определить тип треугольника по длинам сторон

fun main() {
    print("Введите стороны треугольника:")
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    if (a + b > c && a + c > b && b + c > a) {
    if (a == b && b == c) {
        println("Треугольник равносторонний")
    }
    else if (a == b || a == c || b == c) {
            println("Треугольник равнобедренный")
        }
    else {
            println("Треугольник разносторонний")
        }
    }
    else {
        println("Треугольник с такими сторонами не существует")
    }
}