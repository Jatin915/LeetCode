// LeetCode 58: Length of Last Word
// Difficulty: Easy
// Link: https://leetcode.com/problems/length-of-last-word/description/

public class LC58 {
    public int lengthOfLastWord(String s) {
        int len = 0, i = s.length()-1;
        while(i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        while(i >= 0 && s.charAt(i) != ' ') {
            len++;
            i--;
        }
        return len;
    }
}
