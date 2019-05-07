package com.company.MoveZeroes283;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int write = 0;
        for(int read = 0; read < nums.length; read++) {
            if (nums[read] != 0) {
                int temp = nums[write];
                nums[write++] = nums[read];
                nums[read] = temp;
            }
        }
    }
}
