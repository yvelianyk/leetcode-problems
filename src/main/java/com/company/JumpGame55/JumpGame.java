package com.company.JumpGame55;

// https://leetcode.com/problems/jump-game/
public class JumpGame {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) return true;
        if (nums[0] == 0) return false;
        int[] dp = new int[nums.length];

        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int prev = dp[i - 1];
            if (curr < prev) {
                dp[i] = prev - 1;
            } else {
                dp[i] = curr;
            }
            if (i < nums.length - 1 && dp[i] == 0) {
                return false;
            }
        }

        return true;

    }
}
