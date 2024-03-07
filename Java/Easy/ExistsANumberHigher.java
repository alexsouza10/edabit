/*

Exists a Number Higher?

Write a function that returns true if there exists at least one number that is larger than or equal to n.

Examples:

existsHigher([5, 3, 15, 22, 4], 10) ➞ true

existsHigher([1, 2, 3, 4, 5], 8) ➞ false

existsHigher([4, 3, 3, 3, 2, 2, 2], 4) ➞ true

existsHigher([], 5) ➞ false

Return false for an empty array [].

 */

package Easy;

public class ExistsANumberHigher {
    public static void main(String[] args) {
        int[] existsHigherArray = { 5, 3, 15, 22, 4 };
        int[] existsHigherArray2 = { 1, 2, 3, 4, 5 };
        int[] existsHigherArray3 = { 4, 3, 3, 3, 2, 2, 2 };
        int[] existsHigherArray4 = {};

        existsHigher(existsHigherArray, 10); // Output: true
        existsHigher(existsHigherArray2, 8); // Output: false
        existsHigher(existsHigherArray3, 4); // Output: true
        existsHigher(existsHigherArray4, 5); // Output: false

    }

    static boolean existsHigher(int[] arrNumeric, int n) {
        if (arrNumeric.length == 0) {
            System.out.println(false);
            return false;
        }

        for (int num : arrNumeric) {
            if (num >= n) {
                System.out.println(true);
                return true;
            }
        }
        System.out.println(false);
        return false;
    }
}
