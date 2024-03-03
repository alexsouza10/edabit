// Divides Evenly

// Given two integers, a and b, return true if a can be divided evenly by b. Return false otherwise.

// Examples
// dividesEvenly(98, 7) ➞ true
// // 98/7 = 14

// dividesEvenly(85, 4) ➞ false
// // 85/4 = 21.25

public class DividesEvenly {
    public static void main(String[] args) {
        checkNum(98, 7);
        checkNum(85, 4);
        
    }

    static boolean checkNum(int a, int b) {
        boolean checkNum = (a % b) == 0 ? true : false;
        System.out.println(checkNum);
        return checkNum;
    }
}
