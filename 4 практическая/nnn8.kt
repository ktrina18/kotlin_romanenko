//8. Определить время приготовления по типу пищи

fun main(){
 println("Введите тип пищи (курица, рыба, омлет, суп):")
val a = readLine()!!.lowercase()

val b = when (a) {
    "курица" -> 60
    "рыба" -> 20
    "омлет" -> 15
    "суп" -> 10
    else -> -1
  }
 if (b == -1) {
     println("Неизвестный тип пищи.")
 }
 else {
     println("Примерное время приготовления: $b минут.")
        }
    }




