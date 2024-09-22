//2.Среди трех чисел найти среднее. Если среди чисел есть равные,
//вывести сообщение "Ошибка".

fun main(){
    print("Введите первое число: ")
    val a = readLine()!!.toInt() //toInt - преобразует данные в тот тип, который идет после префикса to

    print("Введите второе число: ")
    val b = readLine()!!.toInt()

    print("Введите третье число: ")
    val c = readLine()!!.toInt()

    val average = findAverage(a, b, c)
    if (average != null) {
        println("Среднее число: $average")
    } else {
        println("Ошибка")
    }
}
fun findAverage(a: Int, b: Int, c: Int): Int? { //ищет среднее значение
    return if (a != b && a != c && b != c) {
        when {
            (a > b && a < c) || (a < b && a > c) -> a
            (b > a && b < c) || (b < a && b > c) -> b
            else -> c
        }
    } else {
        null
    }
}






