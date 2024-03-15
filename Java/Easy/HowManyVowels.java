/*

How Many Vowels?

Create a function that takes a string and returns the number (count) of vowels contained within it.

Examples:

countVowels("Celebration") ➞ 5

countVowels("Palm") ➞ 1

countVowels("Prediction") ➞ 4

a, e, i, o, u are considered vowels (not y).

 */

package Easy;

public class HowManyVowels {
    public static void main(String[] args) {
        getCount("celebration"); // Output: 5
        getCount("Palm"); // Output: 1
        getCount("Prediction"); // Output: 4
    }

    static int getCount(String str) {
        int countVowels = 0;
        String vowels = "aeiou";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (vowels.contains(String.valueOf(c))) {
                countVowels++;
            }
        }
        System.out.println(countVowels);
        return countVowels;
    }
}