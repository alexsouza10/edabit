/*

Stuttering As We Speak

You stutter when you talk with continued repetition of sounds almost unknowingly, especially with the initial consonants of a word. Or at times when we're frightened, it causes us to stutter.

Create a function that mimics the stuttering of a spoken word. The function will repeat the first two letters of the word followed by an ellipses (...) plus a space character, for twice in a row, and finally, the word ending with an exclamation point.

Examples:

stuttering("astonishing") ➞ "as... as... astonishing!"

stuttering("enticing") ➞ "en... en... enticing!"

stuttering("dazzling") ➞ "da... da... dazzling!"

Every string input is at least two-character long.
The very purpose of this challenge is the use of String.format which was not introduced and used in the prior similar challenge.
In lieu to String.format, the use of MessageFormat.format is greatly encouraged.

 */

package Easy;

public class StutteringAsWeSpeak {
    public static void main(String[] args) {
        stuttering("astonishing"); // Output: as... as... astonishing!
        stuttering("enticing"); // Output: en... en... enticing!
        stuttering("dazzling"); // Output: da... da... dazzling!
    }

    static String stuttering(String word) {
        StringBuilder stutteringWord = new StringBuilder();
        stutteringWord.append(word.substring(0, 2)).append("... ").append(word.substring(0, 2)).append("... ");

        stutteringWord.append(word).append("!");

        System.out.println((stutteringWord.toString()));
        return word;
    }
}
