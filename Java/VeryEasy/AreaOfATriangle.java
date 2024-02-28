/*
Area of a Triangle

Write a function that takes the base and height of a triangle and return its area.

Examples: 

triArea(3, 2) ➞ 3
 */

public class AreaOfATriangle {
    public static void main(String[] args) {
        int triArea = triangle(3, 2);
        System.out.println(triArea); //Output: 3
    }

    static int triangle(int base, int height) {
        int area = (base * height) / 2;
        return area;
    }
}
