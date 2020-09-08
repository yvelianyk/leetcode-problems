package com.company.AugustLeetcodeChallenge;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] splitted = str.split("\\s");
        if (pattern.length() != str.length()) return false;
        Map<String, Character> map = new HashMap<>();
        Map<Character, String> map2 = new HashMap<>();
        int count = 0;
        for (String s : splitted) {
            char key = pattern.charAt(count++);
            if (map.containsKey(s)) {
                if (!map.get(s).equals(key)) return false;
            } else {
                map.put(s, key);
            }
        }
        count = 0;
        for (String s : splitted) {
            char key = pattern.charAt(count++);
            if (map2.containsKey(key)) {
                if (!map2.get(key).equals(s)) return false;
            } else {
                map2.put(key, s);
            }
        }
        return true;
    }
}
