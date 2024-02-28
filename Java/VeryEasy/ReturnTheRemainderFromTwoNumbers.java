public class ReturnTheRemainderFromTwoNumbers {
    public static void main(String[] args) {
        int remainder = check(1, 0);
        System.out.println(remainder);
    }

    static int check(int x, int y) {
        if(x > y) {
            return x;
        }else {
            return y;
        }
    }

}
