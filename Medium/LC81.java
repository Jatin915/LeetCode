// LeetCode 81: Search in Rotated Sorted Array II
// Difficulty: Medium
// Link: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/

class LC81 {
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start <= end) {
            int mid = start + (end-start)/2;
            if(nums[mid] == target) return true;

            if(nums[start] == nums[mid]) {
                start++;
                continue;
            }

            if(nums[start] < nums[mid]) {
                if(target >= nums[start] && target < nums[mid]) {
                    end = mid-1;
                }
                else start = mid+1;
            }

            else if(nums[start] > nums[mid]) {
                if(target > nums[mid] && target <= nums[end]) {
                    start = mid+1;
                }
                else end = mid-1;
            }
            else return false;
        }
        return false;
    }
}