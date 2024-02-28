// Inches to Feet

// Create a function that accepts a measurement value in inches and returns the equivalent of the measurement value in feet.

// Examples

// inches_to_feet(324) ➞ 27

// Notes:

// If inches are under 12, return 0.
// 12 inches = 1 foot.

public class InchesToFeet {
    public static void main(String[] args) {
        int inchesToFeet = feet(324);
        System.out.println(inchesToFeet); //Output: 27
    }
    static int feet(int num1) {
        int inches = 12;
        int measure = num1/inches;
        if(num1 <= 0){
            return 0;
        }
        return measure;
    } 
}
