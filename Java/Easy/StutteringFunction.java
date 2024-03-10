/*

Stuttering Function
Write a function that stutters a word as if someone is struggling to read it. The first two letters are repeated twice with an ellipsis ... and space after each, and then the word is pronounced with a question mark ?.

Examples
stutter("incredible") ➞ "in... in... incredible?"

stutter("enthusiastic") ➞ "en... en... enthusiastic?"

stutter("outstanding") ➞ "ou... ou... outstanding?"

Assume all inputs are in lower case and at least two-character long.

Check on the Resources tab for more helpful tips on String formatting in Java.

 */

package Easy;

public class StutteringFunction {
    public static void main(String[] args) {
        stutter("incredible"); // Output: in... in... incredible?
        stutter("enthusiastic"); // Output: en... en... enthusiastic?
        stutter("outstanding"); // Output: ou... ou... outstanding?
    }

    static void stutter(String word) {
        StringBuilder stutteredWord = new StringBuilder();

        stutteredWord.append(word.substring(0, 2)).append("... ").append(word.substring(0, 2)).append("... ");

        stutteredWord.append(word).append("?");

        System.out.println(stutteredWord.toString());
    }
}
