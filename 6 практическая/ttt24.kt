//24.Транспонирование матрицы: Создайте матрицу (двумерный массив) и
//напишите программу, которая транспонирует её.

fun main() {
    // Определение исходной матрицы
    val m = arrayOf(
        intArrayOf(66, 43, 8),
        intArrayOf(78, 5, 23),
        intArrayOf(34, 10, 54)
    )
    println("Исходная матрица:")
    printMatrix(m)

    val t = transpose(m)

    println("\nТранспонированная матрица:")
    printMatrix(t)
}

// Функция для транспонирования матрицы
fun transpose(matrix: Array<IntArray>): Array<IntArray> {
    val r = matrix.size
    val c = matrix[0].size

    // Создание новой матрицы с переставленными строками и столбцами
    val d = Array(c) { IntArray(r) }

    for (i in 0 until r) {
        for (j in 0 until c) {
            d[j][i] = matrix[i][j]
        }
    }

    return d
}

// Функция для вывода матрицы на консоль
fun printMatrix(matrix: Array<IntArray>) {
    for (row in matrix) {
        for (element in row) {
            print("$element ")
        }
        println()
    }
}



