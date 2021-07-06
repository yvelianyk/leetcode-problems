package com.company.HouseRobber198;

public class HouseRobber {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < dp.length; i++) {
            int prev = dp[i - 1];
            int prevHouse = i >= 2 ? dp[i - 2] : 0;
            dp[i] = Math.max(prev, nums[i] + prevHouse);
        }

        return dp[dp.length - 1];
    }
}
