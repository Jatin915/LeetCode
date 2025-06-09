// LeetCode 1295: Find Numbers with Even Number of Digits
// Difficulty: Easy
// Link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            if(countDigits(num)%2 == 0)
            count++;
        }
        return count;
    }

    int countDigits(int n){
        if(n<0){
            n *= -1;
            return (int)Math.log10(n) + 1;
        }
        if(n == 0){
            return 1;
        }
        return (int)Math.log10(n) + 1;
    }
}