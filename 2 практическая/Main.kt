//3. Вычислить значение логического выражения при следующих
//значениях логических величин А, В и С: А = Истина, В = Ложь, С =
//Ложь: а) не А и В; б) А или не В; в) А и В или С.

fun main() {
 val a = true
    val b = false
    val c = false

    if(!a&&b){
    println("false")
    }
    else{
        println("true")
    }
    if(a||!b){
        println("true")
    }
    else{
        println("false")
    }
    if(a&&b||c){
        println("false")
    }
    else{
        println("true")
    }
}