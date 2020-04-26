package com.company.Contest186;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {
    public int maxScore(String s) {
        Map<Integer, Integer> zeroes = new HashMap<>();
        Map<Integer, Integer> ones = new HashMap<>();

        int zeroesCount = 0;
        int onesCount = 0;
        for (int i = 0; i < s.length(); i++) {
             if(s.charAt(i) == '0') {
                 ones.put(i, onesCount);
                 zeroes.put(i, ++zeroesCount);
             } else {
                 ones.put(i, ++onesCount);
                 zeroes.put(i, zeroesCount);
             }
        }

        int result = Integer.MIN_VALUE;
        int onesC = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) == '1') {
                onesC++;
            }
            result = Math.max(result, zeroes.get(i) + onesCount - onesC);
        }
        return result;
    }
}
