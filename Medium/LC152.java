// LeetCode 152: Maximum Product Subarray
// Difficulty: Medium
// Link: https://leetcode.com/problems/maximum-product-subarray/

class LC152 {
    public int maxProduct(int[] nums) {
        int maxEnding = nums[0];
        int minEnding = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int n = nums[i];
            int prevMax = maxEnding;   // store old max

            maxEnding = Math.max(n, Math.max(n * maxEnding, n * minEnding));
            minEnding = Math.min(n, Math.min(n * prevMax, n * minEnding));

            result = Math.max(result, maxEnding);
        }
        return result;
    }
}