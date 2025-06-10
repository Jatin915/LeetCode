// LeetCode 80: Remove Duplicates from Sorted Array II
// Difficulty: Medium
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/?envType=study-plan-v2&envId=top-interview-150/


class Solution {
    public int removeDuplicates(int[] nums) {
        int Len=nums.length-1; int count=1;
        for(int i=0; i<Len; i++){
            for(int j=i+1; j<=Len; j++){
                if(nums[i] == nums[j]){
                    count++;
                    if(count > 2){
                        for(int k=j; k<Len; k++){
                            int temp=nums[k];
                            nums[k]=nums[k+1];
                            nums[k+1]=temp;
                        }
                        Len=Len-1;
                        j--;
                    }
                }
            }
            count=1;
        }
        return Len+1;
    }
}