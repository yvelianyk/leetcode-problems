package com.company.FindMinimuminRotatedSortedArrayII154;

public class FindMinimuminRotatedSortedArrayII {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[right] < nums[mid]) {
                left = mid;
            } else if(nums[right] > nums[mid]) {
                right = mid;
            } else {
                right--;
            }
        }

        return Math.min(nums[right], nums[left]);
    }
}
