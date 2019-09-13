package com.company.GroupShiftedStrings249;

import java.util.*;

public class GroupShiftedStrings {
    public List<List<String>> groupStrings(String[] strings) {
        Map<String, List<String>> resultMap = new HashMap<>();
        for (String string : strings) {
            String key = getKey(string);
            List<String> list = resultMap.getOrDefault(key, new ArrayList<>());
            list.add(string);
            resultMap.put(key, list);
        }

        return new ArrayList<>(resultMap.values());
    }

    private String getKey(String string) {
        char[] chars = string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < chars.length; i++) {
            int diff = chars[i] - chars[i - 1];
            int key = diff < 0 ? diff + 26 : diff;
            sb.append(key);
            sb.append(",");
        }
        return sb.toString();
    }
}
