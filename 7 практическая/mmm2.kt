fun main() {
    println("Введите слово:")
    val w = readLine().toString()

    if(isPalindrome(w)){
        println("Слово является палиндромом")
    } else {
        println("Слово не является палиндромом")
    }
}

fun isPalindrome(word: String): Boolean {
    val r = word.reversed()
    return word.equals(r, ignoreCase = true)
}