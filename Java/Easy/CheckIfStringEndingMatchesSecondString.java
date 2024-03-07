/*
Check if String Ending Matches Second String

Create a function that takes two strings and returns true if the first string ends with the second string; otherwise return false.

Examples

checkEnding("abc", "bc") ➞ true

checkEnding("abc", "d") ➞ false

checkEnding("samurai", "zi") ➞ false

checkEnding("feminine", "nine") ➞ true

checkEnding("convention", "tio") ➞ false
*/

package Easy;

public class CheckIfStringEndingMatchesSecondString {
    public static void main(String[] args) {
        checkEnding("abc", "bc"); // Output: true
        checkEnding("abc", "d"); // Output: false
        checkEnding("samurai", "zi"); // Output: false
        checkEnding("feminine", "nine"); // Output: true
        checkEnding("convention", "tio"); // Output: false
    }

    static boolean checkEnding(String a, String b) {
        System.out.println(a.endsWith(b));
        return a.endsWith(b);

    }
}