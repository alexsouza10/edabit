/*
Upvotes vs Downvotes

Given an object containing counts of both upvotes and downvotes, return what vote count should be displayed. This is calculated by subtracting the number of downvotes from upvotes.

Examples

getVoteCount({ upvotes: 13, downvotes: 0 }) ➞ 13
getVoteCount({ upvotes: 2, downvotes: 33 }) ➞ -31
getVoteCount({ upvotes: 132, downvotes: 132 }) ➞ 0
 */

import java.util.Map;

public class UpvotesVsDownvotes {
    public static void main(String[] args) {

        Map<String, Integer> votes1 = Map.of("upvotes", 13, "downvotes", 0);
        Map<String, Integer> votes2 = Map.of("upvotes", 2, "downvotes", 33);
        Map<String, Integer> votes3 = Map.of("upvotes", 132, "downvotes", 132);

        System.out.println("Vote Count 1: " + getVoteCount(votes1)); // Output: Vote Count 1: 13
        System.out.println("Vote Count 2: " + getVoteCount(votes2)); // Output: Vote Count 2: -31
        System.out.println("Vote Count 3: " + getVoteCount(votes3)); // Output: Vote Count 3: 0
    }

    public static int getVoteCount(Map<String, Integer> votes) {
        int upvotes = votes.get("upvotes");
        int downvotes = votes.get("downvotes");
        return upvotes - downvotes;
    }
}
