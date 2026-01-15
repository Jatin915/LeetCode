// LeetCode 122: Best Time to Buy and Sell Stock II
// Difficulty: Medium
// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/?envType=study-plan-v2&envId=top-interview-150/

class LC122 {
    public int maxProfit(int[] prices) {
        int total=0;
        for(int i=0; i<prices.length-1; i++){
            if(prices[i+1] > prices[i]) {
                total += prices[i+1]-prices[i];
            }
        }
        return total;
    }
}