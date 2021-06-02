/*
    Objective
    Today, we're working with regular expressions.

    Task
    Consider a database table, Emails, which has the attributes First Name and Email ID. Given N rows of data simulating
    the Emails table, print an alphabetically-ordered list of people whose email address ends in @gmail.com.

    Input Format

    The first line contains an integer, N, total number of rows in the table.
    Each of the N subsequent lines contains 2 space-separated strings denoting a person's first name and email ID, respectively.

    Constraints
    2 <= N <= 30
    Each of the first names consists of lower case letters [a - z] only.
    Each of the email IDs consists of lower case letters [a - z], @ and . only.
    The length of the first name is no longer than 20.
    The length of the email ID is no longer than 50.
    Output Format

    Print an alphabetically-ordered list of first names for every user with a gmail account. Each name must be printed on a new line.

    Sample Input

    6
    riya riya@gmail.com
    julia julia@julia.me
    julia sjulia@gmail.com
    julia julia@gmail.com
    samantha samantha@gmail.com
    tanya tanya@gmail.com

    Sample Output

    julia
    julia
    riya
    samantha
    tanya
*/
package nam.tran.day28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> result = new ArrayList<>();

        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0];

                String emailID = firstMultipleInput[1];

                String myRegExString = "@gmail.com";
                Pattern p = Pattern.compile(myRegExString);
                Matcher m = p.matcher(emailID);
                if( m.find() ) {
                    // Print the match
                    result.add(firstName);
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        result.stream().sorted().forEach(System.out::println);
        bufferedReader.close();
    }
}
