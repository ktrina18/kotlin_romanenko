//24.Транспонирование матрицы: Напишите программу, которая
//транспонирует матрицу (двумерный массив).

fun main() {
    val a = arrayOf(
        intArrayOf(7, 9, 4),
        intArrayOf(3, 2, 5),
        intArrayOf(8, 1, 6)
    )

    println("Исходная матрица:")
    printMatrix(a)

    val b = transposeMatrix(a)

    println("Транспонированная матрица:")
    printMatrix(b)
}

fun transposeMatrix(matrix: Array<IntArray>): Array<IntArray> {
    val c = matrix.size
    val d = matrix[0].size

    val e = Array(d) { IntArray(c) }

    for (i in 0 until c) {
        for (j in 0 until d) {
            e[j][i] = matrix[i][j]
        }
    }

    return e
}

fun printMatrix(matrix: Array<IntArray>) {
    for (row in matrix) {
        println(row.joinToString(", "))
    }
}