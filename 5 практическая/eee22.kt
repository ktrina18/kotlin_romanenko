//Угадай число: Напишите игру, в которой пользователь должен угадать
//случайное число от 1 до 100

import kotlin.random.Random

fun main() {
    val a = Random.nextInt(1, 101) // Загадываем число от 1 до 100
    var b = 0
    println("Я загадала число от 1 до 100. Попробуйте угадать!")

    while (true) {
        print("Введите ваше число: ")
        val c = readLine()?.toIntOrNull()

        if (c != null) {
            when {
                c < a -> println("Мало! Попробуйте еще раз :)")
                c > a -> println("Много! Попробуйте еще раз :)")
                else -> {
                    println("Угадал!")
                    break // Выходим из цикла, если угадали
                }
            }}}}

