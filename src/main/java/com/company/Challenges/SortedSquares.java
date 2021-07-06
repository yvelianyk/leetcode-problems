package com.company.Challenges;

import java.util.Arrays;

public class SortedSquares {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = nums[i] * nums[i];
        }
       Arrays.sort(result);
        return result;
    }
}
