class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1)
            return 0;
        int minVal = prices[0];
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > minVal)
                maxProfit = Math.max(maxProfit, (prices[i]-minVal));
            else 
                minVal = Math.min(prices[i], minVal);
        }
        return maxProfit;
    }
}
