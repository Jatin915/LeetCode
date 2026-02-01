// LeetCode 27: Remove Element
// Difficulty: Easy
// Link: https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150

class LC27 {
    public int removeElement(int[] nums, int val) {
        int i = 0; // slow pointer for valid elements

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}