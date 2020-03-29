package com.company.Contest182;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> freq = new HashMap<>();
        for (int elem : arr) {
            int count = freq.getOrDefault(elem, 0);
            freq.put(elem, count + 1);
        }

        int result = -1;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int elem = entry.getKey();
            int count = entry.getValue();
            if(elem == count) {
                result = Math.max(result, elem);
            }
        }
        return result;
    }
}
