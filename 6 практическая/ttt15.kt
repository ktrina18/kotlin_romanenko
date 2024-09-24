//15.Проверка на палиндром: Напишите программу, которая проверяет,
//является ли массив палиндромом.

fun main() {
    val a = arrayOf(1, 2, 3, 4, 3, 2, 3)
    // Проверяем, является ли массив палиндромом
    val Palindrome = checkPalindrome(a)

    if (Palindrome) {
        println("Массив является палиндромом.")
    }
    else {
        println("Массив не является палиндромом.")
    }
}

// Функция для проверки на палиндром
fun checkPalindrome(array: Array<Int>): Boolean {
    val length = array.size

    for (i in 0 until length / 2) {
        if (array[i] != array[length - 1 - i]) {
            return false // Если элементы не равны, массив не палиндром
        }
    }
    return true // Если все элементы совпадают, массив палиндром
}