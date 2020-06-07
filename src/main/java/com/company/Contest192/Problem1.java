package com.company.Contest192;

public class Problem1 {
    public int[] shuffle(int[] nums, int n) {
        int left = 0;
        int right = n;
        int[] newArr = new int[nums.length];
        for (int i = 0; i < newArr.length; i++) {
            int newElemIndex = i % 2 == 0 ? left++ : right++;
            newArr[i] = nums[newElemIndex];
        }

        return newArr;
    }
}
