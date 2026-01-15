// LeetCode 27: Remove Element
// Difficulty: Easy
// Link: https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150

class LC27 {
    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == val){
                count++;
            }
        }
        int index=nums.length-1;
        for(int i=nums.length-1; i>((nums.length-1)-count); i--) {
            for(int j=index; j>=0; j--) {
                if(nums[j] == val){
                    nums[j]=nums[i];
                    nums[i]=val;
                    index=index-1;
                    break;
                }
            }
        }
        return nums.length-count;
    }
}