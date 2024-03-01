// Using the "&&" Operator
// Java has a logical operator &&. The && operator takes two boolean values, and returns true if both values are true.

// Consider a && b:

// a is checked if it is true or false.
// If a is false, false is returned.  SE A == FALSE -> RETURN FALSE
// b is checked if it is true or false.
// If b is false, false is returned.  SE B == FALSE  -> FALSE
// Otherwise, true is returned (as both a and b are therefore true ).
// The && operator will only return true for true && true.  SE A e B == TRUE -> TRUE

// Make a function using the && operator.

// Examples
// and(true, false) ➞ false

// and(true, true) ➞ true

// and(false, true) ➞ false

// and(false, false) ➞ false

public class UsingTheOperator {
    public static void main(String[] args) {
        System.out.println(and(true, false)); // Output: false
        System.out.println(and(true, true)); // Output: true
        System.out.println(and(false, true)); // Output: false 
        System.out.println(and(false, false)); // Output: false   
    }

    static boolean and(boolean a, boolean b) {
        if (a && b == true) {
            return true;
        } else {
            return false;
        }
    }
}
