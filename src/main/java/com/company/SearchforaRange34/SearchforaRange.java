package com.company.SearchforaRange34;

public class SearchforaRange {
    public int[] searchRange(int[] nums, int target) {
        int left = getLeft(nums, target);
        int right = getRight(nums, target);

        return new int[]{left, right};
    }

    private int getLeft(int nums[], int target) {
        if (nums == null || nums.length == 0) return -1;
        int left = 0;
        int right = nums.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                if (nums[mid - 1] < nums[mid]) {
                    return mid;
                } else {
                    right = mid;
                }
            }

            if (target > nums[mid]) {
                left = mid;
            } else {
                right = mid;
            }
        }

        if (nums[left] < nums[right]) {
            if (nums[right] == target) return right;
        }
        if (nums[left] == target) return left;

        return -1;
    }

    private int getRight(int nums[], int target) {
        if (nums == null || nums.length == 0) return -1;
        int left = 0;
        int right = nums.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                if (nums[mid + 1] > nums[mid]) {
                    return mid;
                } else {
                    left = mid;
                }
            }

            if (target > nums[mid]) {
                left = mid;
            }
            if (target < nums[mid]) {
                right = mid;
            }
        }

        if (nums[left] < nums[right]) {
            if (nums[left] == target) return left;
        }
        if (nums[right] == target) return right;

        return -1;

    }
}
