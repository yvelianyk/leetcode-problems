package com.company.MockInterviews.AmazonMockInterviews.Mock01022020;

// https://leetcode.com/problems/number-of-dice-rolls-with-target-sum/
public class Problem2 {
    int mod = 1000000007;
    Integer[][] memo = null;

    public int numRollsToTarget(int d, int f, int target) {
        memo = new Integer[d + 1][target + 1];
        return traverse(d, f, target);
    }

    private int traverse(int d, int f, int target) {
        if (d < 0 || target < 0) {
            return 0;
        }

        if (d == 0 && target == 0) {
            return 1;
        }
        if (memo[d][target] != null) return memo[d][target];

        memo[d][target] = 0;
        for (int i = 1; i <= f; i++) {
            memo[d][target] = (memo[d][target] + traverse(d - 1, f, target - i)) % mod;
        }
        return memo[d][target];
    }
}
