public class IsTheNumberEvenOrOdd {
    public static void main(String[] args) {
        isEvenOrOdd(3); // Output: odd
        isEvenOrOdd(146);  // Output: even
        isEvenOrOdd(19); // Output: odd
    }

    static boolean isEvenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("even");
            return true;
        } else {
            System.out.println("odd");
            return false;
        }
    }
}