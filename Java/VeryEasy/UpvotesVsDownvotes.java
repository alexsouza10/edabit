/*
Upvotes vs Downvotes

Given an object containing counts of both upvotes and downvotes, return what vote count should be displayed. This is calculated by subtracting the number of downvotes from upvotes.

Examples

getVoteCount({ upvotes: 13, downvotes: 0 }) ➞ 13
 */


public class UpvotesVsDownvotes {
    public static void main(String[] args) {
        int getVoteConunt = logicvotes(13, 0);
        System.out.println(getVoteConunt); //Output: 13
    }

    static int logicvotes(int upvotes, int downvotes) {
        int sumvotes = upvotes - downvotes;
        return sumvotes;
    }
}
