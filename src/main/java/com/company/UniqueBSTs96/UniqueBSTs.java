package com.company.UniqueBSTs96;

import java.util.Arrays;

public class UniqueBSTs {
    private int[][] memo;

    public int numTrees(int n) {
        memo = new int[n + 1][n + 1];
        for (int[] ints : memo) Arrays.fill(ints, -1);
        return getNumOfTrees(1, n);
    }

    private int getNumOfTrees(int start, int end) {
        if (end < start) return 1;
        if (memo[start][end] != -1) return memo[start][end];
        int result = 0;
        for (int i = start; i <= end; i++) {
            int left = getNumOfTrees(start, i - 1);
            int right = getNumOfTrees(i + 1, end);
            result += left * right;
        }
        memo[start][end] = result;
        return result;
    }
}
