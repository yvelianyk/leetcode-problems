package com.company.Contest168;

import java.util.*;

// https://leetcode.com/problems/divide-array-in-sets-of-k-consecutive-numbers/
public class Problem2 {
    public boolean isPossibleDivide(int[] nums, int k) {
        if(nums.length % k != 0) return false;
        Map<Integer, Integer> map = new TreeMap<>();

        int iterations = (int) (nums.length / k);

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int count = map.getOrDefault(num, 0);
            map.put(num, count + 1);
        }

        Map<Integer, Integer> copy = new TreeMap<>();
        copy.putAll(map);

        for (int i = 0; i < iterations; i++) {
            List<Integer> result = new ArrayList<>();
            int count = 0;
            for (Integer integer : map.keySet()) {
                count++;
                if(count > k) {
                    break;
                }
                if(result.size() == 0) {
                    result.add(integer);
                    processCount(copy, integer);
                    continue;
                }
                int prev = result.get(result.size() - 1);
                if(integer == prev + 1) {
                    result.add(integer);
                }
                processCount(copy, integer);
            }
            map = new TreeMap<>();
            map.putAll(copy);
            if(result.size() != k) return false;
        }

        return map.size() == 0 && copy.size() == 0;
    }

    private void processCount(Map<Integer, Integer> map, Integer integer) {
        int count = map.get(integer);
        if (count == 1) {
            map.remove(integer);
        } else {
            map.put(integer, count - 1);
        }
    }
}
