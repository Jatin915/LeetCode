// LeetCode 274: H-Index
// Difficulty: Medium
// Link: https://leetcode.com/problems/h-index/

import java.util.Arrays;
class LC274 {
    public int hIndex(int[] citations) {
        Arrays.sort(citations); 
        int h=0;
        for(int paper=citations.length-1; paper >= 0; paper--){
            if(citations[paper] >= h+1)
                h++;
            else
                break;
        }
        return h;
    }
}