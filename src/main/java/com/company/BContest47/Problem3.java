package com.company.BContest47;

import java.util.HashMap;
import java.util.Map;

// Got TLE but if using array instead of HashMap TLE is gone
// Weird problem
public class Problem3 {
    public int beautySum(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            Map<Character, Integer> counter = new HashMap<>();
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                int count = counter.getOrDefault(ch, 0);
                counter.put(ch, count + 1);
                result += calculate(counter);
            }
        }
        return result;
    }

    int calculate(Map<Character, Integer> counter) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
            int count = entry.getValue();
            if (count < min) {
               min = count;
            }
            if (count > max) {
                max = count;
            }
        }
        return max - min;
    }
}
