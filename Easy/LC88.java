package Easy;
import java.util.Arrays;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for(int i=0; i<n; i++) {
            nums1[m+i]=nums2[i];
        }
        int temp=0;
        for(int i=0; i<m+n-1; i++) {
            for(int j=i+1; j<m+n; j++) {
                if(nums1[i] > nums1[j]) {
                    temp=nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(nums1));
    }
}