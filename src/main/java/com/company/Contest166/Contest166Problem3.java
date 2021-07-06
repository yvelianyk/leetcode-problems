package com.company.Contest166;

public class Contest166Problem3 {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            max = Math.max(max, num);
        }

        int left = 0;
        int rigth = max;
        int result = 1;
        while (left <= rigth) {
            int mid = left + (rigth - left) / 2;
            int sum = sum(nums, mid);
            if (sum > threshold) {
                left = mid + 1;
            } else {
                result = mid;
                rigth = mid - 1;
            }
        }
        return result;
    }

    private int sum(int[] nums, int divisor) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            result += Math.ceil(num / (float) divisor);
        }
        return result;
    }
}
