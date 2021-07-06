package com.company.Contest192;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Problem2 {
    public int[] getStrongest(int[] arr, int k) {
        int[] arr2 = arr.clone();
        Arrays.sort(arr2);
        int[] result = new int[k];
        int medianIndex = (arr.length - 1) / 2;
        int median = arr2[medianIndex];
        PriorityQueue<Integer> pq = new PriorityQueue<>(new HeapComparator(median));
        for (int value : arr) {
            pq.add(value);
        }
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }
        return result;
    }

    class HeapComparator implements Comparator<Integer> {
        int median;
        HeapComparator(int median) {
            this.median = median;
        }
        @Override
        public int compare(Integer val1, Integer val2) {
            int r1 = Math.abs(val1 - median);
            int r2 = Math.abs(val2 - median);
            if (r1 == r2) {
                return val2 - val1;
            } else {
                return Integer.compare(r2, r1);
            }
        }
    }
}
