// LeetCode 34: Find First and Last Position of Element in Sorted Array
// Difficulty: Medium
// Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

class LC34 {
    public int[] searchRange(int[] nums, int target) {
        int first = searchFirst(nums, target);
        int last = searchLast(nums, target);
        return new int[]{first, last};
    }

    static int searchFirst(int []nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int first = -1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(nums[mid] == target) {
                first = mid;
                end--;
            }
            else if(nums[mid] > target) {
                end--;
            }
            else start++;
        }
        return first;
    }

    static int searchLast(int []nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int last = -1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(nums[mid] == target) {
                last = mid;
                start++;
            }
            else if(nums[mid] > target) {
                end--;
            }
            else start++;
        }
        return last;
    }
}