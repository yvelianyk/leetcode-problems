package com.company.IntersectionofTwoArraysII350;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionofTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nums1Map = new HashMap<Integer, Integer>();
        List<Integer> resultList = new ArrayList<Integer>();

        for(int val : nums1) {
            if(nums1Map.containsKey(val)) {
                int curr = nums1Map.get(val);
                curr++;
                nums1Map.put(val, curr);
            } else {
                nums1Map.put(val, 1);
            }
        }

        for(int val: nums2) {
            if(nums1Map.containsKey(val)) {
                int number = nums1Map.get(val);
                if (number > 0) {
                    resultList.add(val);
                    number--;
                    nums1Map.put(val, number);
                }
            }
        }

        int resultSize = resultList.size();
        int[] result = new int[resultSize];
        for(int i = 0; i < resultSize; i++) result[i] = resultList.get(i);

        return result;
    }
}
