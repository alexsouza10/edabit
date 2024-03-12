/*

The 3 Programmers Problem

You hired three programmers and you (hopefully) pay them. Create a function that takes three numbers (the hourly wages of each programmer) and returns the difference between the highest-paid programmer and the lowest-paid.

Examples:

programmers(147, 33, 526) ➞ 493

programmers(33, 72, 74) ➞ 41

programmers(1, 5, 9) ➞ 8

 */

package Easy;

public class The3ProgrammersProblem {
    public static void main(String[] args) {
        programmers(147, 33, 526); // Output: 493
        programmers(33, 72, 74); // Output: 41
        programmers(1, 5, 9); // Output: 8
    }

    static int programmers(int one, int two, int three) {
        int max = Math.max(Math.max(one, two), three);
        int min = Math.min(Math.min(one, two), three);
        System.out.println(max - min);
        return max - min;
    }
}