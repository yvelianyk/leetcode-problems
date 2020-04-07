package com.company.ThirtyDayChellenge;

import java.util.HashMap;
import java.util.Map;

public class CountingNumbers {
    public int countElements(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i : arr) {
            int count = countMap.getOrDefault(i, 0);
            countMap.put(i, count + 1);
        }

        int result = 0;
        for (int i : arr) {
            if (countMap.getOrDefault(i + 1, 0) > 0) {
                result++;
            }
        }
        return result;
    }
}
