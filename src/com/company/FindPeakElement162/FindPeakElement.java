package com.company.FindPeakElement162;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            int midRight = mid + 1;
            if (nums[midRight] > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
