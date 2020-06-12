package com.company.MinCostTreeFromLeafNodes1130;

import java.util.Arrays;

// TODO: complicated recurrence relation for me
public class MinCostTreeFromLeafNodes {
    int[][] memo;
    public int mctFromLeafValues(int[] arr) {
        memo = new int[arr.length][arr.length];
        for (int[] ints : memo) Arrays.fill(ints, -1);
        return mctFromLeafValues(arr, 0, arr.length - 1);
    }

    private int mctFromLeafValues(int[] arr, int l, int r) {
        if (memo[l][r] != -1) return memo[l][r];
        int mct = Integer.MAX_VALUE;
        for (int m = l + 1; m <= r; m++) {
            mct = Math.min(
                    mct,
                    mctFromLeafValues(arr, l, m - 1)
                            + mctFromLeafValues(arr, m, r)
                            + max(arr, l, m - 1) * max(arr, m, r));
        }
        int result = mct == Integer.MAX_VALUE ? 0 : mct;
        memo[l][r] = result;
        return result;
    }

    private int max(int[] arr, int l, int r) {
        int maxVal = Integer.MIN_VALUE;
        for (int k = l; k <= r; k++) {
            maxVal = Math.max(maxVal, arr[k]);
        }
        return maxVal;
    }
}
