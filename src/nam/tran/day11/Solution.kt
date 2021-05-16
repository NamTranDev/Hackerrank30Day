/*
    Objective
    Today, we are building on our knowledge of arrays by adding another dimension. Check out the Tutorial tab for learning
    materials and an instructional video.

    Context
    Given a 6x6 2D Array, A:

    1 1 1 0 0 0
    0 1 0 0 0 0
    1 1 1 0 0 0
    0 0 0 0 0 0
    0 0 0 0 0 0
    0 0 0 0 0 0
    We define an hourglass in A to be a subset of values with indices falling in this pattern in A's graphical representation:

    a b c
      d
    e f g
    There are 16 hourglasses in A, and an hourglass sum is the sum of an hourglass' values.

    Task
    Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.

    Example

    In the array shown above, the maximum hourglass sum is 7 for the hourglass in the top left corner.

    Input Format

    There are  lines of input, where each line contains 6 space-separated integers that describe the 2D Array A.

    Constraints
    -9 <= A[i][j] <= 9
    0 <= i,j <= 5

    Output Format

    Print the maximum hourglass sum in A.

    Sample Input

    1 1 1 0 0 0
    0 1 0 0 0 0
    1 1 1 0 0 0
    0 0 2 4 4 0
    0 0 0 2 0 0
    0 0 1 2 4 0
    Sample Output

    19
    Explanation

    A contains the following hourglasses:

    1 1 1   1 1 0   1 0 0   0 0 0
      1       0       0       0
    1 1 1   1 1 0   1 0 0   0 0 0

    0 1 0   1 0 0   0 0 0   0 0 0
      1       1       0       0
    0 0 2   0 2 4   2 4 4   4 4 0

    1 1 1   1 1 0   1 0 0   0 0 0
      0       2       4       4
    0 0 0   0 0 2   0 2 0   2 0 0

    0 0 2   0 2 4   2 4 4   4 4 0
      0       0       2       0
    0 0 1   0 1 2   1 2 4   2 4 0
    The hourglass with the maximum sum (19) is:

    2 4 4
      2
    1 2 4
*/

package nam.tran.day11

fun main() {
    val arr = Array(6) { Array(6) { 0 } }

    for (i in 0 until 6) {
        arr[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    }

    var result: Int? = null
    var startColumn = 0
    var endColumn = 3
    while (true) {
        val centerColumn = startColumn + 1
        var startRow = 0
        var endRow = 3
        while (true) {
            val centerRow = startRow + 1
            var total = 0
            for (i in startColumn until endColumn) {
                // print the row of space-separated values
                for (j in startRow until endRow) {
//                    print(arr[i][j].toString() + " ")
                    if (centerColumn == i && centerRow != j)
                        continue
                    total += arr[i][j]
                }
                // end of row is reached, print newline
//                println()
            }
            startRow++
            endRow++
//            println(total)
            if (result == null || result < total)
                result = total
            if (endRow > arr.size)
                break
        }
        startColumn++
        endColumn++

//        println()
        if (endColumn > arr.size)
            break
    }
    println(result)
}

fun printArr2D(arr: Array<Array<Int>>) {
    var count = 0
    var startColumn = 0
    var endColumn = 3
    while (true) {
        var startRow = 0
        var endRow = 3
        while (true) {
            for (i in 0 until 3) {
                // print the row of space-separated values
                for (j in startRow until endRow) {
                    print(arr[i][j].toString() + " ")
                }
                // end of row is reached, print newline
                println()
            }
            startRow++
            endRow++
            println()
            count++
            if (endRow > arr.size)
                break
        }
        startColumn++
        endColumn++

        println()
        if (endColumn > arr.size)
            break
    }
    println(count)
}