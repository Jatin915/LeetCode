// LeetCode 189: Rotate Array
// Difficulty: Medium
// Link: https://leetcode.com/problems/rotate-array/?envType=study-plan-v2&envId=top-interview-150/

import java.util.Arrays;
class LC189 {
    public void rotate(int[] nums, int k) {
        int n=nums.length;

        if(n == 1 || k == 0 || n == 0){
            System.out.print(Arrays.toString(nums));
            return;
        }

        int a,b,c;
            a=k/n;
            b=a*n;
            c=k-b;

        if(c == 0){
            System.out.print(Arrays.toString(nums));
            return;
        }

        else if(c == 1 && n == 2){
            int temp=nums[0];
            nums[0]=nums[1];
            nums[1]=temp;
            System.out.print(Arrays.toString(nums));
            return;
        }

        else{
            int left=0; int right=n-1;
            while(left < right){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++; right--;
            }

            left=0;right=c-1;
            while(left < right){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++; right--;
            }

            left=c;right=n-1;
            while(left < right){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++; right--;
            }
            System.out.print(Arrays.toString(nums));
        }
    }
}