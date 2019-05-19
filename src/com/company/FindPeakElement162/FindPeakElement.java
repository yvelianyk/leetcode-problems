package com.company.FindPeakElement162;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            double midLeft = mid == 0 ? Double.NEGATIVE_INFINITY : nums[mid - 1];
            double midRight = mid == nums.length - 1 ? Double.NEGATIVE_INFINITY : nums[mid + 1];
            if (nums[mid] > midLeft && nums[mid] > midRight) return mid;
            if (midRight > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
