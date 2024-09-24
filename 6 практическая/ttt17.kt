//17.Сумма и произведение: Напишите программу, которая находит и
//выводит сумму и произведение всех элементов массива.

fun main(){
    val numbers = intArrayOf(3,8,6,5,4)
    var s = 0
    var p = 1

    for(number in numbers){
        s += number
        p *= number
    }
    println("Сумма массива: $s")
    println("Произведение массива: $p")
}