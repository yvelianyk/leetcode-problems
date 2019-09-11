package com.company.ValidAnagram242;

import java.util.HashMap;
import java.util.Map;

// you can use int array with c-'a' indices for counting
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        char[] target = t.toCharArray();
        if(chars.length != target.length) return false;
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if(map.containsKey(aChar)) {
                int number = map.get(aChar);
                map.put(aChar, ++number);
            } else {
                map.put(aChar, 1);
            }
        }


        for (int i = 0; i < target.length; i++) {
            char c = target[i];
            if(map.containsKey(c)) {
                int number = map.get(c);
                number--;
                if(number == 0) {
                    map.remove(c);
                } else {
                    map.put(c, number);
                }
            }
        }

        return map.size() == 0;
    }
}
