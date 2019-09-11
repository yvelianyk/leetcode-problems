package com.company.LongestIncreasingSubsequence300;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// TODO: https://leetcode.com/problems/longest-increasing-subsequence/
// is not optimal solution - use DP table bottom up
public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        int[][] memo = new int[nums.length][nums.length];
        for (int[] ints : memo) {
            Arrays.fill(ints, -1);
        }
        return traverse(nums, -1, 0, memo);
    }

    private int traverse(int[] nums, int prevIndex, int current,  int[][] memo) {
        if(current == nums.length) {
            return 0;
        }

        if(memo[prevIndex + 1][current] >= 0) {
            return memo[prevIndex + 1][current];
        }

        int taken = 0;
        if(prevIndex < 0 || nums[current] > nums[prevIndex]) {
            taken = 1 + traverse(nums, current, current + 1, memo);
        }
        int notTaken = traverse(nums, prevIndex, current + 1, memo);
        memo[prevIndex + 1][current] = Math.max(taken, notTaken);
        return memo[prevIndex + 1][current];
    }
}
