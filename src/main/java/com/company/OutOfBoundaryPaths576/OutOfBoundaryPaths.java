package com.company.OutOfBoundaryPaths576;

import java.util.Arrays;

public class OutOfBoundaryPaths {
    private final int MOD = 1_000_000_007;
    private final int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
    private int m;
    private int n;
    private int N;
    private int[][][] memo;

    public int findPaths(int m, int n, int N, int i, int j) {
        this.m = m;
        this.n = n;
        this.N = N;
        this.memo = new int[m][n][N+1];
        for (int[][] ints : memo) {
            for (int[] anInt : ints) Arrays.fill(anInt, -1);
        }
        return getPaths(i, j, 0);
    }

    private int getPaths(int i, int j, int step) {
        if (i >= m || j >= n || i < 0 || j < 0) return 1;
        if (step == N) return 0;
        if (memo[i][j][step] != -1) return memo[i][j][step];

        int result = 0;
        for (int[] dir : dirs) {
            int newI = i + dir[0];
            int newJ = j + dir[1];
            result = (result + getPaths(newI, newJ, step + 1)) % MOD;
        }
        memo[i][j][step] = result;
        return result;
    }
}
