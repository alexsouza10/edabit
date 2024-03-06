public class TwoMakesTen {
    public static void main(String[] args) {
        makesTen(9, 10); // Output: true
        makesTen(9, 9); // Output: false
        makesTen(1, 9); // Output: true
    }

    static boolean makesTen(int num1, int num2) {
        if ((num1 + num2 == 10) || (num1 == 10) || (num2 == 10)) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }
}
