package com.company.PartitionalEqualSubsetSum416;

import java.util.Arrays;

public class PartitionalEqualSubsetSum {
    int[] nums;
    int[][] memo;
    int total;

    public boolean canPartition(int[] nums) {
        this.nums = nums;
        total = Arrays.stream(nums).sum();
        this.memo = new int[total / 2 + 1][nums.length];
        if (total % 2 == 1) return false;
        return get(0,0);
    }

    private boolean get(int sum, int index) {
        if (sum == total / 2) return true;
        if (sum > total / 2 || index == nums.length) return false;

        if (this.memo[sum][index] != 0) return this.memo[sum][index] == 1;
        boolean skip = get(sum, index + 1);
        boolean nonSkip = get(sum + nums[index], index + 1);
        this.memo[sum][index] = skip || nonSkip ? 1 : -1;
        return skip || nonSkip;
    }
}
