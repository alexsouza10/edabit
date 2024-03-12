/*

Difference of Max and Min Numbers in Array

Create a function that takes an array and returns the difference between the biggest and smallest numbers.

Examples
differenceMaxMin([10, 4, 1, 4, -10, -50, 32, 21]) ➞ 82
// Smallest number is -50, biggest is 32.

differenceMaxMin([44, 32, 86, 19]) ➞ 67
// Smallest number is 19, biggest is 86.

 */

package Easy;

public class DifferenceOfMaxAndMinNumbersInArray {
    public static void main(String[] args) {
        int[] arr1 = { 10, 4, 1, 4, -10, -50, 32, 21 };
        System.out.println("Difference: " + differenceMaxMin(arr1)); // Output: 82

        int[] arr2 = { 44, 32, 86, 19 };
        System.out.println("Difference: " + differenceMaxMin(arr2)); // Output: 67
    }

    static int differenceMaxMin(int[] arr) {

        int max = arr[0];
        int min = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }
}
