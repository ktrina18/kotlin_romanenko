//16.Конкатенация двух массивов: Создайте два массива и соедините их в
//один.

fun main (){
    val a = arrayOf(2,6,9,3)
    val b = arrayOf(4,8,9,5)

    val c = a + b
    println("Объединённый массив: ${c.contentToString()}")
}