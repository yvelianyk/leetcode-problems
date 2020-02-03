package com.company.Contest174;

import java.util.*;

public class Problem2 {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }
        List<Integer> list = new ArrayList<>(freq.keySet());
        list.sort(new CustomComparator(freq));

        int count = 0;
        int numbers = 0;
        for (Integer integer : list) {
            count++;
            int number = freq.get(integer);
            numbers += number;
            if (numbers >= arr.length / 2) {
                return count;
            }
        }
        return count;

    }

    private class CustomComparator implements Comparator<Integer> {
        private Map<Integer, Integer> freq;

        public CustomComparator(Map<Integer, Integer> freq) {
            this.freq = freq;
        }

        @Override
        public int compare(Integer integer, Integer t1) {
            if (freq.get(integer) > freq.get(t1)) return -1;
            if (freq.get(integer) < freq.get(t1)) return 1;
            return 0;
        }
    }
}
