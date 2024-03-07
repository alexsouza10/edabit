package Easy;

public class TriangularNumberSequence {
    public static void main(String[] args) {
        triangle(1); // Output: 1
        triangle(6); // Output: 21
        triangle(215); // Output: 23220
    }

    static int triangle(int num) {
        int groupNumbers = ((num * (num + 1)) / 2);
        System.out.println(groupNumbers);
        return groupNumbers;
    }
}
