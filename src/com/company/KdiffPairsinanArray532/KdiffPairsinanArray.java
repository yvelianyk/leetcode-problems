package com.company.KdiffPairsinanArray532;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class KdiffPairsinanArray {
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0) return 0;
        Set<Integer> set = new HashSet<>();
        Set<Integer> unique = new HashSet<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
            } else {
                unique.add(nums[i]);
            }
        }
        if (k == 0) return unique.size();

        for (int i = 0; i < nums.length; i++) {
            int sum = k + nums[i];
            if (set.contains(sum)) {
                count++;
                set.remove(sum);
            }
        }

        return count;
    }

}
