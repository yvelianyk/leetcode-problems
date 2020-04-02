package com.company.PaintFence276;

import java.util.Arrays;

public class PaintFence {
    private int k;
    private int[][] memo;

    public int numWays(int n, int k) {
        if (n <= 1) return n * k;
        if (n == 2) return k * k;
        memo = new int[n][2];
        for (int[] ints : memo) Arrays.fill(ints, -1);
        this.k = k;
        return k * getNumber(n - 1, 0);
    }

    private int getNumber(int current, int hasAdj) {
        if (memo[current][hasAdj] != -1) {
            return memo[current][hasAdj];
        }
        if (current == 1) {
            int result = hasAdj == 1 ? k - 1 : k;
            memo[current][hasAdj] = result;
            return result;
        }

        int result = 0;
        if (hasAdj == 1) {
            result += (k - 1) * getNumber(current - 1, 0);
        } else {
            result += getNumber(current - 1, 1) +
                    (k - 1) * getNumber(current - 1, 0);
        }
        memo[current][hasAdj] = result;
        return result;
    }

}
