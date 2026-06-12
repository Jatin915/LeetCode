// LeetCode 217: Contains Duplicate
// Difficulty: Easy
// Link: https://leetcode.com/problems/contains-duplicate/

import java.util.HashSet;

class LC217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
         
            if(set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        
        return false;
    }
}