// LeetCode 136: Single Number
// Difficulty: Easy
// Link: https://leetcode.com/problems/single-number/

class LC136 {
    public static void main(String[] args) {
        int arr[] = {1,3,2,6,3,1,2};
        System.out.println(isUnique(arr));
    }
    static int isUnique(int []arr) {
        int unique = 0;
        for(int n : arr){
        unique ^= n;
        }
        return unique;
    }
}