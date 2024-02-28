// Basketball Points
// You are counting points for a basketball game, given the amount of 2-pointers scored and 3-pointers scored, find the final points for the team and return that value.

// Examples
// points(13, 12) ➞ 62

public class BasketballPoints {
    public static void main(String[] args) {
        int points = pointsTeams(13, 12);
        System.out.println(points); //Output: 62
    }

    static int pointsTeams(int team1, int team2) {
        int pointersScoredTeam1 = 2;
        int pointersScoredTeam2 = 3;
        int addPoints = (pointersScoredTeam1 * team1) + (pointersScoredTeam2 *team2);
        return addPoints;
    }

}
