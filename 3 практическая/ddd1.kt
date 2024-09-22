// 3 практическая
//Определить какое из трех введенных пользователем чисел
//максимальное и вывести его на экран.

fun main(){
    println("Введите число a:")
    val a = readLine()
    println("Введите число b:")
    val b = readLine()
    println("Введите число c:")
    val c = readLine()

        if (a!! >= b.toString() && a>= c.toString()){
            println("Первое число является наибольшим ")
        } else if (b!! >= a.toString() && b>= c.toString()){
            println("Второе число является наибольшим")
        } else {
            println("Третье число является наибольшим")
        }
    }





