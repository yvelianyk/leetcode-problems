package com.company.SortColors75;

// https://leetcode.com/problems/sort-colors/
public class SortColors {

    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int counter = 0;
        while (counter <= right) {
            int num = nums[counter];
            if (num == 0) {
                swap(counter++, left++, nums);
            } else if (num == 2) {
                swap(counter, right--, nums);
            } else {
                counter++;
            }
        }
    }

    private void swap(int left, int right, int[] nums) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
