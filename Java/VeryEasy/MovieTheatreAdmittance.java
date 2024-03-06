// Movie Theatre Admittance

// Write a function that checks whether a person can watch an MA15+ rated movie. One of the following two conditions is required for admittance:

// The person is at least 15 years old.
// They have parental supervision.
// The function accepts two parameters, age and isSupervised. Return a boolean.

// Examples:

// acceptIntoMovie(14, true) ➞ true

// acceptIntoMovie(14, false) ➞ false

// acceptIntoMovie(16, false) ➞ true

// age is a decimal.
// isSupervised is a boolean.

public class MovieTheatreAdmittance {
    public static void main(String[] args) {
        acceptIntoMovie(14, true); //Output: true
        acceptIntoMovie(14, false); // Output: false
        acceptIntoMovie(16, false); // Output: true
    }

    static boolean acceptIntoMovie(int age, boolean isSupervised) {
        if ((age >= 14) && (isSupervised == true)) {
            System.out.println(true);
            return true;
        }else if((age > 14) && (isSupervised == false)){
            System.out.println(true);
            return true;     
        } else {
            System.out.println(false);
            return false;
        }
    }
}
