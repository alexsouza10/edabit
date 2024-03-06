// Nth Even Number

// Create a function that takes a number n and returns the nth even number beginning with 0 as the first.

// Examples

// even(1) ➞ 0

// even(2) ➞ 2

// even(100) ➞ 198

public class NthEvenNumber {
    public static void main(String[] args) {
        even(1); // Output: 0
        even(2); // Output: 2
        even(100); // Output: 198 
    }

    static int even(int num) {
        System.out.println((num * 2) - 2);
        return num;
    }
}
