/*

Equality of 3 Values

Create a function that takes three integer arguments (a, b, c) and returns the amount of integers which are of equal value.

Examples:

equal(3, 4, 3) ➞ 2

equal(1, 1, 1) ➞ 3

equal(3, 4, 1) ➞ 0

Your function must return 0, 2 or 3.

 */

package Easy;

public class EqualityOf3Values {
    public static void main(String[] args) {
        equal(3, 4, 3); // Output: 2
        equal(1, 1, 1); // Output: 3
        equal(3, 4, 1); // Output: 0
    }

    static int equal(int a, int b, int c) {
        if (a == b && a == c) {
            System.out.println(3);
            return 3;
        } else if (a == b || a == c) {
            System.out.println(2);
            return 2;
        } else {
            System.out.println(0);
            return 0;
        }
    }
}
