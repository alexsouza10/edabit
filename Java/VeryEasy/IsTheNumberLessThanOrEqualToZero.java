/*
Is the Number Less than or Equal to Zero?

Create a method that takes an integer as its only argument and returns true if it's less than or equal to zero, otherwise return false.

Examples:

lessThanOrEqualToZero(5) ➞ false

 */

public class IsTheNumberLessThanOrEqualToZero {
    public static void main(String[] args) {
        boolean lessThanOrEqualToZero = comparation(5);
        System.out.println(lessThanOrEqualToZero);
    }
    static boolean comparation(int x){
        boolean equalZero = (x == 0) ? true : false;
        return equalZero;
    }

}
