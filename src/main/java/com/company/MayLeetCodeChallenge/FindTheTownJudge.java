package com.company.MayLeetCodeChallenge;

import java.util.*;

public class FindTheTownJudge {
    public int findJudge(int N, int[][] trust) {
        if (N == 1 && trust.length == 0) return 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] ints : trust) {
            int current = map.getOrDefault(ints[1], 0);
            map.put(ints[1], current + 1);
        }

        int result = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == N - 1) result = entry.getKey();
        }
        for (int[] ints : trust) if (ints[0] == result) return -1;

        return result;
    }
}
