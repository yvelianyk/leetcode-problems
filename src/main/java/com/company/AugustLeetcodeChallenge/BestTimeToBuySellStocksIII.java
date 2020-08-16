package com.company.AugustLeetcodeChallenge;

import java.util.Arrays;

public class BestTimeToBuySellStocksIII {
    private int n;
    private int[] prices;
    private int[][][] memo;

    public int maxProfit(int[] prices) {
        this.n = prices.length;
        this.memo = new int[n][2][3];
        for (int[][] ints : memo)
            for (int[] anInt : ints) Arrays.fill(anInt, -1);
        this.prices = prices;
        return getMax(0, 0, 0);
    }

    // 0 - buy, 1 - sell
    private int getMax(int index, int operation, int count) {
        if (index == n || count >= 2) return 0;
        if (memo[index][operation][count] != -1)
            return memo[index][operation][count];
        int profit = 0;
        if (operation == 0) {
            int buy = getMax(index + 1, 1, count) - prices[index];
            int skipBuy = getMax(index + 1, 0, count);
            profit = Math.max(buy, skipBuy);
        }
        if (operation == 1) {
            int sell = prices[index] + getMax(index + 1, 0, count + 1);
            int skipSell = getMax(index + 1, 1, count);
            profit = Math.max(sell, skipSell);
        }
        memo[index][operation][count] = profit;
        return profit;
    }
}
