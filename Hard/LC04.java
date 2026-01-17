// LeetCode 04: Median of Two Sorted Arrays
// Difficulty: Hard
// Link: https://leetcode.com/problems/median-of-two-sorted-arrays/description/

// import java.util.Arrays;
class LC04 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int len = nums1.length + nums2.length;
        int [] arr = new int[len];

        int idx=0;

        for(int i=0; i<nums1.length; i++) {
            arr[idx] = nums1[i];
            idx++;
        }

        for(int i=0; i<nums2.length; i++) {
            arr[idx] = nums2[i];
            idx++;
        }

        Arrays.sort(arr);

        if(len == 0) return len;

        if(len % 2 != 0) return (double) arr[len/2];

        else return (double) (arr[((len/2)-1)] + arr[(len/2)])/2;
    }
}