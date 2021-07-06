package com.company.BContest28;

import java.util.HashMap;
import java.util.Map;

// TODO: HARD PROBLEM FOR ME
public class Problem3 {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int[] prefixSums = new int[n + 1];
        int[] memo = new int[n + 1];
        int currMinLength = Integer.MAX_VALUE / 2;
        int result = Integer.MAX_VALUE / 2;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < prefixSums.length; i++) {
            if (i > 0) prefixSums[i] = prefixSums[i - 1] + arr[i - 1];
            if (map.containsKey(prefixSums[i] - target)) {
                int prevIndex = map.get(prefixSums[i] - target);
                currMinLength = Math.min(currMinLength, i - prevIndex);
                result = Math.min(result, i - prevIndex + memo[prevIndex]);
            }
            memo[i] = currMinLength;
            map.put(prefixSums[i], i);
        }
        return result == Integer.MAX_VALUE / 2 ? -1 : result;
    }
}
