// Is the String Empty?

// Create a function that returns true if a string is empty and false otherwise.

// Examples:

// isEmpty("") ➞ true

// isEmpty(" ") ➞ false

// isEmpty("a") ➞ false

// A string containing only whitespaces " " does not count as empty.

// Don't forget to return the result.

public class IsTheStringEmpty {
    public static void main(String[] args) {
        isEmpy(""); //Output: true
        isEmpy(" "); //Output: false
        isEmpy("a"); //Output: false
    }

    static boolean isEmpy(String addString){
        boolean inputString = (addString) == "" ? true : false;
        System.out.println(inputString);
        return inputString;
    }
}
