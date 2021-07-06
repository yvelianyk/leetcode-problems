package com.company.MaximumSubarray53;

public class MaximumSubarrayDP {
    private int[] nums;
    private int n;
    private int result;

    public int maxSubArray(int[] nums) {
        this.n = nums.length;
        this.nums = nums;
        result = nums[0];
        getMax(n - 1);
        return result;
    }

    private int getMax(int index) {
        if (index == 0) return nums[index];
        int prevMax = getMax(index - 1);
        int sum = nums[index] + prevMax;
        int innerMax = Math.max(nums[index], sum);
        result = Math.max(result, innerMax);
        return innerMax;
    }

}
