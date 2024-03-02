// Frames Per Second

// Create a method that returns the number of frames shown in a given number of minutes for a certain FPS.

// Examples

// frames(1, 1) ➞ 60

// frames(10, 1) ➞ 600

// frames(10, 25) ➞ 15000

public class FramesPerSecond {
    public static void main(String[] args) {
        solution(1, 1); // Output: 60
        solution(10, 1); // Output: 600
        solution(10, 25); // Output: 15000
    }

    static int solution(int x, int y) {
        int convertFramesPerSeconds = (x * y) * 60;
        System.out.println(convertFramesPerSeconds);
        return convertFramesPerSeconds;
    }
}
