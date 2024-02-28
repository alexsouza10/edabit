// Football Points

// Create a function that takes the number of wins, draws and losses and calculates the number of points a football team has obtained so far.

// wins get 3 points
// draws get 1 point
// losses get 0 points

// Examples:

// footballPoints(3, 4, 2) ➞ 13

public class FootballPoints {
    public static void main(String[] args) {
        int footballPoints = calcPoints(3, 4, 2);
        System.out.println(footballPoints); //Output: 13
    }

    static int calcPoints(int wins, int draws, int losses) {
        int pointsWins = 3;
        int pointsdraws = 1;
        int pointslosses = 0;
        int addPoints = (pointsWins * wins) + (pointsdraws * draws) - (pointslosses * losses);
        return addPoints;
    }
}
