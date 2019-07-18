package com.company.KthLargestElementinArray215;

import java.util.Random;

public class KthLargestElementinArray {

    // QUICK SORT APPROACH:
    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, k);
    }

    private int quickSelect(int[] nums, int left, int right, int k) {
        if (left == right) return nums[left];
        while (left < right) {
            int pivot = partition(nums, left, right);
            int kthIndex = nums.length - k;
            if (pivot == kthIndex) {
                return nums[pivot];
            }
            if (pivot > kthIndex) {
                return quickSelect(nums, left, pivot - 1, k);
            } else {
                return quickSelect(nums, pivot + 1, right, k);
            }
        }
        return 0;
    }

    private int partition (int[] nums, int left, int right) {
        Random random_num = new Random();
        int pivot_index = left + random_num.nextInt(right - left);
        int pivot = nums[pivot_index];

        swap(pivot_index, right, nums);
        int store_index = left;

        for (int i = left; i <= right; i++) {
            if (nums[i] < pivot) {
                swap(store_index, i, nums);
                store_index++;
            }
        }

        swap(store_index, right, nums);

        return store_index;
    }

    private void swap(int left, int right, int[] nums) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }




    // HEAP APPROACH:
//    public int findKthLargest(int[] nums, int k) {
//
//        Queue<Integer> heap = new PriorityQueue<>((n1, n2) -> n1 - n2);
//
//        for (int i = 0; i < nums.length; i++) {
//            int num = nums[i];
//            heap.add(num);
//            if(heap.size() > k) {
//                heap.poll();
//            }
//        }
//        return heap.poll();
//    }
}
