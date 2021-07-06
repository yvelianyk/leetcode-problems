package com.company.FindPivotIndex724;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int total = 0;
        int leftSum = 0;
        for(int i = 0; i < nums.length; i++) total += nums[i];

        for(int i = 0; i < nums.length; i++) {
            int rightSum = total - nums[i] - leftSum;
            if (leftSum == rightSum) return i;
            leftSum += nums[i];
        }

        return -1;
    }
}
