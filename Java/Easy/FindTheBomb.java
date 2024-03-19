package Easy;

public class FindTheBomb {
    public static void main(String[] args) {
        bomb("There is a bomb."); // Output: "DUCK!"
        bomb("Hey, did you think there is a BOMB?"); // Output: "DUCK!"
        bomb("This goes boom!!!"); // Output: "Relax, there's no bomb."
    }

    public static String bomb(String str) {
        str = str.toLowerCase();
        String targetWord = "bomb";

        if (str.contains(targetWord)) {
            System.out.println("DUCK!");
            return str;
        } else {
            System.out.println("Relax, there's no bomb.");
            return str;
        }
    }
}
