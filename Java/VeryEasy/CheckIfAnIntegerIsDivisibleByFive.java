// Check if an Integer is Divisible By Five

// Create a function that returns true if an integer is evenly divisible by 5, and false otherwise.

// Examples:

// divisibleByFive(-55) ➞ true


public class CheckIfAnIntegerIsDivisibleByFive {
    public static void main(String[] args) {
        boolean divisibleByFive = div(5);
        System.out.println(divisibleByFive); // Output: true
    }

    static boolean div(int num1) {
        int checkDiv = num1 % 5;
        boolean check = (checkDiv == 5) || (checkDiv == 0) ? true : false;
        return check;
    }
}
