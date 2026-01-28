// LeetCode 151: Reverse Words in a String
// Difficulty: Medium
// Link: https://leetcode.com/problems/reverse-words-in-a-string/

public class LC151 {
    public String reverseWords(String s) {
        // remove leading/trailing spaces and split by 1 or more spaces
        String[] words = s.trim().split("\\s+"); // \\s+ one or more whitespace characters

        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(" ");
        }
        return sb.toString();
    }   
}
