package com.company.MaximumSubarray53;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int elem = nums[i];
            int inSum = elem + sum;
            sum = Math.max(elem, inSum);
            res = Math.max(sum, res);
        }
        return res;
    }
}
