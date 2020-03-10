package com.company.MockInterviews.GMockInterviews.Mock10032020;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {
    public boolean checkRecord(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char aChar : chars) {
            map.put(aChar, map.getOrDefault(aChar, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getKey() == 'A' && entry.getValue() > 1) return false;
        }

        int left = 0;
        int right = 0;
        while (right < chars.length) {
            if(chars[left] != 'L') {
                left++;
                right++;
                continue;
            }

            if(chars[left] == 'L' && chars[right] == 'L'){
                right++;
            } else {
                left = right;
            }

            if(right - left > 2) return false;
        }
        return true;

    }
}
