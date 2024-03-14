/*

Sort Numbers in Ascending Order

Create a method that takes an array of integers and returns a new array, sorted in ascending order (smallest to biggest).

Sort integer array in ascending order.
If the function's argument is null, an empty array, or undefined; return an empty array.
Return a new array of sorted numbers.

Examples:

sortNumsAscending([1, 2, 10, 50, 5]) ➞ [1, 2, 5, 10, 50]

sortNumsAscending([80, 29, 4, -95, -24, 85]) ➞ [-95, -24, 4, 29, 80, 85]

sortNumsAscending(null) ➞ []

sortNumsAscending([]) ➞ []

Test input can be positive or negative.

 */

package Easy;

import java.util.Arrays;

public class SortNumbersInAscendingOrder {
    public static void main(String[] args) {
        int[] sortNumsAscending1 = { 1, 2, 10, 50, 5 }; // Output: [1, 2, 5, 10, 50]
        int[] sortNumsAscending2 = { 80, 29, 4, -95, -24, 85 }; // Output: [-95, -24, 4, 29, 80, 85]
        int[] sortNumsAscending3 = null; // Output: []
        int[] sortNumsAscending4 = {}; // Output: []

        System.out.println(Arrays.toString(sortNumsAscending(sortNumsAscending1)));
        System.out.println(Arrays.toString(sortNumsAscending(sortNumsAscending2)));
        System.out.println(Arrays.toString(sortNumsAscending(sortNumsAscending3)));
        System.out.println(Arrays.toString(sortNumsAscending(sortNumsAscending4)));

    }

    static int[] sortNumsAscending(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        Arrays.sort(nums);
        return nums;
    }
}
