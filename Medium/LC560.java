// LeetCode 560: Subarray Sum Equals K
// Difficulty: Medium
// Link: https://leetcode.com/problems/subarray-sum-equals-k/

class LC560 {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for(int num : nums) {

            sum += num;

            if(map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}