// LeetCode 3386: Button with Longest Push Time
// Difficulty: Easy
// Link: https://leetcode.com/problems/button-with-longest-push-time/

class LC3386 {
    public int buttonWithLongestTime(int[][] events) {
        int max = events[0][1];
        int index = events[0][0];
        for(int i=1; i<events.length; i++) {
            if(max == (events[i][1] - events[i-1][1]) && events[i][0] < index ) {
                index = events[i][0];
            } else if(max < (events[i][1] - events[i-1][1])) {
                max = events[i][1] - events[i-1][1];
                index = events[i][0];
            }
        }
        return index;
    }
}