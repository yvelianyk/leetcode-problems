package com.company.MinimumPathSum64;

import java.util.Arrays;

// TODO:
public class MinimumPathSum {
    private int[][] memo;
    public int minPathSum(int[][] grid) {
        memo = new int[grid.length][grid[0].length];
        for (int[] ints : memo) Arrays.fill(ints, -1);
        return traverse(grid, 0, 0);
    }

    private int traverse(int[][] grid, int i, int j) {
        if (i >= grid.length) return Integer.MAX_VALUE;
        if (j >= grid[0].length) return Integer.MAX_VALUE;
        if (memo[i][j] != -1) return memo[i][j];

        if (i == grid.length - 1 && j == grid[0].length - 1) return grid[i][j];
        int current = grid[i][j];
        int min = Math.min(traverse(grid, i + 1, j), traverse(grid, i, j + 1));
        memo[i][j] = current + min;
        return memo[i][j];
    }
}
