package com.company.LongestSubstringRepeating3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringRepeating {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 1 || s.length() == 0) return s.length();
        Set<Character> set = new HashSet<>();

        int i = 0;
        int j = 0;
        int n = s.length();
        int max = 0;
        while (i < n && j < n) {
            if (set.contains(s.charAt(j))) {
                set.remove(s.charAt(i++));
            } else {
                set.add(s.charAt(j++));
                max = Math.max(max, j - i);
            }
        }

        return max;

    }
}
