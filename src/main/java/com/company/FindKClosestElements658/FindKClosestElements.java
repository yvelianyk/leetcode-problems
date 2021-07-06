package com.company.FindKClosestElements658;

import java.util.ArrayList;
import java.util.List;

public class FindKClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();

        if(x <= arr[0]) {
            for (int i = 0; i < k; i++) result.add(arr[i]);
            return result;
        }
        if(x >= arr[arr.length - 1]) {
            for (int i = arr.length - k; i < arr.length; i++) result.add(arr[i]);
            return result;
        }


        int left = 0;
        int right = arr.length - 1;
        int pivot = 0;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= x && x <= arr[mid + 1]) {
                pivot = arr[mid] == x ? mid : mid + 1;
                left = mid + 1;
            }
            if (x > arr[mid]) left = mid + 1;
            if (x < arr[mid]) right = mid;
        }

        int low = pivot - k < 0 ? 0 : pivot - k;
        int high = pivot + k - 1 > arr.length - 1 ? arr.length - 1 : pivot + k - 1;

        while (high - low > k - 1) {
            if ((x - arr[low]) <= (arr[high] - x)) {
                high--;
            } else if ((x - arr[low]) > (arr[high] - x)) {
                low++;
            }
        }

        for (int i = low; i <= high; i++) result.add(arr[i]);

        return result;
    }
}
