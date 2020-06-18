package com.company.MaximumProductSubarray152;

public class MaximumProductSubarray {


    public int maxProduct(int[] nums) {
        int n = nums.length;
        int[] mins = new int[n];
        int[] maxs = new int[n];
        int result = nums[0];
        mins[0] = maxs[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            int minNum = num * mins[i - 1];
            int maxNum = num * maxs[i - 1];
            mins[i] = Math.min(num, Math.min(minNum, maxNum));
            maxs[i] = Math.max(num, Math.max(minNum, maxNum));
            result = Math.max(result, Math.max(mins[i], maxs[i]));
        }
        return result;
    }

}
