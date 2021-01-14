package com.company.MaximumSizeSubarraySumEqualsK325;

import java.util.HashMap;
import java.util.Map;

public class MaximumSizeSubarraySumEqualsK {
//    public int maxSubArrayLen(int[] nums, int k) {
//        int result = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int inter = 0;
//            for (int j = i; j < nums.length; j++) {
//                inter += nums[j];
//                if (inter == k) {
//                    result = Math.max(result, j - i + 1);
//                }
//            }
//        }
//        return result;
//    }
    public int maxSubArrayLen(int[] nums, int k) {
        int result = 0;
        int[] prefix = new int[nums.length + 1];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i - 1];
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < prefix.length; i++) {
            int num = prefix[i] - k;
            map.putIfAbsent(prefix[i], i);
            if (map.containsKey(num)) {
                result = Math.max(result, i - map.get(num));
            }
        }
        return result;
    }
}
