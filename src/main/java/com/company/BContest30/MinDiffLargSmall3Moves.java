package com.company.BContest30;

import java.util.Arrays;

public class MinDiffLargSmall3Moves {
    public int minDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if (n < 5) return 0;
        int min1 = Math.min(nums[n - 1] - nums[3], nums[n - 2] - nums[2]);
        int min2 = Math.min(nums[n - 4] - nums[0], nums[n - 3] - nums[1]);
        return Math.min(min1, min2);
    }
}
