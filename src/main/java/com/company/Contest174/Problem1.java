package com.company.Contest174;

import java.util.*;

public class Problem1 {
    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < mat.length; i++) {
            int[] ints = mat[i];
            int countOnes = 0;
            for (int j = 0; j < ints.length; j++) {
                if (ints[j] == 1) countOnes++;
            }
            freq.put(i, countOnes);
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            res.add(i);
        }

        Collections.sort(res, new CustomComparator(freq));

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = res.get(i);
        }
        return result;
    }

    private class CustomComparator implements Comparator<Integer> {
        private Map<Integer, Integer> freq;
        public CustomComparator(Map<Integer, Integer> freq) {
            this.freq = freq;
        }

        @Override
        public int compare(Integer integer, Integer t1) {
            if (freq.get(integer) > freq.get(t1)) return 1;
            if (freq.get(integer) < freq.get(t1)) return -1;
            if (freq.get(integer).equals(freq.get(t1))){
                return integer - t1;
            }
            return 0;
        }
    }
}
