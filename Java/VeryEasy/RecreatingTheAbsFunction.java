// Recreating the abs() Function

// The Math.abs() function returns the absolute value of a number. This means that it returns a number's positive value. You can think of it as the distance away from zero.

// Create a function that recreates this functionality.

// Examples

// absolute(-1.217197940) ➞ 1.21719794

// absolute(-12.1320) ➞ 12.132
 
// absolute(-544.0) ➞ 544.0

// absolute(4666) ➞ 4666.0

// absolute(-3.14) ➞ 3.14

// absolute(250) ➞ 250


import java.lang.Math;

public class RecreatingTheAbsFunction {
    public static void main(String[] args) {
        absolute(-1.217197940); // Output: 1.21719794
        absolute(-12.1320); // Output: 12.132
        absolute(-544.0); // Output: 544.0
        absolute(4666); // Output: 4666.0
        absolute(-3.14); // Output: 3.14
        absolute(250); // Output: 250
    }

    static double absolute(double numAbsolute) {
        double convertNum = Math.abs(numAbsolute);
        System.out.println(convertNum);
        return convertNum;
    }
}
