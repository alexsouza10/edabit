// Basketball Points
// You are counting points for a basketball game, given the amount of 2-pointers scored and 3-pointers scored, find the final points for the team and return that value.

// Examples
// points(13, 12) ➞ 62

public class BasketballPoints {
    public static void main(String[] args) {
        int points = pointsTeams(13, 12);
        System.out.println(points); //Output: 62
    }

    static int pointsTeams(int twoPoints, int threePoints) {
        int addPoints = (2 * twoPoints) + (3 * threePoints);
        return addPoints;
    }

}
