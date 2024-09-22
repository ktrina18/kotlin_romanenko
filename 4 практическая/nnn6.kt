//Игра угадай число
import kotlin.random.Random     //импортируем класс Random для генерации
fun main() {
    val a = Random.nextInt(1, 50)   //от 1 (включительно) до 50 (не включительно)
    println("Добро пожаловать в игру 'Угадай число'!")
    println("Я загадала число от 1 до 50. Попробуйте угадать.")

    while (true) {
        print("Введите ваше число: ")
        val c = readLine()!!.toInt()

        when{
        c < a -> println("Мало! Попробуйте ещё :)")
        c > a -> println("Много! Попробуйте ещё :)")
        else -> {
            println("ПОЗДРАВЛЯЮ!!! Вы угадали число $a")
        }
        }
    }
}