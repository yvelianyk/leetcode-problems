package com.company.Contest203;

public class Problem4 {
    private int[] stoneValue;
    private int[] prefixSums;
    private int[][] memo;
    private int n;

    public int stoneGameV(int[] stoneValue) {
        this.n = stoneValue.length;
        this.stoneValue = stoneValue;
        this.memo = new int[n][n];
        initPrefixSums();
        return getMax(0, n - 1);
    }

    private int getMax(int start, int end) {
        if (start >= end) return 0;
        if (memo[start][end] != 0) return memo[start][end];

        int result = Integer.MIN_VALUE;
        for (int i = start; i < end; i++) {
            int left = getRangeSum(start, i);
            int right = getRangeSum(i + 1, end);
            if (left > right) {
                result = Math.max(result, right + getMax(i + 1, end));
                continue;
            }
            if (left < right) {
                result = Math.max(result, left + getMax(start, i));
                continue;
            }
            result = left + Math.max(getMax(i + 1, end), getMax(start, i));
        }

        memo[start][end] = result;
        return result;
    }

    private void initPrefixSums() {
        this.prefixSums = new int[n];
        prefixSums[0] = stoneValue[0];
        for (int i = 1; i < stoneValue.length; i++) {
            prefixSums[i] = stoneValue[i] + prefixSums[i - 1];
        }
    }

    private int getRangeSum(int start, int end) {
        if (start == end) return stoneValue[start];
        int prefixSum = prefixSums[end] - prefixSums[start];
        return prefixSum + stoneValue[start];
    }
}
