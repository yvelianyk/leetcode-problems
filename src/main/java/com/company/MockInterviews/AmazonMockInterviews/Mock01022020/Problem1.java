package com.company.MockInterviews.AmazonMockInterviews.Mock01022020;

import java.util.*;

// https://leetcode.com/problems/relative-sort-array/
public class Problem1 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        int[] result = new int[arr1.length];

        Map<Integer, Integer> countMap = new TreeMap<>();
        for (int i : arr2) {
            set.add(i);
        }

        for (int i : arr1) {
            int count = countMap.getOrDefault(i, 0);
            countMap.put(i, ++count);
        }

        int counter = 0;
        for (int i : arr2) {
            int count = countMap.get(i);
            do {
                result[counter++] = i;
                count--;
            } while (count > 0);
            countMap.remove(i);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int count = entry.getValue();
            do {
                result[counter++] = entry.getKey();
                count--;
            } while (count > 0);
        }

        return result;

    }
}
