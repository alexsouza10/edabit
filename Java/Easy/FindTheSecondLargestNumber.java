/*

Find The Second Largest Number

Write a function that takes an array of numbers and returns the second largest number.

Examples: 
secondLargest([10, 40, 30, 20, 50]) ➞ 40

secondLargest([25, 143, 89, 13, 105]) ➞ 105

secondLargest([54, 23, 11, 17, 10]) ➞ 23

*/

package Easy;

import java.util.Arrays;

public class FindTheSecondLargestNumber {
    public static void main(String[] args) {
        int[] secondLargest1 = { 10, 40, 30, 20, 50 };
        int[] secondLargest2 = { 25, 143, 89, 13, 105 };
        int[] secondLargest3 = { 54, 23, 11, 17, 10 };

        System.out.println(secondLargest(secondLargest1)); // Output: 40
        System.out.println(secondLargest(secondLargest2)); // Output: 105
        System.out.println(secondLargest(secondLargest3)); // Output: 23
    }

    static int secondLargest(int[] num) {
        Arrays.sort(num);
        return num[num.length - 2];
    }
}
