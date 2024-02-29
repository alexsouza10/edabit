public class ReturnTheFirstElementOfAnArray {
    public static void main(String[] args) {
        int[] getFirstValue1 = { 1, 2, 3 };
        int[] getFirstValue2 = { 80, 5, 100 };
        int[] getFirstValue3 = { -500, 0, 50 };

        String testResult = getArray(getFirstValue1, getFirstValue2, getFirstValue3);
        System.out.println(testResult);
    }

    static String getArray(int array1[], int array2[], int[] array3) {
        boolean testPassed = (array1[0] == 1) && (array2[0] == 80) && (array3[0] == -500);
        return testPassed ? "Test Passed!" : "Test Failed!";
    }
}