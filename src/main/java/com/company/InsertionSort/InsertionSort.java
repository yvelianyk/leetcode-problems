package com.company.InsertionSort;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {
    public List<Integer> sortArray(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int N = nums.length;
        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0; j--) {
                if(nums[j] < nums[j-1]) {
                    swap(nums, j, j - 1);
                } else break;
            }
        }
        for (int num : nums) result.add(num);
        return result;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
