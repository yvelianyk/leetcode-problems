package com.company.ThreeSum15;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                List<Integer> innerResult = new ArrayList<>();
                int sum = nums[i] + nums[start] + nums[end];
                if (sum == 0) {
                    innerResult.add(nums[i]);
                    innerResult.add(nums[start]);
                    innerResult.add(nums[end]);
                    if(!result.contains(innerResult)) {
                        result.add(innerResult);
                        res.add(innerResult);
                    }
                }

                if(sum > 0) {
                    end--;
                } else {
                    start++;
                }
            }
        }

        return res;

    }
}
