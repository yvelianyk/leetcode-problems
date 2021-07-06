package com.company.QuickSort;

public class QuickSort {

    private int partition(int[] nums, int left, int right) {
        int i = left;
        int j = left;
        int pivot = right;

        while (j < pivot) {
            if(nums[j] <= nums[pivot]) {
                swap(nums, i, j);
                i++;
            }
            j++;
            if (j == pivot) swap(nums, i, pivot);
        }

        return i;
    }

    private void swap(int[] nums, int first, int last) {
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }

    private void quickSort(int[] nums, int left, int right) {
        if(left < right) {
            int pivot = partition(nums, left, right);
            quickSort(nums, left, pivot - 1);
            quickSort(nums, pivot + 1, right);
        }

    }

    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }
}
