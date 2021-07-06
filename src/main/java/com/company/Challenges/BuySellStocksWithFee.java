package com.company.Challenges;

import java.util.Arrays;

public class BuySellStocksWithFee {
    private int n;
    private int fee;
    private int[] prices;
    private int[][] memo;

    public int maxProfit(int[] prices, int fee) {
        this.fee = fee;
        this.n = prices.length;
        this.memo = new int[n][2];
        for (int[] ints : memo)
             Arrays.fill(ints, -1);
        this.prices = prices;
        return getMax(0, 0 );
    }

    // 0 - buy, 1 - sell
    private int getMax(int index, int operation) {
        if (index == n) return 0;
        if (memo[index][operation] != -1)
            return memo[index][operation];
        int profit = 0;
        if (operation == 0) {
            int buy = getMax(index + 1, 1) - prices[index];
            int skipBuy = getMax(index + 1, 0);
            profit = Math.max(buy, skipBuy);
        }
        if (operation == 1) {
            int sell = prices[index] + getMax(index + 1, 0) - fee;
            int skipSell = getMax(index + 1, 1);
            profit = Math.max(sell, skipSell);
        }
        memo[index][operation] = profit;
        return profit;
    }

}
