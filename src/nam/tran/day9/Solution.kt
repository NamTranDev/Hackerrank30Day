/*
    Objective
    Today, we are learning about an algorithmic concept called recursion.

    Recursive Method for Calculating Factorial
                          1
        factorial(N) = {                        N <= 1 otherwise
                          N x factorial(N - 1)
    Function Description
    Complete the factorial function in the editor below. Be sure to use recursion.

    factorial has the following paramter:

    int n: an integer
    Returns

    int: the factorial of n
    Note: If you fail to use recursion or fail to name your recursive function factorial or Factorial, you will get a score of .

    Input Format

    A single integer, n (the argument to pass to factorial).

    Constraints
    2 <= n <= 12

    Your submission must contain a recursive function named factorial.
    Sample Input

    3
    Sample Output

    6
    Explanation

    Consider the following steps. After the recursive calls from step 1 to 3, results are accumulated from step 3 to 1.
    1. factorial(3) = 3 x factorial(2) = 3 x 2 = 6
    1. factorial(2) = 2 x factorial(1) = 2 x 1 = 2
    1. factorial(1) = 1
*/

package nam.tran.day9

/*
 * Complete the 'factorial' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER n as parameter.
 */

fun factorial(n: Int): Int {
    // Write your code here
    return if (n == 1){
        1
    }else{
        n * factorial(n - 1)
    }
}

fun main() {
    val n = readLine()!!.trim().toInt()

    val result = factorial(n)

    println(result)
}