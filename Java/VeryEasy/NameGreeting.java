/*
 * Name Greeting!
 * 
 * Create a function that takes a name and returns a greeting in the form of a string.
 * 
 * Examples: 
 * 
 * helloName("Gerald") ➞ "Hello Gerald!"
 */

public class NameGreeting {
    public static void main(String[] args) {
        String helloName = saudation("Gerald");
        System.out.println(helloName); //Output: Hello Gerald!
    }

    static String saudation(String name) {
        String saudationFixed = "Hello " + name + "!";
        return saudationFixed;
    }
}
