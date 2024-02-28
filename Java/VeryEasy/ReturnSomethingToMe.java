/*
Return Something to Me!

Write a function that returns the string "something" joined with a space " " and the given argument a.

Examples: 

giveMeSomething("is better than nothing") ➞ "something is better than nothing"

 */


public class ReturnSomethingToMe {
    public static void main(String[] args) {
        String giveMeSomething = messageStandard("is better than nothing");
        System.out.println(giveMeSomething);
    }
    static String messageStandard(String addNewMessage){
        String messageFix = "something ";
        String messageReturn = messageFix + addNewMessage;
        return messageReturn;

    }
}
