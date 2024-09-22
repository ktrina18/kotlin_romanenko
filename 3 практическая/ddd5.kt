//5.Вводятся длины трех сторон предполагаемого треугольника.
//Определить, может ли существовать треугольник с такими сторонами
//при условии, что, треугольник существует только тогда, когда ни одна
//его сторона не превышает сумму двух других.

fun main() {
    print("Введите сторону a: ")
    val a = readLine()!!.toInt()
    print("Введите сторону b: ")
    val b = readLine()!!.toInt()
    print("Введите сторону c: ")
    val c = readLine()!!.toInt()

    if (a + b > c && a + c > b && b + c > a) {
        println("Треугольник с такими сторонами может существовать")
    } else {
        println("Треугольник с такими сторонами не может существовать")
    }
}