// LeetCode 26: Remove Duplicates from Sorted Array
// Difficulty: Easy
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/?envType=study-plan-v2&envId=top-interview-150/

class LC26 {
    public int removeDuplicates(int[] nums) {
        int Len=nums.length-1;
        for(int i=0; i<Len; i++) {
            for(int j=i+1; j<=Len; j++) {
                if(nums[i] == nums[j]) {
                    for(int k=j; k<Len; k++) {
                        int temp=nums[k];
                        nums[k]=nums[k+1];
                        nums[k+1]=temp;
                    }
                    j--;
                    Len=Len-1;
                }
            }
        }
        return Len+1;
    }
}