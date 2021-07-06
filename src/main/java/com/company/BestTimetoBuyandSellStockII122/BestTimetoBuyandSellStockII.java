package com.company.BestTimetoBuyandSellStockII122;

public class BestTimetoBuyandSellStockII {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int price = prices[i];
            int nextPrice = prices[i+1];
            if (nextPrice > price) {
                profit += nextPrice - price;
            }
        }
        return profit;
    }
}
