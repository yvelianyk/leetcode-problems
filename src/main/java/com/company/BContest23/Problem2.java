package com.company.BContest23;

import java.util.HashMap;
import java.util.Map;

public class Problem2 {
    public boolean canConstruct(String s, int k) {
        if (s.length() < k) return false;
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            int count = map.getOrDefault(aChar, 0);
            map.put(aChar, count + 1);
        }

        int oddCount = 0;
        for (Integer value : map.values()) {
            if (value % 2 == 1) oddCount++;
        }

        return oddCount <= k;
    }
}
