/*

Many Operators!

Some basic arithmetic operators are +, -, *, /, and %. In this challenge you will be given three parameters, num1, num2, and an operator. Use the operator on parameters num1 and num2.

Examples

operate(1, 2, "+") ➞ 3
// 1 + 2 = 3

operate(7, 10, "-") ➞ -3
// 7 - 10 = -3

operate(20, 10, "%") ➞ 0
// 20 % 10 = 0

There will be no division by zero.

 */

package Easy;

public class ManyOperators {
    public static void main(String[] args) {
        operate(1, 2, "+"); // Output: 3
        operate(7, 10, "-"); // Output: -3
        operate(20, 10, "%"); // Output: 0
    }

    static void operate(int num1, int num2, String operator) {
        if (operator == "+") {
            System.out.println(num1 + num2);
        } else if (operator == "-") {
            System.out.println(num1 - num2);
        } else if (operator == "*") {
            System.out.println(num1 * num2);
        } else if (operator == "%") {
            System.out.println(num1 % num2);
        } else if (operator == "/" && num2 != 0) {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Condition not accepted");
        }
    }
}
