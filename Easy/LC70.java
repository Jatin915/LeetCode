// LeetCode 70: Climbing Stairs
// Difficulty: Easy
// Link: https://leetcode.com/problems/climbing-stairs/description/

class LC70 {
    public int climbStairs(int n) {
        double phi = (1 + Math.sqrt(5)) / 2;
        double psi = (1 - Math.sqrt(5)) / 2;
        double fib = ( Math.pow(phi , n+1 ) -  Math.pow(psi , n+1) ) / Math.sqrt(5);
        return (int) Math.round(fib);
    }
}
