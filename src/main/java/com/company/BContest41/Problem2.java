package com.company.BContest41;

import java.util.Arrays;

public class Problem2 {
    int[] nums;
    int sum;
    public int[] getSumAbsoluteDifferences(int[] nums) {
        this.nums = nums;
        sum = Arrays.stream(nums).sum();
        int[] pref = pref(nums);
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int left = countLeft(i, pref);
            int right = countRight(i, pref);
            result[i] = left + right;
        }

        return result;
    }

    private int[] pref(int[] nums) {
        int[] prefix = new int[nums.length + 1];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i - 1];
        }
        return prefix;
    }

    private int countLeft(int index, int[] pref) {
        int n = index;
        int innerSum = pref[index];
        return n * nums[index] - innerSum;
    }
    private int countRight(int index, int[] pref) {
        int n = nums.length - 1 - index + 1;
        int innerSum = sum - pref[index];
        return innerSum - (n * nums[index]);
    }
}
