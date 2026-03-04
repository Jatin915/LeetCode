// LeetCode 231: Power Of Two
// Difficulty: Easy
// Link: https://leetcode.com/problems/power-of-two/description/

public class LC231 {
    public boolean isPowerOfTwo(int n) {
        // using bit manupulation
        if(n <= 0) return false;
        if((n & n-1) == 0) return true;
        else return false;
    }
} 
