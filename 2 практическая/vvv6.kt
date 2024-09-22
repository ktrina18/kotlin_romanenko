fun main(){
    val a = true
    val b = false
    val c = false

    if(a||b){
        println("true")
    }
    else{
        println("false")
    }
    if(a&&b){
        println("false")
    }
    else{
        println("true")
    }
    if(b||c){
        println("false")
    }
    else{
        println("true")
    }
}
