/*

Shuffle the Name

Create a method that accepts a string (of a person's first and last name) and returns a string with the first and last name swapped.

Examples:

nameShuffle("Donald Trump") ➞ "Trump Donald"

nameShuffle("Rosie O'Donnell") ➞ "O'Donnell Rosie"

nameShuffle("Seymour Butts") ➞ "Butts Seymour"
Notes
There will be exactly one space between the first and last name.

 */

package Easy;

public class ShuffleTheName {
    public static void main(String[] args) {
        nameShuffle("Donald Trump"); // Output: Trump Donald
        nameShuffle("Rosie O'Donnell"); // Output: O'Donnell Rosie
        nameShuffle("Sey Butts"); // Output: Butts Sey
    }

    static String nameShuffle(String name) {
        String[] stringFragments = name.split(" ");

        if (stringFragments.length >= 2) {
            String newName = stringFragments[1] + " " + stringFragments[0];
            System.out.println(newName);
            return newName;
        }
        return name;
    }
}
