/*

Basic Calculator

Create a function that takes two numbers and a mathematical operator + - / * and will perform a calculation with the given numbers.

Examples: 

calculator(2, '+', 2) ➞ 4

calculator(2, '*', 2) ➞ 4

calculator(4, '/', 2) ➞ 2

If the input tries to divide by 0, return 0.

 */

package Easy;

public class BasicCalculator {
    public static void main(String[] args) {
        calculator(2, "+", 2); // Output: 4
        calculator(2, "*", 2); // Output: 4
        calculator(4, "/", 2); // Output: 2
    }

    static int calculator(int num1, String operator, int num2) {
        switch (operator) {
            case "+":
                System.out.println(num1 + num2);
                return num1 + num2;
            case "-":
                System.out.println(num1 - num2);
                return num1 - num2;
            case "*":
                System.out.println(num1 * num2);
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    System.out.println(num1 / num2);
                    return num1 / num2;
                } else {
                    System.out.println(0);
                    return 0;
                }
            default:
                System.out.println("Invalid operator");
                return 0;
        }
    }
}