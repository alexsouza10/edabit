// Integer in Range?

// Write a function that validates whether a number n is within the lower and upper bounds. Return true if so, false otherwise.

// Examples:

// intWithinBounds(3, 1, 9) ➞ true

// intWithinBounds(6, 1, 6) ➞ false

// intWithinBounds(3, 3, 8) ➞ true

// The term "within bounds" means, that, a number is considered greater than or equal to the lower bound but lesser than the upper bound, (see example #2).
// Bounds will always be given as integers.


public class IntegerInRange {
    public static void main(String[] args) {
        intWithinBounds(3, 1, 9); //Output: true
        intWithinBounds(6, 1, 6); //Output: false
        intWithinBounds(3, 3, 8); //Output: true
    }
    static boolean intWithinBounds(int num, int lower, int upper){
        boolean validation = (num >= lower) && (num < upper);
        System.out.println(validation);
        return validation;
    }
}
