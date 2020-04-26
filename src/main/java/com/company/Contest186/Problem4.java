package com.company.Contest186;

import java.util.Arrays;

// TODO: TLE could be solved by priority queue and sliding window
public class Problem4 {
    Integer[] memo;
    int res = Integer.MIN_VALUE;
    public int constrainedSubsetSum(int[] nums, int k) {
        memo = new Integer[nums.length];
        getMax(nums, 0, k);
        return res;
    }

    private int getMax(int[] nums, int start, int k) {
        if (start == nums.length - 1) return nums[start];
        if (memo[start] != null) return memo[start];

        int result = nums[start];
        int end = Math.min(start + k, nums.length - 1);
        for (int i = start + 1; i <= end; i++) {
            int max = getMax(nums, i, k);
            result = Math.max(result, nums[start] + max);
        }
        memo[start] = result;
        res = Math.max(res, result);
        return result;
    }}
