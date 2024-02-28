// Convert Hours and Minutes into Seconds

// Write a function that takes two integers (hours, minutes), converts them to seconds, and adds them.

// Examples:

// convert(1, 3) ➞ 3780

public class ConvertHoursAndMinutesIntoSeconds {
    public static void main(String[] args) {
        int convert = numsConvert(1, 3);
        System.out.println(convert); // Output: 3780
    }

    static int numsConvert(int hours, int min) {
        int hoursInSeconds = (60 * 60) * hours;
        int minInSeconds = 60 * min;
        int addNums = hoursInSeconds + minInSeconds;
        return addNums;
    }
}
