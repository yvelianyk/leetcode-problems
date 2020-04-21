package com.company.MockInterviews.GMockInterviews.Mock21042020;

public class Problem1 {
    public int findPeakElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int next = i == nums.length - 1 ? Integer.MIN_VALUE : nums[i + 1];
            int prev = i == 0 ? Integer.MIN_VALUE : nums[i - 1];
            if (num > prev && num > next) return i;
        }
        return 0;
    }
}
