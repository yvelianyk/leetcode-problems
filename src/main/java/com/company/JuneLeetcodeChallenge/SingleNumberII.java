package com.company.JuneLeetcodeChallenge;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberII {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet())
            if (entry.getValue() == 1) return entry.getKey();
        return 1;
    }
}
