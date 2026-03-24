// LeetCode 202: Happy Number
// Difficulty: Easy
// Link: https://leetcode.com/problems/happy-number/description/

class LC202 {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(slow != fast);
        
        return (slow == 1) ? true : false;
    }

    public static int findSquare(int n) {
        int ans = 0;
        while(n != 0) {
            int rem = n % 10;
            ans += rem * rem;
            n /= 10;
        }
        return ans;
    }
}