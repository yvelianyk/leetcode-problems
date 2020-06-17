package com.company.GuessNumberHigherOrLowerII375;

// Interesting problem(MINIMAX). It was very hard to figure out the problem description
public class GuessNumberHigherOrLower {
    private int[][] memo;

    public int getMoneyAmount(int n) {
        memo = new int[n + 1][n + 1];
        return getMin(1, n);
    }

    private int getMin(int left, int right) {
        if (left >= right) return 0;
        if (memo[right][left] != 0) return memo[right][left];

        int res = Integer.MAX_VALUE;
        for(int i = left;i <= right; i++) {
            int innerRes = i + Math.max(getMin(left, i - 1), getMin(i + 1, right));
            res = Math.min(res, innerRes);
        }
        memo[right][left] = res;
        return res;
    }
}
