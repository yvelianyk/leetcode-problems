package com.company.XKindDeckofCards914;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/
public class XKindDeckofCards {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i1 : deck) {
            int count = map.getOrDefault(i1, 0);
            map.put(i1, count + 1);
        }

        int prev = 0;
        int counter = 0;

        for (Integer value : map.values()) {
            if (counter == 0) {
                prev = value;
                counter++;
            } else {
                counter++;
                int bigger = Math.max(value, prev);
                int smaller = Math.min(value, prev);
                int gcdVal = gcd(bigger, smaller);
                if (gcdVal < 2) {
                    return false;
                }
                prev = value;
            }
        }
        return counter != 1 || prev != 1;
    }

    private int gcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcd(n2, n1 % n2);
    }
}
