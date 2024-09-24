//8. Поиск элемента: Реализуйте поиск элемента в массиве и выводите его
//индекс.

fun main() {
    val a = arrayOf(1, 3, 5, 7, 9)
    val b = 7

    for (i in a.indices){
    if(a[i] == b){
        println("Индекс элемента $b: $i")
        break
    }}
}