package com.company.WaysToSplitIntoThreeSubArrays;

// TODO:
public class WaysToSplit {
    int[] nums;
    int[] prefixSum;
    public int waysToSplit(int[] nums) {
        this.nums = nums;
        this.buildPrefix();
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int res = nums.length /3;
                if (i > nums.length / 3) continue;
                if (j > (nums.length / 3) * 2) continue;
                int left = getSum(0, i);
                int mid = getSum(i + 1, j);
                int right = getSum(j + 1, nums.length - 1);
                if (left <= mid && mid <= right) {
                    result++;
                }
            }
        }
        return result;
    }

    private void buildPrefix() {
        prefixSum = new int[nums.length + 1];
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }
    }

    private int getSum(int start, int end) {
        return prefixSum[end + 1] - prefixSum[start];
    }

}
