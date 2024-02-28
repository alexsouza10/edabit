/*
 * Sum Of Polygon Angles
 * 
 * Given an n-sided regular polygon n, return the total sum of internal angles (in degrees).
 * 
 * Examples: 
 * 
 * sumOfAngles(3) ➞ 180
 */


public class SumOfPolygonAngles {
    public static void main(String[] args) {
        int sumOfAngles = sum(3);
        System.out.println(sumOfAngles); // Output: 180
    }

    static int sum(int n) {
        int addLogic = (n - 2) * 180;
        return addLogic;
    } 
}
