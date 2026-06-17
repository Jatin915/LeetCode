// LeetCode 349: Intersection of Two Arrays
// Difficulty: Easy
// Link: https://leetcode.com/problems/intersection-of-two-arrays/

import java.util.HashSet;

class LC349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int n: nums1) {
            set1.add(n);
        }

        for(int n: nums2) {
            if(set1.contains(n)) {
                set2.add(n);
            }
        }

        int []arr = new int[set2.size()];

        int i=0;
        for(int n: set2) {
            arr[i++] = n;
        }
        return arr;
    }
}