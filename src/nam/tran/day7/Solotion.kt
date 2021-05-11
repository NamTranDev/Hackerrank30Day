/*
    Objective
    Today, we will learn about the Array data structure

    Task
    Given an array, A, of N integers, print A's elements in reverse order as a single line of space-separated numbers.

    Example
    A = [1,2,3,4]

    Print 4 3 2 1. Each integer is separated by one space.

    Input Format

    The first line contains an integer, N (the size of our array).
    The second line contains N space-separated integers that describe array A's elements.

    Constraints

    Constraints

    1 <= N <= 1000
    1 <= A[i] <= 1000, where A[i] is the i position integer in the array.

    Output Format

    Print the elements of array A in reverse order as a single line of space-separated numbers.

    Sample Input

    4
    1 4 3 2

    Sample Output

    2 3 4 1
*/

package nam.tran.day7

fun main() {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    arr.reverse()

    val length = arr.size
    for (i in 0 until n) {
        if (i < length)
            print("${arr[i]} ")
        else
            break
    }
}