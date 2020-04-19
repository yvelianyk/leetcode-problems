package com.company.Contest185;

import java.util.Arrays;

public class Problem4 {
    int mod = 1000000007;
    int maxK;
    int[][][] memo;

    public int numOfArrays(int n, int m, int k) {
        maxK = k;
        memo = new int[n + 1][m + 1][k + 1];
        for (int[][] ints : memo)
            for (int[] item : ints) Arrays.fill(item, -1);
        return getPaths(0, 0, n, m, 0) % mod;
    }

    private int getPaths(int index, int max, int n, int m, int k) {
        if (k > maxK) return 0;
        if (index == n) return k == maxK ? 1 : 0;
        if (memo[index][max][k] != -1) return memo[index][max][k];
        int res = 0;
        for (int i = 1; i <= m; i++) {
            res = (res + getPaths(index + 1, Math.max(max, i), n, m, i > max ? k + 1 : k)) % mod;
        }
        memo[index][max][k] = res % mod;
        return memo[index][max][k];
    }
}