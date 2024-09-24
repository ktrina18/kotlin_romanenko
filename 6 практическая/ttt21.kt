//21.Удаление элемента: Реализуйте функцию, которая удаляет заданный
//элемент из массива

fun removeElement(arr: IntArray, element: Int): IntArray {      //Функция removeElement принимает два параметра: arr - массив чисел типа IntArray, и element - элемент, который нужно удалить из массива.
    return arr.filter { it != element }.toIntArray()
}
fun main() {
    val a = intArrayOf(1,43,7,54,23,9,2,4,8,)
    val e = 2
    val n = removeElement(a, e)

    println("Массив: ${a.joinToString()}")
    println("Массив с удаленным эл-ом $e: ${n.joinToString()}")
}