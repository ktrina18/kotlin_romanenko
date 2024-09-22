//4. Вычислить значение логического выражения при следующих
//значениях логических величин X, Y и Z: X = Истина, Y = Истина, Z =
//Ложь: а) не X и Y; б) X или не Y; в) X или Y и Z

fun main(){
    val x = true
    val y = true
    val z = false

    if(!x&&y){
        println("false")
    }
    else{
        println("true")
    }
    if(x||!y){
        println("true")
    }
    else{
        println("false")
    }
    if(x||y&&z){
        println("false")
    }
    else{
        println("true")
    }
}