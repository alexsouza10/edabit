/*

Phone Number Formatting

Create a method that takes an array of 10 integers (between 0 and 9) and returns a string of those numbers formatted as a phone number (e.g. (555) 555-5555).

Examples: 

formatPhoneNumber([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]) ➞ "(123) 456-7890"

formatPhoneNumber([5, 1, 9, 5, 5, 5, 4, 4, 6, 8]) ➞ "(519) 555-4468"

formatPhoneNumber([3, 4, 5, 5, 0, 1, 2, 5, 2, 7]) ➞ "(345) 501-2527"

 */

package Easy;

public class PhoneNumberFormatting {
    public static void main(String[] args) {
        int[] phoneNumber1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        int[] phoneNumber2 = { 5, 1, 9, 5, 5, 5, 4, 4, 6, 8 };
        int[] phoneNumber3 = { 3, 4, 5, 5, 0, 1, 2, 5, 2, 7 };

        System.out.println(formatPhoneNumber(phoneNumber1));
        System.out.println(formatPhoneNumber(phoneNumber2));
        System.out.println(formatPhoneNumber(phoneNumber3));
    }

    static String formatPhoneNumber(int[] nums) {
        StringBuilder formattedNumber = new StringBuilder("(");

        for (int i = 0; i < 3; i++) {
            formattedNumber.append(nums[i]);
        }

        formattedNumber.append(") ");

        for (int i = 3; i < 6; i++) {
            formattedNumber.append(nums[i]);
        }

        formattedNumber.append("-");

        for (int i = 6; i < 10; i++) {
            formattedNumber.append(nums[i]);
        }

        return formattedNumber.toString();
    }
}
