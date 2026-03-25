// LeetCode 1394: Find Lucky Integer in an Array
// Difficulty: Easy
// Link: https://leetcode.com/problems/find-lucky-integer-in-an-array/description/

class LC1394 {
    public int findLucky(int[] arr) {
        int[] freq = new int[501];
        for(int n : arr){
            freq[n]++;
        }
        int largest = -1;

        for(int i = 1; i <= 500; i++){
            if(freq[i] == i){
            largest = i;
            }
        }
        return largest;
    }
}