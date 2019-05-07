package com.company.MajorityElement169;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
        int numLength = nums.length;
        int result = nums[0];
        for(int num : nums) {
            if(numsMap.containsKey(num)) {
                int numValue = numsMap.get(num);
                numsMap.put(num, ++numValue);
                if (numValue > numLength / 2) result = num;
            } else {
                numsMap.put(num, 1);
            }
        }
        return result;
    }
}
