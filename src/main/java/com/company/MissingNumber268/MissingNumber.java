package com.company.MissingNumber268;

import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum = Arrays.stream(nums).sum(), fullSum = 0;
        for(int i = 0; i <= nums.length; i++) fullSum += i;
        return fullSum - sum;
    }
}
