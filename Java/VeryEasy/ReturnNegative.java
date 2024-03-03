// Return Negative

// Create a function that takes a number as an argument and returns negative of that number. Return negative numbers without any change.

// Examples

// returnNegative(4) ➞ -4

// returnNegative(5) ➞ -5

// returnNegative(-54) ➞ -54

// returnNegative(0) ➞ 0

public class ReturnNegative {
    public static void main(String[] args) {
        returnNegative(4); // Output: -4
        returnNegative(5); // Output: -5
        returnNegative(-54); // Output: -54
        returnNegative(0); // Output: 0
    }

    static int returnNegative(int num) {
        if (num >= 0) {
            System.out.println(num - 2 * num);
            return num;
        } else {
            System.out.println(num);
            return (num);
        }
    }
}
