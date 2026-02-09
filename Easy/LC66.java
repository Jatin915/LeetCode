// LeetCode 66: Plus One
// Difficulty: Easy
// Link: https://leetcode.com/problems/plus-one/description/

class LC66 {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0; // carry generate
        }

        // if all digits were 9
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
}