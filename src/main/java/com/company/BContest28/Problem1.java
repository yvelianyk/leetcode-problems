package com.company.BContest28;

public class Problem1 {
    public int[] finalPrices(int[] prices) {
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            result[i] = prices[i] - getDiscount(prices[i], i, prices);
        }
        return result;
    }

    private int getDiscount(int current, int start, int[] prices) {
        for (int i = start; i < prices.length; i++) {
            int price = prices[i];
            if (price <= current) return price;
        }
        return 0;
    }
}
