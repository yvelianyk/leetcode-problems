package com.company.BContest24;

public class Problem1 {
    public int minStartValue(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        int min = Integer.MAX_VALUE;
        for (int value : prefix) {
            min = Math.min(min, value);
        }

        if(min < 0) return 1 + Math.abs(min);
        return 1;
    }
}
