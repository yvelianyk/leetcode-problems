package com.company.MockInterviews.AmazonMockInterviews.Mock01032020;

import java.util.Arrays;

// https://leetcode.com/problems/number-of-dice-rolls-with-target-sum/
public class Problem2 {
    int modulo = 1000000007;

    public int numRollsToTarget(int d, int f, int target) {
        int[][] memo = new int[d + 1][target + 1];
        for (int[] row : memo) Arrays.fill(row, -1);

        return traverse(memo, d, f, target);
    }

    private int traverse(int[][] memo, int d, int f, int target) {
        if (d < 0 || target < 0) {
            return 0;
        }

        if (d == 0 && target == 0) {
            return 1;
        }

        if (memo[d][target] != -1) return memo[d][target];

        memo[d][target] = 0;
        for (int i = 1; i <= f; i++) {
            memo[d][target] = (memo[d][target] + traverse(memo, d - 1, f, target - i)) % modulo;
        }
        return memo[d][target];
    }
}
