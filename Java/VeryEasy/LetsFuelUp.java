// Let's Fuel Up!

// A vehicle needs 10 times the amount of fuel than the distance it travels. However, it must always carry a minimum of 100 fuel before setting off.

// Create a function which calculates the amount of fuel it needs, given the distance.

// Examples

// calculateFuel(15) ➞ 150

// calculateFuel(23.5) ➞ 235

// calculateFuel(3) ➞ 100

// Distance will be a number greater than zero.
// Return 100 if the calculated fuel turns out to be less than 100.

public class LetsFuelUp {
    public static void main(String[] args) {
        calculateFuel(15); // Output: 150
        calculateFuel(23.5); // Output: 235
        calculateFuel(3); // Output: 100
    }

    static void calculateFuel(double d) {
        int transformateFuel = (int) Math.ceil(d * 10);

        if (transformateFuel < 100) {
            System.out.println(100);
        } else {
            System.out.println(transformateFuel);
        }
    }
}