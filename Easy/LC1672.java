// LeetCode 1672: Richest Customer Wealth
// Difficulty: Easy
// Link: https://leetcode.com/problems/richest-customer-wealth/

class LC1672 {
    public int maximumWealth(int[][] accounts) {
        int sum=0, store=0;
        for(int i=0; i<accounts.length; i++){
            for(int j=0; j<accounts[i].length; j++){
                store += accounts[i][j];
            }
            if(store > sum)
                sum=store;
            store=0;
        }
        return sum;   
    }
}