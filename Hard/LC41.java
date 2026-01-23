// LeetCode 41: First Missing Positive
// Difficulty: Hard
// Link: https://leetcode.com/problems/first-missing-positive/description/

class LC41 {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] > 0 && nums[i] < nums.length){
                if(nums[i] != nums[correct]){
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;
                }
                else
                    i++;
            }
            else
                i++;
        }

        i = 0;
        while(i < nums.length) {
            if(nums[i] != (i + 1))
                break;
            i++;
        }

        return i+1;
    }
}