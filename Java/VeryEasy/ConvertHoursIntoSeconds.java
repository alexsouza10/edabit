/*
Convert Hours into Seconds

Write a function that converts hours into seconds.

Examples:

howManySeconds(2) ➞ 7200
 */

public class ConvertHoursIntoSeconds {
    public static void main(String[] args) {
        int howManySeconds = convertTotal(2);
        System.out.println(howManySeconds);//Output: 7200
    }

    static int convertTotal(int hour) {
        int convertHours = hour * 60 * 60;
        return convertHours;
    }
}
