/*
Get Word Count

Create a method that takes a string and returns the word count. The string will be a sentence.

Examples

countWords("Just an example here move along") ➞ 6

countWords("This is a test") ➞ 4

countWords("What an easy task, right") ➞ 5
*/

package Easy;

public class GetWordCount {
    public static void main(String[] args) {
        countWords("Just an example here move along"); // Output: 6
        countWords("This is a test"); // Output: 4
        countWords("What an easy task, right"); // Output: 5
    }

    static int countWords(String s) {
        boolean prevCharWasSpace = true;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                prevCharWasSpace = true;
            } else {
                if (prevCharWasSpace)
                    count++;
                prevCharWasSpace = false;
            }
        }
        System.out.println(count);
        return count;
    }
}
