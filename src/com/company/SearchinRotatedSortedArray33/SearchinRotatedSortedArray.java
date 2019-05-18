package com.company.SearchinRotatedSortedArray33;

public class SearchinRotatedSortedArray {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) return mid;
            if(nums[left] == target) return left;
            if(nums[right] == target) return right;

            // if left part is sorted correctly
            if (nums[left] < nums[mid]) {
                if (target < nums[mid] && target > nums[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else
            // if right part is sorted correctly
            {
                if (target > nums[mid] && target < nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
