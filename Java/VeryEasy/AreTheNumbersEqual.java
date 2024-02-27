/*
Create a function that returns true when x is equal to y; otherwise return false.

Examples

isSameNum(4, 8) ➞ false
 */

public class AreTheNumbersEqual {
    public static void main(String[] args) {
        boolean isSameNum;
        int num1 = 4;
        int num2 = 8;
        isSameNum = (num1 == num2) ? true : false ;
        System.out.println(isSameNum);
    }
}
