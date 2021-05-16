/*
    Objective
    Today, we're working with binary numbers.

    Task
    Given a base-10 integer, n, convert it to binary (base-2). Then find and print the base-10 integer denoting the maximum
    number of consecutive 1's in n's binary representation. When working with different bases, it is common to show the base as a subscript.

    Example
    n = 125

    The binary representation of 125 base-10 is 1111101 base-2. In base 10, there are 5 and 1 consecutive ones in two groups. Print the maximum, 5.

    Input Format

    A single integer, n.

    Constraints
    1 <= n <= 10^6

    Output Format

    Print a single base-10 integer that denotes the maximum number of consecutive 1's in the binary representation of n.

    Sample Input 1

    5
    Sample Output 1

    1
    Sample Input 2

    13
    Sample Output 2

    2
    Explanation

    Sample Case 1:
    The binary representation of 5 base-10 is 101 base-2, so the maximum number of consecutive 1's is 1.

    Sample Case 2:
    The binary representation of 13 base-10 is 1101 base-2, so the maximum number of consecutive 1's is 2.
*/

package nam.tran.day10

fun main() {
    var n = readLine()!!.trim().toInt()
    var count = 0
    var tempt = 0
    while (true) {
        if (n % 2 != 0){
            tempt++
        }else{
            if (count < tempt)
                count = tempt
            tempt = 0
        }
        if (n < 2){
            if (count < tempt)
                count = tempt
            break
        }
        n /= 2
    }
    println(count)
}