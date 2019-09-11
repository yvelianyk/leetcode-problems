package com.company.MinimumSizeSubarraySum209;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int s, int[] nums) {
        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= s) {
                result = Integer.min(result, i + 1 - left);
                sum -= nums[left++];
            }
        }

        return result == Integer.MAX_VALUE ? 0 : result;

    }
}
