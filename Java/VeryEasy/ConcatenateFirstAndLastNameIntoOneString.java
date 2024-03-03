// Concatenate First and Last Name into One String

// Given two strings, firstName and lastName, return a single string in the format "last, first".

// Examples:

// concatName("First", "Last") ➞ "Last, First"

// concatName("John", "Doe") ➞ "Doe, John"

// concatName("Mary", "Jane") ➞ "Jane, Mary"

public class ConcatenateFirstAndLastNameIntoOneString {
    public static void main(String[] args) {
        concatName("First", "Last"); // Output: Last, First
        concatName("John", "Doe"); // Output: Doe, John
        concatName("Mary", "Jane"); // Output: Jane, Mary
    }

    static void concatName(String firstName, String lastName) {
        System.out.println(lastName + ", " + firstName);
    }
}
