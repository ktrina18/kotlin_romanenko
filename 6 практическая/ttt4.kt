//4. Сортировка массива: Реализуйте алгоритм сортировки для массива
//чисел и выведите отсортированный массив

fun main (){
    val numbers: IntArray = intArrayOf(23,2,5,9,22,1,7,10,6)
    numbers.sort()
    println("Сортированный массив: ${numbers.contentToString()}")
}