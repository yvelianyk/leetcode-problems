package com.company.ThreeSumClosest16;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int sum = nums[0] + nums[1] + nums[nums.length - 1];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int innerSum = nums[i] + nums[j] + nums[k];
                if (innerSum > target) {
                    k--;
                } else {
                    j++;
                }
                int targetSum = Math.abs(target - innerSum);
                int oldSum = Math.abs(target - sum);
                if (targetSum <= oldSum) {
                    sum = innerSum;
                }
            }
        }

        return sum;
    }
}
