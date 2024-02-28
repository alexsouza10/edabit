/*
Find the Perimeter of a Rectangle

Create a function that takes length and width and finds the perimeter of a rectangle.

Examples:

findPerimeter(6, 7) ➞ 26
 */


public class FindThePerimeterOfARectangle {
    public static void main(String[] args) {
        int findPerimeter = parameters(6, 7);
        System.out.println(findPerimeter); //Output: 26
    }

    static int parameters(int length, int width) {
        int result = (length + width) * 2;
        return result;
    }
}
