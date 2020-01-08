package com.company.MockInterviews.AmazonMockInterviews.Mock01082020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem2 {
    public List<Integer> partitionLabels(String S) {
        if (S == null || S.length() == 0) return null;
        Map<Character, Integer> lastMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            lastMap.put(chars[i], i);
        }

        int start = 0;
        int end = 0;
        for (int i = 0; i < chars.length; i++) {
            end = Math.max(end, lastMap.get(chars[i]));
            if (end == i) {
                result.add(end - start + 1);
                start = end + 1;
            }
        }

        return result;
    }
}
