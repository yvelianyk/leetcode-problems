package com.company.Challenges;

import java.util.HashMap;
import java.util.Map;

public class MaxNumberOfKSumPairs {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            int diff = k - num;
            if (map.containsKey(diff) && map.get(diff) > 0) {
                count++;
                map.put(diff, map.get(diff) - 1);
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        return count;
    }
}
