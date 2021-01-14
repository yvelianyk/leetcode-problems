package com.company.Challenges;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinOperationsToReduceXToZero {
    public int minOperations(int[] nums, int x) {
        int total = Arrays.stream(nums).sum();
        int k = total - x;
        int[] prefixSum = new int[nums.length + 1];
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }
        Map<Integer, Integer> map = new HashMap<>();
        int result = -1;
        for (int i = 0; i < prefixSum.length; i++) {
            int pref = prefixSum[i];
            map.putIfAbsent(pref, i);
            if (map.containsKey(pref - k)) {
               result = Math.max(result, i - map.get(pref - k));
            }
        }
        if (result == -1) return -1;
        return nums.length - result;
    }
}
