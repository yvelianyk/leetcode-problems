package com.company.NumOfLongestIncrSubsequence673;

// TODO: it's hard to solve this for me
public class NumOfLongestIncrSubsequence {
    int[] nums;
    int[] dp;
    int[] cnt;
    public int findNumberOfLIS(int[] nums) {
        this.nums = nums;
        this.dp = new int[nums.length];
        this.cnt = new int[nums.length];
        fill(nums.length - 1);
        return 1;
    }

    private int fill(int index) {
        if (dp[index] != -1) return dp[index];

        int result = 1;

        for (int i = 0; i < index; i++) {
            int val = fill(i);
            int curr = nums[i];
            if(nums[index] > nums[i] && result <= val + 1) {
                cnt[index] += cnt[i];
            } else {
                result = val + 1;
                cnt[index] += cnt[i];
            }

        }

        dp[index] = result;
        return result;
    }
}
