/*

Reverse the Order of a String
Create a method that takes a string as its argument and returns the string in reversed order.

Examples:

reverse("Hello World") ➞ "dlroW olleH"

reverse("The quick brown fox.") ➞ ".xof nworb kciuq ehT"

reverse("Edabit is really helpful!") ➞ "!lufpleh yllaer si tibadE"

You can expect a valid string for all test cases.

*/

package Easy;

public class ReverseTheOrderOfAString {
    public static void main(String[] args) {
        reverse("Hello World"); // Output: dlroW olleH
        reverse("The quick brown fox."); // Output: .xof nworb kciuq ehT
        reverse("Edabit is really helpful!"); // Output: !lufpleh yllaer si tibadE
    }

    static void reverse(String str) {
        StringBuilder strReverse = new StringBuilder(str);
        strReverse.reverse();
        System.out.println(strReverse);
    }
}
