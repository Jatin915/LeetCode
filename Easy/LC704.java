// LeetCode 704: Binary Search
// Difficulty: Easy
// Link: https://leetcode.com/problems/binary-search/description/

class LC704 {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(target == nums[mid]) return mid;
            if(target > nums[mid]) start = mid+1;
            else end = mid - 1;
        }
        return -1;
    }
}