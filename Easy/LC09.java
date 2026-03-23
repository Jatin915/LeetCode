// LeetCode 09: Palindrome Number
// Difficulty: Easy
// Link: https://leetcode.com/problems/palindrome-number/description/

class LC09 {
    public boolean isPalindrome(int x) {
        if(x < 0)
         return false;
        int n = x;
        int rev = 0;
        while(n != 0) {
            int digit  = n % 10;
            rev = rev*10 + digit;
            n /= 10;
        }
        return (rev == x) ? true : false;
    }
}