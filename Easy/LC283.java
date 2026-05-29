// LeetCode 283: Move Zeroes
// Difficulty: Easy
// Link: https://leetcode.com/problems/move-zeroes/

class LC283 {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 1;

        while(j < nums.length) {
            if(nums[i] == 0) {
                if(nums[j] == 0) {
                    j++;
                }
                else {
                    nums[i] = nums[j];
                    nums[j] = 0;
                    i++;
                    j++;
                }
            }
            else {
                i++;
                j++;
            }
        }
    }
}