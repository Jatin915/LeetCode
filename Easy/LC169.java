// LeetCode 169: Majority Element
// Difficulty: Easy
// Link: https://leetcode.com/problems/majority-element/?envType=study-plan-v2&envId=top-interview-150/

import java.util.HashMap;

class LC169 {
    public int majorityElement(int[] nums) {
        int count=1; int ans=1; int index=-1;
        int Len=nums.length-1;
        
        if(Len == 0)
            return nums[0];
        
        for(int i=0; i<Len; i++){
            for(int j=i+1; j<=Len; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > Len/2){
                if(count > ans){
                    ans=count;
                    index=nums[i];
                }
            }
            count=1;
        }
        return index;
    }
}


// HashMap solution
class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length;

        for(int num : nums) {

            map.put(num, map.getOrDefault(num, 0) + 1);

            if(map.get(num) > n / 2) {
                return num;
            }
        }

        return -1;
    }
}