package com.company.BContest20;

import java.util.*;

public class Problem1 {
    public int[] sortByBits(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) list.add(i);
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer integer : list) map.put(integer, bitCount(integer));

        Collections.sort(list, new CustomComparator(map));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }

    private int bitCount(int n) {
        return Integer.bitCount(n);
    }

    private class CustomComparator implements Comparator<Integer> {
        private Map<Integer, Integer> map;
        public CustomComparator(Map<Integer, Integer> freq) {
            this.map = freq;
        }

        @Override
        public int compare(Integer integer, Integer t1) {
            if (map.get(integer) > map.get(t1)) return 1;
            if (map.get(integer) < map.get(t1)) return -1;
            if (map.get(integer).equals(map.get(t1))){
                return integer - t1;
            }
            return 0;
        }
    }
}
