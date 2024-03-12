package Easy;

public class ReverseTheOrderOfAString {
    public static void main(String[] args) {
        reverse("Hello World"); // Output: dlroW olleH
        reverse("The quick brown fox."); // Output: .xof nworb kciuq ehT
        reverse("Edabit is really helpful!"); // Output: !lufpleh yllaer si tibadE
    }

    static void reverse(String str) {
        StringBuilder strReverse = new StringBuilder(str);
        strReverse.reverse();
        System.out.println(strReverse);
    }
}
