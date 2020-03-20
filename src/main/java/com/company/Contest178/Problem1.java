package com.company.Contest178;

import java.util.*;

public class Problem1 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        List<int[]> list = new ArrayList<>();
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            list.add(new int[]{num, i});
        }

        Collections.sort(list, (a, b) -> (b[0] - a[0]));
        Map<Integer, Integer> indices = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
              int[] ints = list.get(i);
              indices.put(ints[0], list.size() - i - 1);
        }
        for (int[] ints : list) result[ints[1]] = indices.get(ints[0]);

        return result;
    }
}
