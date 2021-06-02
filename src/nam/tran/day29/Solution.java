/*
    Objective
    Welcome to the last day! Today, we're discussing bitwise operations.

    Task
    Given set S = {1,2,3,...,N}. Find two integers, A and B (where A < B), from set S such that the value of A&B is the
    maximum possible and also less than a given integer, K. In this case, & represents the bitwise AND operator.

    Function Description
    Complete the bitwiseAnd function in the editor below.

    bitwiseAnd has the following paramter(s):
    - int N: the maximum integer to consider
    - int K: the limit of the result, inclusive

    Returns
    - int: the maximum value of A&B within the limit.

    Input Format

    The first line contains an integer, T, the number of test cases.
    Each of the T subsequent lines defines a test case as 2 space-separated integers, N and K, respectively.

    Constraints
    1 <= T <= 10^3
    2 <= N <= 10^3
    2 <= K <= N

    Sample Input

    STDIN   Function
    -----   --------
    3       T = 3
    5 2     N = 5, K = 2
    8 5     N = 8, K = 5
    2 2     N = 8, K = 5
    Sample Output

    1
    4
    0

    Explanation
    N = 5, K = 2, S = {1,2,3,4,5}

    All possible values of A and B are:
    1. A = 1, B = 2; A & B = 0
    1. A = 1, B = 3; A & B = 1
    1. A = 1, B = 4; A & B = 0
    1. A = 1, B = 5; A & B = 1
    1. A = 2, B = 3; A & B = 2
    1. A = 2, B = 4; A & B = 0
    1. A = 2, B = 5; A & B = 0
    1. A = 3, B = 4; A & B = 0
    1. A = 3, B = 5; A & B = 1
    1. A = 4, B = 5; A & B = 4

    The maximum possible value of A&B that is also < (K=2) is 1, so we print 1 on a new line.
*/
package nam.tran.day29;

import java.io.*;
import java.util.stream.IntStream;

class Result {

    /*
     * Complete the 'bitwiseAnd' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER N
     *  2. INTEGER K
     */

    public static int bitwiseAnd(int N, int K) {
        // Write your code here
        int finalResult = 0;
        for (int i = 1; i < N; i++){
            for(int j = i+1; j <= N ; j++){
                int amp = i&j;
                if(amp < K && amp > finalResult)
                    finalResult = amp;
            }
        }
        return finalResult;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("E:\\Github\\Hackerrank30Day\\src\\nam\\tran\\test.txt"));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int count = Integer.parseInt(firstMultipleInput[0]);

                int lim = Integer.parseInt(firstMultipleInput[1]);

                int res = Result.bitwiseAnd(count, lim);

                bufferedWriter.write(String.valueOf(res));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
