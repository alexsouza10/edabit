// Multiple of 100

// Create a function that takes an integer and returns true if it's divisible by 100, otherwise return false.

// Examples

// divisible(1) ➞ false

// divisible(1000) ➞ true

// divisible(100) ➞ true

public class MutipleOf100 {
    public static void main(String[] args) {
        divisible(1); //Output: false
        divisible(1000); //Output: true
        divisible(100); //Output: true
    }

    static boolean divisible(int x) {
        boolean div = (x / 100) >= 1 ? true : false;
        System.out.println(div);
        return div;
    }
}