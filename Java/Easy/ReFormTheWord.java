/*

Re-Form the Word

A word has been split into a left part and a right part. Re-form the word by adding both halves together, changing the first character to an uppercase letter.

Examples:

getWord("seas", "onal") ➞ "Seasonal"

getWord("comp", "lete") ➞ "Complete"

getWord("lang", "uage") ➞ "Language"

 */

package Easy;

public class ReFormTheWord {
    public static void main(String[] args) {
        getWord("seas", "onal"); // Output: Seasonal
        getWord("comp", "lete"); // Output: Complete
        getWord("lang", "uage"); // Output: Language
    }

    static String getWord(String left, String right) {
        String upCaseFirst = left.substring(0, 1).toUpperCase() + left.substring(1);
        System.out.println(upCaseFirst + right);
        return upCaseFirst + right;
    }
}
