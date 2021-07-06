package com.company.Contest193;

import java.util.*;

public class Problem2 {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int value : arr) {
            int count = map.getOrDefault(value, 0);
            map.put(value, count + 1);
        }
        List<Integer> unique = new ArrayList<>();
        for (Integer value : map.keySet()) unique.add(value);
        Collections.sort(unique, new CustomComparator(map));
        int result = unique.size();
        for (Integer integer : unique) {
            int counter = map.get(integer);
            if (counter <= k) {
                result -= 1;
                k -= counter;
            }
        }
        return result;
    }

    private class CustomComparator implements Comparator<Integer> {
        private Map<Integer, Integer> map;

        public CustomComparator(Map<Integer, Integer> freq) {
            this.map = freq;
        }

        @Override
        public int compare(Integer integer, Integer t1) {
            return map.get(integer).compareTo(map.get(t1));
        }
    }
}
