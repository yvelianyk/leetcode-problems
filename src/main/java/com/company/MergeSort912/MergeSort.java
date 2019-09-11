package com.company.MergeSort912;

public class MergeSort {

    private int[] mergeSort(int[] nums, int left, int right) {
        int pivot = left + (right - left) / 2;
        if (left == right) return new int[]{nums[left]};

        int[] leftArr = mergeSort(nums, left, pivot);
        int[] rightArr = mergeSort(nums, pivot + 1, right);

        return merge(leftArr, rightArr);
    }

    private int[] merge(int[] a, int[] b) {
        int first = 0;
        int second = 0;
        int[] result = new int[a.length + b.length];

        int i = 0;
        while ((first + second) < (a.length + b.length)) {
            second = second == b.length ? -1 : second;
            first = first == a.length ? -1 : first;
            if (first == -1 && second == -1) break;
            if (second == -1) {
                result[i++] = a[first++];
                continue;
            }
            if (first == -1) {
                result[i++] = b[second++];
                continue;
            }

            if (a[first] <= b[second]) {
                result[i++] = a[first];
                first++;
            } else {
                result[i++] = b[second];
                second++;
            }
        }

        return result;
    }

    public int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

}
