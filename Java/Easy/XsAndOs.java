/*

Xs and Os, Nobody Knows
Create a function that takes a string, checks if it has the same number of x's and o's and returns either true or false.

Rules
Return a boolean value (true or false).
Return true if the amount of x's and o's are the same.
Return false if they aren't the same amount.
The string can contain any character.
When "x" and "o" are not in the string, return true.

Examples:

getXO("ooxx") ➞ true

getXO("xooxx") ➞ false

getXO("ooxXm") ➞ true
// Case insensitive.

getXO("zpzpzpp") ➞ true
// Returns true if no x and o.

getXO("zzoo") ➞ false

Remember to return true if there aren't any x's or o's.
Must be case insensitive.

 */

package Easy;

public class XsAndOs {
    public static void main(String[] args) {
        getXO("ooxx"); // Output: true
        getXO("xooxx"); // Output: false
        getXO("ooxXm"); // Output: true
        getXO("zpzpzpp"); // Output: true
        getXO("zzoo"); // Output: false
    }

    static boolean getXO(String str) {
        int countX = 0;
        int countO = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'x') {
                countX++;
            } else if (ch == 'o') {
                countO++;
            }
        }
        System.out.println(countO == countX);
        return countX == countO;
    }
}
