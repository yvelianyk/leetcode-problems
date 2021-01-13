package com.company.Challenges;

import java.util.TreeMap;

public class BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int p : people) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        int result = 0;
        while (!map.isEmpty()) {
            int i = map.lastKey();
            if (map.get(i) == 1) {
                map.remove(i);
            } else {
                map.put(i, map.get(i) - 1);
            }
            int remain = limit - i;
            Integer j = map.floorKey(remain);
            if (j != null) {
                if (map.get(j) == 1) {
                    map.remove(j);
                } else {
                    map.put(j, map.get(j) - 1);
                }
            }
            result++;
        }
        return result;
    }
}
