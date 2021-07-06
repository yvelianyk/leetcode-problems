package com.company.JumpGame55;

import java.util.Arrays;

public class JumpGameTopDown {
    int[] memo;
    public boolean canJump(int[] nums) {
        memo = new int[nums.length];
        Arrays.fill(memo, -1);
        return canJumpFromPos(0, nums);
    }

    private boolean canJumpFromPos(int position, int[] nums) {
        if (position == nums.length - 1) return true;
        if (memo[position] != -1) {
            return memo[position] == 1;
        }
        int length = nums[position];
        int max = Math.min(position + length, nums.length - 1);
        for (int i = position + 1; i <= max; i++) {
            if (canJumpFromPos(i, nums)) {
                memo[position] = 1;
                return true;
            }
        }
        memo[position] = 0;
        return false;
    }
}
