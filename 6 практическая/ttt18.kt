//18.Группировка чисел: Разделите массив на группы по 5 элементов и
//выведите их.

fun main(){
    val numbers = listOf(5,8,9,7,3,6,22,41,66,4,55,23,43,12,54,15)
    //Разбиваем список на группы по 5 эл-ов
    val g = numbers.chunked(5)

    for((index,g) in g.withIndex()){
        println("Группа ${index + 1}: ${g.joinToString ()}")
    }
}