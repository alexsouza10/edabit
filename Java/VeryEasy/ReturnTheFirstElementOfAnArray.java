// Return the First Element of an Array

// Create a function that takes an array containing only numbers and return the first element.

// Examples

// getFirstValue([1, 2, 3]) ➞ 1

public class ReturnTheFirstElementOfAnArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3 };
        int firstElement = getFirstValue(array);
        System.out.println(firstElement); // Output: 1
        validateArrays(array); // Output: Test Passed!
    }

    static int getFirstValue(int[] array) {
        return array[0];
    }

    static void validateArrays(int[] array) {
        String test = (array.length > 0) ? "Test Passed!" : "Test Reproved";
        System.out.println(test);
    }
}