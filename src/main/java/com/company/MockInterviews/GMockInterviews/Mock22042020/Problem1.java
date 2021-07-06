package com.company.MockInterviews.GMockInterviews.Mock22042020;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Problem1 {
    private Set<String> result;
    public int numTilePossibilities(String tiles) {
        result = new HashSet<>();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < tiles.length(); i++) {
             map.put(tiles.charAt(i), map.getOrDefault(tiles.charAt(i), 0) + 1);
        }

        for (int i = 1; i <= tiles.length(); i++) {
            permute(0, map, i, new StringBuilder());
        }
        return result.size();
    }

    private void permute (int index, Map<Character, Integer> map, int length, StringBuilder sb) {
        if (index == length) result.add(new String(sb));
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
           Character chars = entry.getKey();
           int value = entry.getValue();
           if (value <= 0) continue;
           sb.append(chars);
           entry.setValue(entry.getValue() - 1);
           permute(index + 1, map, length, sb);
           entry.setValue(entry.getValue() + 1);
           sb.deleteCharAt(sb.length() - 1);
        }
    }
}
