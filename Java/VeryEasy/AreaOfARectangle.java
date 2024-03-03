// Area of a Rectangle

// Create a function that calculates the area of a rectangle. If the arguments are invalid, your function must return -1.

// Examples

// area(3, 4) ➞ 12

// area(10, 11) ➞ 110

// area(-1, 5) ➞ -1

// area(0, 2) ➞ -1

public class AreaOfARectangle {
    public static void main(String[] args) {
        area(3, 4); // Output: 12
        area(10, 11); // Output: 110
        area(-1, 5); // Output: -1
        area(0, 2); // Output: -1
    }

    static int area(int width, int heigth) {
        int calcArea = width * heigth;

        if (calcArea > 0) {
            System.out.println(calcArea);
            return calcArea;
        } else {
            System.out.println(-1);
            return -1;
        }
    }
}
