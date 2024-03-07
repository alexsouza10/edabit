// How Much is True?

// Create a function which returns the number of true values there are in an array.

// Examples

// countTrue([true, false, false, true, false]) ➞ 2

// countTrue([false, false, false, false]) ➞ 0

// countTrue([]) ➞ 0

// Return 0 if given an empty array.
// All array items are of the type bool (true or false).

package Easy;

public class HowMuchIsTrue {
    public static void main(String[] args) {

        boolean[] arr = { true, false, false, true, false }; // Output: 2
        boolean[] arr2 = { false, false, false, false }; // Output: 0
        boolean[] arr3 = {}; // Output: 0

        countTrue(arr);
        countTrue(arr2);
        countTrue(arr3);
    }

    static int countTrue(boolean[] arr) {
        int contador = 0;
        for (boolean valor : arr) {
            if (valor) {
                contador++;
            }
        }
        System.out.println(contador);
        return contador;
    }

}
