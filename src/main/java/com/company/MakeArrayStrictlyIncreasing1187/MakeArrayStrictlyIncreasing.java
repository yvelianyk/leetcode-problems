package com.company.MakeArrayStrictlyIncreasing1187;

import java.util.*;

public class MakeArrayStrictlyIncreasing {
    TreeSet<Integer> set;
    Map<String, Integer> memo;
    public int makeArrayIncreasing(int[] arr1, int[] arr2) {
        set = new TreeSet<>();
        memo = new HashMap<>();
        for (int i : arr2) set.add(i);
        int result = getNumber(arr1, 0, -1);
        return result < 0 ? -1 : result;
    }

    private int getNumber(int[] arr1, int index, int prev) {
        if (index == arr1.length) return 0;
        String key = index + "#" + prev;
        if (memo.containsKey(key)) return memo.get(key);

        int curr = arr1[index];
        int result = Integer.MAX_VALUE;
        if (prev >= curr) {

            Integer minVal = set.higher(prev);
            if (minVal != null) {
                result = 1 + getNumber(arr1, index + 1, minVal);
            }

        } else {
            result = getNumber(arr1, index + 1, arr1[index]);
            Integer minVal = set.higher(prev);
            if (minVal != null) {
                result = Math.min(result, 1 + getNumber(arr1, index + 1, minVal));
            }
        }

        memo.put(key, result);
        return result;
    }
}
