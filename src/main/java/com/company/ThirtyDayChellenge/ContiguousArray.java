package com.company.ThirtyDayChellenge;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int res = 0;
        map.put(0,0);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) count--;
            else count++;
            if(map.containsKey(count)) {
               res = Math.max(res, i + 1 - map.get(count));
            } else {
                map.put(count, i + 1);
            }
        }
        return res;
    }

}
