package com.company.UniqueNumberofOccurrences1207;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberofOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int number = map.getOrDefault(arr[i], 0);
            map.put(arr[i], number + 1);
        }

        Set<Integer> unique = new HashSet<>(map.values());
        return unique.size() == map.size();
    }
}
