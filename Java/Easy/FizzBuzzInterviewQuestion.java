/*

FizzBuzz Interview Question

Create a function that takes a number as an argument and returns "Fizz", "Buzz" or "FizzBuzz".

If the number is a multiple of 3 the output should be "Fizz".
If the number given is a multiple of 5, the output should be "Buzz".
If the number given is a multiple of both 3 and 5, the output should be "FizzBuzz".
If the number is not a multiple of either 3 or 5, the number should be output on its own as shown in the examples below.
The output should always be a string even if it is not a multiple of 3 or 5.

Examples:

fizzBuzz(3) ➞ "Fizz"

fizzBuzz(5) ➞ "Buzz"

fizzBuzz(15) ➞ "FizzBuzz"

fizzBuzz(4) ➞ "4"

Try to be precise with how you spell things and where you put the capital letters.
If you get stuck on a challenge, find help in the Resources tab.
If you're really stuck, unlock solutions in the Solutions tab.

 */

package Easy;

public class FizzBuzzInterviewQuestion {
    public static void main(String[] args) {
        fizzBuzz(3); // Output: Fizz
        fizzBuzz(5); // Output: Buzz
        fizzBuzz(15); // Output: FizzBuzz
        fizzBuzz(4); // Output: 4
    }

    static String fizzBuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("FizzBuzz");
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            System.out.println("Fizz");
            return "Fizz";
        } else if (n % 5 == 0) {
            System.out.println("Buzz");
            return "Buzz";
        } else {
            System.out.println(n);
            return String.valueOf(n);
        }
    }
}
