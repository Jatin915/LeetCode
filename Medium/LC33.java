// LeetCode 33: Search in Rotated Sorted Array
// Difficulty: Medium
// Link: https://leetcode.com/problems/search-in-rotated-sorted-array/w

class LC33 {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start <= end) {
            int mid = start + (end-start)/2;
            
            // target found at middle
            if(nums[mid] == target) return mid;

            //check if left is sorted
            else if(nums[start] <= nums[mid]) {
                //if target is in the left side
                if(target >= nums[start] && target < nums[mid]) {
                    end = mid-1;
                }
                //if target is in the right side
                else 
                    start = mid+1;
            }

            //check if right is sorted
            else if(nums[start] > nums[mid]) {
                //if target is in the right side
                if(target > nums[mid] && target <= nums[end]) {
                    start = mid+1;
                }
                //if target is in the left side
                else {
                    end = mid-1;
                }
            }

            //target is not in the array
            else return -1;
        }
        return -1;
    }
}