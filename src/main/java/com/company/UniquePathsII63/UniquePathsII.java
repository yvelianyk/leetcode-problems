package com.company.UniquePathsII63;

import java.util.Arrays;

public class UniquePathsII {
    private int[][] obstacleGrid;
    private int[][] memo;
    private int m;
    private int n;

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        this.obstacleGrid = obstacleGrid;
        this.m = obstacleGrid.length;
        this.n = obstacleGrid[0].length;
        this.memo = new int[m][n];
        for (int[] ints : memo) Arrays.fill(ints, -1);

        return getPaths(0, 0);
    }

    private int getPaths(int i, int j) {
        int current = obstacleGrid[i][j];
        if (current == 1) return 0;
        if (i == m - 1 && j == n - 1) return current == 0 ? 1 : 0;
        if (this.memo[i][j] != -1) return this.memo[i][j];

        int right = 0;
        int down = 0;
        if (i + 1 < m && obstacleGrid[i + 1][j] != 1) right = getPaths(i + 1, j);
        if (j + 1 < n && obstacleGrid[i][j + 1] != 1) down = getPaths(i, j + 1);

        this.memo[i][j] = right + down;
        return right + down;
    }
}
