/*

Find the Discount
Create a function that takes two arguments: the original price and the discount percentage as integers and returns the final price after the discount.

Examples

discount(1500, 50) ➞ 750

discount(89, 20) ➞ 71.2

discount(100, 75) ➞ 25
Notes
Your answer should be rounded to two decimal places.

 */

package Easy;

public class FindTheDiscount {
    public static void main(String[] args) {
        discount(1500, 50); // Output: 750
        discount(89, 20); // Output: 71.2
        discount(100, 75); // Output: 25
    }

    static double discount(int price, int percentage) {
        double calcPercentage = (double) percentage / 100;
        double discountedPrice = price - (price * calcPercentage);

        if (discountedPrice == (int) discountedPrice) {
            System.out.println((int) discountedPrice);
        } else {
            System.out.printf("%.1f\n", discountedPrice);
        }
        return discountedPrice;
    }
}
