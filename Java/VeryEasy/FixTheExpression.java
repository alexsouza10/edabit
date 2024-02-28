/*
 * Fix the Expression
 * 
 * Fix the code in the Code tab so the function returns true if and only if x is equal to 7.
 *
 * Examples:
 * 
 * Challenge.isSeven(7) ➞ true
 */


public class FixTheExpression {
    public static void main(String[] args) {
        boolean challengeIsSeven = equalseven(7);
        System.out.println(challengeIsSeven); //Output: true
    }

    static boolean equalseven(int num) {
        boolean isEqual = (num == 7) ? true : false;
        return isEqual;
    }
}
