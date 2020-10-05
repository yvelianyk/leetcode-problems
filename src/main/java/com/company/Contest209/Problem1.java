package com.company.Contest209;

import java.util.Arrays;

public class Problem1 {
    public int specialArray(int[] nums) {
        if (nums.length == 0) return -1;
        int max = Arrays.stream(nums).max().getAsInt();
        for (int i = 1; i <= max; i++) {
            int count = 0;
            for (int num : nums) {
                if (num >= i) count++;
            }
            if (count == i) return i;
        }
        return -1;

    }
}
