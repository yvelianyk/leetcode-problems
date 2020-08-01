package com.company.JuneLeetcodeChallenge;

import java.util.Arrays;

public class BestTiemToBuyAndSellCooldown {
    private int[] prices;
    private int[][] memo;

    public int maxProfit(int[] prices) {
        this.prices = prices;
        int n = prices.length;
        this.memo = new int[n][2];
        for (int[] ints : memo) Arrays.fill(ints, -1);
        return getMaxProfit(0, 0);
    }

    // 0 - buy, 1 - sell,
    private int getMaxProfit(int day, int operation) {
        int max;
        if (day >= prices.length) return 0;
        if (memo[day][operation] != -1) return memo[day][operation];

        switch (operation) {
            case 0:
                int buy = getMaxProfit(day + 1, 1) - prices[day];
                int cooldownBuy = getMaxProfit(day + 1, 0);
                max = Math.max(buy, cooldownBuy);
                break;
            case 1:
                int sell = prices[day] + getMaxProfit(day + 2, 0);
                int cooldownSell = getMaxProfit(day + 1, 1);
                max = Math.max(sell, cooldownSell);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }

        memo[day][operation] = max;
        return max;
    }
}
