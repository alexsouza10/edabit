// Volume of a Box

// Create a function that takes an object argument sizes (contains width, length, height keys) and returns the volume of the box.

// Examples

// volumeOfBox({ width: 2, length: 5, height: 1 }) ➞ 10

// volumeOfBox({ width: 4, length: 2, height: 2 }) ➞ 16

// volumeOfBox({ width: 1, length: 2, height: 3 }) ➞ 6

public class VolumeOfABox {
    public static void main(String[] args) {
        volumeOfABox(2, 5, 1); // Output: 10
        volumeOfABox(4, 2, 2); // Output: 16
        volumeOfABox(1, 2, 3); // Output: 6
    }

    static int volumeOfABox(int width, int length, int height){
        int size = (width * length) * height;
        System.out.println(size);
        return size;
    }
}
