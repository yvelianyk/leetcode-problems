package com.company.BestTimetoBuyandSellStock121;

public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int buy = prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            if (price < buy) {
                buy = price;
            }
            profit = Math.max(price - buy, profit);
        }

        return profit;
    }
}
