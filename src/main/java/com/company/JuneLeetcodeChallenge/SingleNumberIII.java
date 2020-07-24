package com.company.JuneLeetcodeChallenge;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums)
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        int[] result = new int[2];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet())
            if (entry.getValue() == 1) result[index++] = entry.getKey();
        return result;
    }
}
