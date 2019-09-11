package com.company.FindMinimuminRotatedSortedArray153;

public class FindMinimuminRotatedSortedArray {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int min = nums[0];
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[left] <= nums[mid]) {
               if (min > nums[left]) min = nums[left];
               left = mid + 1;
            } else {
               if (min > nums[right]) min = nums[right];
               right = mid;
            }
        }

        if(nums[left] < min) min = nums[left];
        return min;
    }
}
