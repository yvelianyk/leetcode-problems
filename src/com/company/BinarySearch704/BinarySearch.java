package com.company.BinarySearch704;

public class BinarySearch {

    // =========================================================
    // ITERATIVE:
    // =========================================================
    public int search(int[] nums, int target) {
        if (nums == null) return -1;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) return mid;
            if (target > nums[mid]) {
               left = mid + 1;
            } else {
               right = mid - 1;
            }
        }
        return -1;
    }

    // =========================================================
    // RECURSIVE:
    // =========================================================
//    public int search(int[] nums, int target) {
//        if (nums == null) return -1;
//        return bSearch(nums, 0, nums.length - 1, target);
//    }
//
//    private int bSearch(int[] nums, int start, int end, int target) {
//        int mid = start == end ? start : start + (end - start) / 2;
//        if(nums[mid] == target) return mid;
//        if(start == end) return -1;
//        if(target > nums[mid]) return bSearch(nums, mid + 1, end, target);
//        if(target < nums[mid]) return bSearch(nums, start, mid, target);
//        return -1;
//    }
}
