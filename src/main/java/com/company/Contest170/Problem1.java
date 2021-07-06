package com.company.Contest170;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {
    public String freqAlphabets(String s) {
        if(s == "") return s;
        Map<String, String> map = createMap();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (; i < s.length() - 2; i++) {
            char nextNext = s.charAt(i + 2);
            if (nextNext == '#') {
                String key = s.substring(i, i + 3);
                sb.append(map.get(key));
                i = i + 2;
                continue;
            }
            sb.append(map.get(Character.toString(s.charAt(i))));
        }

        for (;i < s.length(); i++) {
            sb.append(map.get(Character.toString(s.charAt(i))));
        }
        return new String(sb);
    }

    private Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        int count = 1;
        for (char letter = 'a'; letter <= 'z'; letter++, count++) {
            if (letter <= 'i') {
                map.put(Integer.toString(count), Character.toString(letter));
            } else {
                String numPart = Integer.toString(count);
                map.put(numPart.concat("#"), Character.toString(letter));
            }
        }
        return map;
    }
}
