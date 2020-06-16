package com.company.BurstBaloons312;

// TODO: super hard problem for me, but very interesting. Need to think out of the box.
public class BurstBaloons {
    int[][] memo;
    int[] nums;
    public int maxCoins(int[] nums) {
        int n = nums.length + 2;
        int[] new_nums = new int[n];

        for(int i = 0; i < nums.length; i++){
            new_nums[i+1] = nums[i];
        }

        new_nums[0] = new_nums[n - 1] = 1;
        this.nums = new_nums;
        memo = new int[n][n];
        return getMax(0, n - 1);
    }

    private int getMax(int left, int right) {
        if (left + 1 == right) return 0;
        int result = Integer.MIN_VALUE / 2;
        for (int i = left + 1; i < right; i++) {
            int leftMax = getMax(left, i);
            int rightMax = getMax(i, right);
            int current = nums[left] * nums[i] * nums[right];
            result = Math.max(result, leftMax + rightMax + current);
        }
        return result;
    }
}
