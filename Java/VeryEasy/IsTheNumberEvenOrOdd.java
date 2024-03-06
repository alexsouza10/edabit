// Is the Number Even or Odd?

// Create a method that takes an integer as an argument and returns"even" for even integers and "odd" for odd integers.

// Examples

// isEvenOrOdd(3) ➞ "odd"

// isEvenOrOdd(146) ➞ "even"

// isEvenOrOdd(19) ➞ "odd"

// Dont forget to return the result.
// Input will always be a valid integer.
// Expect negative integers (whole numbers).
// Tests are case sensitive (return "even" or "odd" in lowercase).

public class IsTheNumberEvenOrOdd {
    public static void main(String[] args) {
        isEvenOrOdd(3); // Output: odd
        isEvenOrOdd(146);  // Output: even
        isEvenOrOdd(19); // Output: odd
    }

    static boolean isEvenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("even");
            return true;
        } else {
            System.out.println("odd");
            return false;
        }
    }
}