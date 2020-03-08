package com.company.BContest21;

import java.util.*;

public class Problem3 {
    public String sortString(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char aChar : chars) {
            int count = map.getOrDefault(aChar, 0);
            map.put(aChar, count + 1);
        }

        StringBuilder sb = new StringBuilder();
        boolean asc = true;
        boolean next = true;
        while (next) {
            Set<Character> treeSet = new TreeSet<>();
            Set<Character> treeSetRev = new TreeSet<>((a, b) -> b - a);
            boolean isAllZero = true;
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                int count = entry.getValue();
                if (count > 0) isAllZero = false;
                if (count == 0) continue;
                entry.setValue(count - 1);
                if (asc) treeSet.add(entry.getKey());
                else treeSetRev.add(entry.getKey());
            }
            if (asc) {
                for (Character character : treeSet) sb.append(character);
            } else {
                for (Character character : treeSetRev) sb.append(character);
            }
            asc = !asc;
            next = !isAllZero;
        }

        return new String(sb);
    }
}
