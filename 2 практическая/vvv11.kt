//6. Вычислить значение логического выражения при следующих
//значениях логических величин X, Y и Z: X = Ложь, Y = Ложь, Z =
//Истина: а) X или Y и не Z; г) X и не Y или Z; б) не X и не Y; д) X и (не
//Y или Z); в) не (X и Z) или Y; е) X или (не (Y или Z)).

fun main(){
    val x = false
    val y = false
    val z = true

    if(x||y&&!z){         //a
        println("false")
    }
    else{
        println("true")
    }
    if(!x&&!y){          //b
        println("true")
    }
    else{
        println("false")
    }
    if(!(x&&z)||y){       //v
        println("true")
    }
    else{
        println("false")
    }
    if(x&&!y||z){         //g
        println("true")
    }
    else{
        println("false")
    }
    if(x&&(!y||z)){        //d
        println("false")
    }
    else{
        println("true")
    }
    if(x||(!(y||z))){      //e
        println("false")
    }
    else{
        println("true")
    }



}