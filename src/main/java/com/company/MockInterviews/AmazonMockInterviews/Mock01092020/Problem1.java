package com.company.MockInterviews.AmazonMockInterviews.Mock01092020;

import java.util.*;

// https://leetcode.com/problems/two-sum/
public class Problem1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) map.put(nums[i], i);

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;
            if(map.containsKey(diff) && i != map.get(diff)) {
                return new int[]{i, map.get(diff)};
            }
        }

        return new int[]{};
    }

}
