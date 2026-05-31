// LeetCode 1342: Number of Steps to Reduce a Number to Zero
// Difficulty: Easy
// Link: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

class LC1342 {
    public int numberOfSteps(int num) {
        return count(num, 0);
    }
    static int count(int n, int steps) {
        if(n == 0) return steps;
        return (n%2 == 0) ? count(n/2, ++steps) : count(n-1, ++steps);
    }
}