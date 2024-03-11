/*

Capture the Rook

Write a function that returns true if two rooks can attack each other, and false otherwise.

Examples:

canCapture(["A8", "E8"]) ➞ true

canCapture(["A1", "B2"]) ➞ false

canCapture(["H4", "H3"]) ➞ true

canCapture(["F5", "C8"]) ➞ false

Assume no blocking pieces.

Two rooks can attack each other if they share the same row (letter) or column (number).

*/
package Easy;

public class CaptureTheRook {
    public static void main(String[] args) {
        String[] canCapture1 = { "A8", "E8" }; // Output: true
        String[] canCapture2 = { "A1", "B2" }; // Output: false
        String[] canCapture3 = { "H4", "H3" }; // Output: true
        String[] canCapture4 = { "F5", "C8" }; // Output: false

        System.out.println(canCapture(canCapture1));
        System.out.println(canCapture(canCapture2));
        System.out.println(canCapture(canCapture3));
        System.out.println(canCapture(canCapture4));
    }

    static boolean canCapture(String[] rooks) {
        char row1 = rooks[0].charAt(0);
        char col1 = rooks[0].charAt(1);
        char row2 = rooks[1].charAt(0);
        char col2 = rooks[1].charAt(1);
        boolean result = ((row1 == row2) || (col1 == col2));
        return result;
    }
}
