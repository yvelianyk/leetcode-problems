package com.company.MaxConsecutiveOnes485;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num == 1) count++;
            if (num == 0) {
                if (max < count) max = count;
                count = 0;
            }
        }
        if (max < count) max = count;

        return max;
    }
}
