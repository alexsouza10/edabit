/*
 * Basic Variable Assignment
 * 
 * A student learning Java was trying to make a function. His code should concatenate a passed string name with string "Edabit" and store it in a variable called result. He needs your help to fix this code.
 * 
 * Examples:
 * 
 * nameString("Mubashir") ➞ "MubashirEdabit"
 */

public class BasicVariableAssignment {
    public static void main(String[] args) {
        String nameString = message("Mubashir");
        System.out.println(nameString); //Output: MubashirEdabit
    }

    static String message(String requestedMessage) {
        String messageFix = "Edabit";
        String newMessage = requestedMessage + messageFix;
        return newMessage; 
    }
}
