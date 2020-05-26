package com.company.TargetSum494;

public class TargetSumA2 {
    int[] nums;
    Integer[][] memo;
    int S;

    public int findTargetSumWays(int[] nums, int S) {
        this.nums = nums;
        this.memo = new Integer[nums.length][2001];
        this.S = S;
        return getWays(0, 0);
    }

    private int getWays(int start, int sum) {
        int key = sum + 1000;
        if (start == this.nums.length) return sum == this.S ? 1 : 0;
        if (this.memo[start][key] != null) return this.memo[start][key];

        int current = nums[start];
        int ways1 = getWays(start + 1, sum + current);
        int ways2 = getWays(start + 1, sum - current);
        this.memo[start][key] = ways1 + ways2;
        return ways1 + ways2;
    }
}
