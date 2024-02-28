/*
Power Calculator

Create a function that takes voltage and current and returns the calculated power.

Examples:

power(230, 10) ➞ 2300
 */


public class PowerCalculator {
    public static void main(String[] args) {
        int power = calcPower(230, 10);
        System.out.println(power); //Output: 2300
    }

    static int calcPower(int voltage, int current) {
        int sumPower = voltage * current;
        return sumPower;
    }
}
