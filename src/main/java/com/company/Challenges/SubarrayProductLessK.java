package com.company.Challenges;

public class SubarrayProductLessK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int n = nums.length, i = 0, j = 0, curr = 1, result = 0;
        while (j < n) {
            curr *= nums[j];
            while (curr >= k) curr /= nums[i++];
            result += j - i + 1;
            j++;
        }
        return result;
    }
}
