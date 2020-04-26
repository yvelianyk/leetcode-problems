package com.company.Contest186;

public class Problem4BottomUp {

    // TODO:
    public int constrainedSubsetSum(int[] nums, int k) {
        int[] dp = new int[nums.length];
        int m = Integer.MIN_VALUE;
        for (int j = 0; j < nums.length; j++) {
            dp[j] = nums[j];
            int max = 0;
            for (int i = j - 1; i >= 0; i--) {
                if (j - i > k) break;
                else {
                    max = Math.max(max, dp[i]);
                    if (nums[i] >= 0) break;
                }
            }
            dp[j] += max;
            m = Math.max(m, dp[j]);
        }
        return m;
    }

}
