// LeetCode 07: Reverse Integer
// Difficulty: Medium
// Link: https://leetcode.com/problems/reverse-integer/description/

class LC07 {
    public int reverse(int x) {
        int rev = 0;
        while(x != 0) {
            int digit = x%10;
            if(rev < Integer.MIN_VALUE/10 || rev > Integer.MAX_VALUE/10 || rev > (Integer.MAX_VALUE - 1) && digit > 7)
                return 0;
            
            rev = rev*10 + digit;
            x /= 10;
        }

        return rev;
    }
}