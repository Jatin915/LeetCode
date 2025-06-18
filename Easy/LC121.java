// LeetCode 121: Best Time to Buy and Sell Stock
// Difficulty: Easy
// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=study-plan-v2&envId=top-interview-150/

class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;

        for(int i=0; i<prices.length; i++){
            if(min > prices[i]){
                min = prices[i];
            }

            else if(prices[i] - min > max){
                max = prices[i] - min;
            }
        }

        return max;
    }
}