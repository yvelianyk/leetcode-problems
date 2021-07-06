package com.company.FirstUniqeChar387;

import java.util.*;

public class FirstUniqueChar {
    public int firstUniqChar(String s) {
        char[] ss = s.toCharArray();
        Map<Character,Integer> stringMap = new HashMap<>();

        for (int i = 0; i < ss.length; i++) {
            if (stringMap.containsKey(ss[i])) {
                int counter = stringMap.get(ss[i]);
                stringMap.put(ss[i], ++counter);
            } else {
                stringMap.put(ss[i], 1);
            }
        }

        for (int i = 0; i < ss.length; i++) {
            int counter = stringMap.get(ss[i]);
            if(counter == 1) return i;
        }
        return -1;
    }

}
