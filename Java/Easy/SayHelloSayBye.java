/*

Say "Hello" Say "Bye"

Write a function that takes a string name and a number num (either 0 or 1) and return "Hello" + name if num is 1, otherwise return "Bye" + name.

Examples

sayHelloBye("alon", 1) ➞ "Hello Alon"

sayHelloBye("Tomi", 0) ➞ "Bye Tomi"

sayHelloBye("jose", 0) ➞ "Bye Jose"

The name you return must be capitalized.

 */

package Easy;

public class SayHelloSayBye {
    public static void main(String[] args) {
        sayHelloBye("alon", 1); // Output: Hello Alon
        sayHelloBye("Tomi", 0); // Output: Bye Tomi
        sayHelloBye("jose", 0); // Output: Bye Jose
    }

    static String sayHelloBye(String name, int num) {
        String upper = name.substring(0, 1).toUpperCase() + name.substring(1);
        if (num == 1) {
            System.out.println("Hello" + " " + upper);
        } else {
            System.out.println("Bye" + " " + upper);
        }
        return name;
    }
}
