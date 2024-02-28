/*
Maximum Edge of a Triangle

Create a function that finds the maximum range of a triangle's third edge, where the side lengths are all integers.
(side1 + side2) - 1

Examples: 

nextEdge(8, 10) ➞ 17
 */

public class MaximumEdgeOfATriangle {
    public static void main(String[] args) {
        int nextEdge = areaEdge(8, 10);
        System.out.println(nextEdge);    
    
    }

    static int areaEdge(int side1, int side2){
        int edge = (side1 + side2) - 1;
        return edge;
    }

}
