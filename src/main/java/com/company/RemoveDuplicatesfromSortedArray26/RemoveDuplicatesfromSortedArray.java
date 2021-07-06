package com.company.RemoveDuplicatesfromSortedArray26;

public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int write = 0;
        int prev = nums[nums.length - 1];

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != prev) {
                nums[write++] = nums[i];
                prev = nums[i];
            }
        }

        return write == 0 ? 1 : write;
    }
}
