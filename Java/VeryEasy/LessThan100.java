/*
 * Less Than 100?
 * 
 * Given two numbers, return true if the sum of both numbers is less than 100. Otherwise return false.
 * 
 * Examples:
 * 
 * lessThan100(22, 15) ➞ true
 */


public class LessThan100 {
    public static void main(String[] args) {
        boolean lessThan100 = comparation(22, 15);
        System.out.println(lessThan100);
    }

    static boolean comparation(int num1, int num2) {
        boolean logicComparation = (num1 + num2 >= 100) ? false : true;
        return logicComparation;
    }
}
