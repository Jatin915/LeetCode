// LeetCode 125: Valid Palindrome
// Difficulty: Easy
// Link: https://leetcode.com/problems/valid-palindrome/description/?envType=study-plan-v2&envId=top-interview-150

class LC125 {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            char l = s.charAt(left);
            char r = s.charAt(right);

            if (!Character.isLetterOrDigit(l)) {
                left++;
            } 
            else if (!Character.isLetterOrDigit(r)) {
                right--;
            } 
            else {
                if (Character.toLowerCase(l) != Character.toLowerCase(r))
                    return false;

                left++;
                right--;
            }
        }
        return true;
    }
}