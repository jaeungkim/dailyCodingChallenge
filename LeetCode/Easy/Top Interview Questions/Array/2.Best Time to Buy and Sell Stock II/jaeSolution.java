public class jaeSolution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        // 7,1,5,3,6,4
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
            // maxprofit = 5-1 = 4
            // maxprofit = 6-3 = 3
        }
        return maxprofit;
    }
}
