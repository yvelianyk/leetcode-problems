package com.company.MinimumSwapsToStringsEqual1247;

import java.util.HashMap;
import java.util.Map;

public class MinimumSwapsToStringsEqual {
    public int minimumSwap(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        Map<Integer, Integer> map = new HashMap<>();
        int countX1 = 0;
        int countX2 = 0;
        int countY1 = 0;
        int countY2 = 0;
        for (int i = 0; i < chars2.length; i++) {
            char char1 = chars1[i];
            char char2 = chars2[i];
            if (char1 == 'x') countX1++;
            else countY1++;
            if (char2 == 'x') countX2++;
            else countY2++;

            if (char1 == 'x' && char2 == 'y') {
                int count0 = map.getOrDefault(0, 0);
                map.put(0, ++count0);
            }

            if (char1 == 'y' && char2 == 'x') {
                int count1 = map.getOrDefault(1, 0);
                map.put(1, ++count1);
            }
        }

        if (countX1 % 2 != countX2 % 2 || countY1 % 2 != countY2 % 2) return -1;

        int result = 0;
        int count0 = map.getOrDefault(0, 0);
        int count1 = map.getOrDefault(1, 0);
        int swaps0 = count0 / 2;
        int swaps1 = count1 / 2;
        result += swaps0;
        result += swaps1;
        int left1 = count0 - swaps0 * 2;
        int left2 = count1 - swaps1 * 2;
        if (left1 == 1 && left2 == 1) {
            result += 2;
        }
        return result;

    }
}
