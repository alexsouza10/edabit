/*

Check if One Array can be Nested in Another

Create a function that returns true if the first array can be nested inside the second and false otherwise.

arr1 can be nested inside arr2 if:

arr1's min is greater than arr2's min.
arr1's max is less than arr2's max.

Examples:

canNest([1, 2, 3, 4], [0, 6]) ➞ true

canNest([3, 1], [4, 0]) ➞ true

canNest([9, 9, 8], [8, 9]) ➞ false

canNest([1, 2, 3, 4], [2, 3]) ➞ false

Note the strict inequality (see example #3).

 */

package Easy;

public class CheckIfOneArrayCanBeNestedInAnother {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 0, 6 };
        System.out.println(canNest(arr1, arr2)); // Output: true

        arr1 = new int[] { 3, 1 };
        arr2 = new int[] { 4, 0 };
        System.out.println(canNest(arr1, arr2)); // Output: true

        arr1 = new int[] { 9, 9, 8 };
        arr2 = new int[] { 8, 9 };
        System.out.println(canNest(arr1, arr2)); // Output: false

        arr1 = new int[] { 1, 2, 3, 4 };
        arr2 = new int[] { 2, 3 };
        System.out.println(canNest(arr1, arr2)); // Output: false
    }

    public static boolean canNest(int[] arr1, int[] arr2) {
        int[] minMaxArr1 = findMinMax(arr1);
        int[] minMaxArr2 = findMinMax(arr2);

        return minMaxArr1[0] > minMaxArr2[0] && minMaxArr1[1] < minMaxArr2[1];
    }

    private static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return new int[] { min, max };
    }
}
