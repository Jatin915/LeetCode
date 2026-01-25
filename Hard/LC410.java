// LeetCode 410: Split Array Largest Sum
// Difficulty: Hard
// Link: https://leetcode.com/problems/split-array-largest-sum/

public class LC410 {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int pieces = 1;
        int sum = 0;

        for(int i = 0; i <nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        while(start < end) {
            int mid = start + (end-start)/2;

            for(int num : nums) {
                sum += num;

                if(sum > mid) {
                    pieces++;
                    sum = num;
                }
            }

            if(pieces <= k) {
                end = mid;
            }
            else
                start = mid + 1;

            pieces = 1;
            sum = 0;
        }

        return end;
    }
}
