package com.company.FirstUniqeChar387;

import java.util.*;

public class FirstUniqueChar {
    public int firstUniqChar(String s) {
        char[] ss = s.toCharArray();
        Map<Character,Integer> stringMap = new HashMap<Character,Integer>();
        Set<Character> removeSet = new HashSet<Character>();

        for (int i = 0; i < ss.length; i++) {
            if (!stringMap.containsKey(ss[i])) {
                stringMap.put(ss[i], i);
            } else {
                removeSet.add(ss[i]);
            }
        }

        for (Character removeChar : removeSet) {
            stringMap.remove(removeChar);
        }

        if(stringMap.isEmpty()) {
            return -1;
        } else {
            SortedSet<Integer> valuesSet = new TreeSet<>(stringMap.values());
            return valuesSet.first();
        }

    }

}
