package com.company.EqualSubstingsWithbugdet1208;

public class EqualSubstingsWithbugdet {
    public int equalSubstring(String s, String t, int maxCost) {
        int length = s.length();
        int[] prices = new int[length];

        for (int i = 0; i < length; i++) {
             char first = s.charAt(i);
             char second = t.charAt(i);
             prices[i] = Math.abs(first - second);
        }

        int max = 0;
        int currPrice = 0;
        int start = 0;
        for (int end = 0; end < prices.length; end++) {
            int price = prices[end];
            currPrice += price;
            while (currPrice > maxCost) {
                currPrice -= prices[start];
                start++;
            }
            max = Math.max(max, end - start + 1);
        }

        return max;
    }
}
