/*
Are the Numbers Equal2?

Create a function that takes two integers and checks if they are equal.

Examples:

isEqual(5, 6) ➞ false

 */

public class AreTheNumbersEqual2 {
    public static void main(String[] args) {
        boolean isEqual = conparation(5, 6);
        System.out.println(isEqual);
    }

    static boolean conparation(int x, int y) {
        boolean isComparation = (x == y) ? true : false;
        return isComparation;
    }
}
