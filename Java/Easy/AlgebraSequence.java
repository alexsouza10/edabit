/*

Algebra Sequence — Boxes

Create a function that takes a number (step) as an argument and returns the amount of boxes in that step of the sequence.

Box Sequence Image

Step 0: Start with 0
Step 1: Add 3
Step 2: Subtract 1
Repeat Step 1 & 2 ...

Examples:

boxSeq(0) ➞ 0

boxSeq(1) ➞ 3

boxSeq(2) ➞ 2

Step (the input) is always a positive integer (or zero).
For an odd step add 3, for an even step subtract 1.

*/

package Easy;

public class AlgebraSequence {
    public static void main(String[] args) {
        System.out.println(boxSeq(0)); // Output: 0
        System.out.println(boxSeq(1)); // Output: 3
        System.out.println(boxSeq(2)); // Output: 2
    }

    static int boxSeq(int step) {
        return (step % 2 == 0) ? step / 1 : (step / 2) + 3;
    }
}
