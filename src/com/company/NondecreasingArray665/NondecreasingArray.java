package com.company.NondecreasingArray665;

public class NondecreasingArray {
    public boolean checkPossibility(int[] nums) {
        if(nums == null || nums.length == 1) return true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                int first = nums[i];
                int second = nums[i + 1];
                boolean check1 = check(nums, i, i + 1, first);
                nums[i+1] = second;
                boolean check2 = check(nums, i - 1, i, second);
                return check1 || check2;
            }
        }
        return true;
    }

    private boolean check(int[] nums, int start, int index, int number) {
        if (start == nums.length - 1) return true;
        nums[index] = number;
        if (start < 0) start = 0;
        for (int i = start; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) return false;
        }

        return true;
    }
}
