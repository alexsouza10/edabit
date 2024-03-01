// Flip the int Boolean

// Make a function that returns an int boolean opposite of an int boolean given (flip the int boolean).

// Examples:

// flipIntBool(1) ➞ 0

// flipIntBool(0) ➞ 1

public class FlipTheIntBoolean {
    public static void main(String[] args) {
        flipIntBool(0); 
        flipIntBool(1); 

        System.out.println(flipIntBool(0)); // Output: 1
        System.out.println(flipIntBool(1)); // Output: 0

        testCases();
    }

    static int flipIntBool(int x) {
        int intBool = (x == 0) ? 1 : 0;
        return intBool;
    }

    static void testCases() {
        String test = (flipIntBool(0) == 1 && flipIntBool(1) == 0) ? "All tests passed" : "Not all tests passed";
        System.out.println(test);
    }
}
