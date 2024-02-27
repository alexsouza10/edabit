/*
Write a function that takes an integer minutes and converts it to seconds.

Examples

convert(5) ➞ 300
 */

public class ConvertMinutesIntoSeconds {
    public static void main(String[] args) {
        int num = 5;
        int minOfConvesion = 60;
        int convert = num*minOfConvesion;
        System.out.println(convert); // Output: 300
    }
}
