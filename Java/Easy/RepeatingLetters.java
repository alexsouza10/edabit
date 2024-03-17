package Easy;

public class RepeatingLetters {
    public static void main(String[] args) {
        doubleChar("String"); // Output: SSttrriinngg
        doubleChar("Hello World!"); // Output: HHeelllloo WWoorrlldd!!
        doubleChar("1234!_ "); // Output: 11223344!!__
    }

    static String doubleChar(String s) {
        int repeat = s.length();
        String newString = "";
        for (int i = 0; i < repeat; i++) {
            newString += s.substring(i, i + 1) + s.substring(i, i + 1);
        }
        System.out.println(newString);
        return newString;
    }
}
