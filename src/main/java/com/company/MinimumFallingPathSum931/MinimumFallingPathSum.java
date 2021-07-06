package com.company.MinimumFallingPathSum931;

import java.util.Arrays;

public class MinimumFallingPathSum {

    private int[][] A;
    private int[][] memo;

    public int minFallingPathSum(int[][] A) {
        this.A = A;
        this.memo = new int[A.length][A[0].length];
        for (int[] ints : memo) Arrays.fill(ints, -101);
        int result = Integer.MAX_VALUE;
        int[] firstRow = A[0];
        for (int i = 0; i < firstRow.length; i++)
            result = Math.min(result, minCost(0, i));
        return result;
    }

    private int minCost(int i, int j) {
        if (i >= A.length || j < 0 || j >= A[0].length) return Integer.MAX_VALUE;
        if (memo[i][j] != -101) return memo[i][j];
        if (i == A.length - 1) return A[i][j];

        int minRes = Integer.MAX_VALUE;
        for (int k = j - 1; k <= j + 1; k++)
            minRes = Math.min(minRes, minCost(i + 1, k));

        memo[i][j] = A[i][j] + minRes;
        return memo[i][j];
    }
}
