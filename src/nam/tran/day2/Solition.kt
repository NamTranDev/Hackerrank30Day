/*
    Objective
In this challenge, you will work with arithmetic operators. Check out the Tutorial tab for learning materials and an instructional video.

Task
Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost. Round the result to the nearest integer.

Example:
MealCost : 100
TipPercent : 15
TaxPercent : 8
A tip of 15% * 100 = 15, and the taxes are 8% * 100 = 8. Print the value 123 and return from the function.
Function Description
Complete the solve function in the editor below.

solve has the following parameters:

int meal_cost: the cost of food before tip and tax
int tip_percent: the tip percentage
int tax_percent: the tax percentage
Returns The function returns nothing. Print the calculated value, rounded to the nearest integer.

Note: Be sure to use precise values for your calculations, or you may end up with an incorrectly rounded result.

Input Format

There are 3 lines of numeric input:
The first line has a double, meal cost (the cost of the meal before tax and tip).
The second line has an integer, tip cost (the percentage of meal cost being added as tip).
The third line has an integer, tax cost (the percentage of meal cost being added as tax).

Sample Input
12.00
20
8

Sample Output :
15

*/

package nam.tran.day2

import kotlin.math.roundToInt

/*
 * Complete the 'solve' function below.
 *
 * The function accepts following parameters:
 *  1. DOUBLE meal_cost
 *  2. INTEGER tip_percent
 *  3. INTEGER tax_percent
 */

fun solve(meal_cost: Double, tip_percent: Int, tax_percent: Int) {
    // Write your code here
    val tip = (tip_percent * meal_cost) / 100
    val tax = (tax_percent * meal_cost) / 100
    val total = meal_cost + tip + tax
    println(total.roundToInt())
}

fun main() {
    val meal_cost = readLine()!!.trim().toDouble()

    val tip_percent = readLine()!!.trim().toInt()

    val tax_percent = readLine()!!.trim().toInt()

    solve(meal_cost, tip_percent, tax_percent)
}
