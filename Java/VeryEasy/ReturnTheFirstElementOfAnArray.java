// Return the First Element of an Array

// Create a function that takes an array containing only numbers and return the first element.

// Examples

// getFirstValue([1, 2, 3]) ➞ 1

// getFirstValue([80, 5, 100]) ➞ 80

// getFirstValue([-500, 0, 50]) ➞ -500

public class ReturnTheFirstElementOfAnArray {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3 };
        int[] array2 = { 80, 5, 100 };
        int[] array3 = { -500, 0, 50 };

        testCase(array1, 1);
        testCase(array2, 80);
        testCase(array3, -500);
    }

    static int getFirstValue(int[] array) {
        return array[0];
    }

    static void testCase(int[] array, int expected) {
        int result = getFirstValue(array);
        if (result == expected) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!" + java.util.Arrays.toString(array) + ". Expected: " + expected
                 + ", Not: " + result);
        }
    }
}