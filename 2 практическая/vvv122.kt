//7. Вычислить значение логического выражения при следующих
//значениях логических величин А, В и С: А = Истина, В = Ложь, С =
//Ложь: а) А или не (А и В) или С; б) не А или А и (В или С); в) (А или В
//и не С) и С.

fun main() {
    val a = true
    val b = false
    val c = false

    if (a || !(a && b) || c) {
        println("true")
    } else {
        println("false")
    }
    if (!a || a && (b || c)) {
        println("false")
    } else {
        println("true")
    }
    if ((a || b && !c) && c) {
        println("false")
    } else {
        println("true")
    }
}