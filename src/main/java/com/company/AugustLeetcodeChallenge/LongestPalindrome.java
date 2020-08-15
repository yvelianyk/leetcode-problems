package com.company.AugustLeetcodeChallenge;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        Map<Character, Integer> count = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars)
            count.put(aChar, count.getOrDefault(aChar, 0) + 1);

        int result = 0;
        boolean hasEven = false;

        for (Integer value : count.values()) {
            if (count.size() == 1) return value;
            if (value % 2 == 0) result += value;
            if (value % 2 != 0) {
                result += value - 1;
                hasEven = true;
            }
        }
        if (hasEven) {
            result++;
        }

        return result;
    }
}
