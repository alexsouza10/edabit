/*
 * Convert Age to Days
 * 
 * Create a function that takes the age in years and returns the age in days.
 * 
 * Examples: 
 * 
 * calcAge(65) ➞ 23725 
 */

public class ConvertAgeToDays {
    public static void main(String[] args) {
        int calcAge = logicAge(65);
        System.out.println(calcAge); //Output: 23725
    }

    static int logicAge(int year) {
        int daysInYear = 365;
        int ageSum = daysInYear * year;
        return ageSum;
    }
}
