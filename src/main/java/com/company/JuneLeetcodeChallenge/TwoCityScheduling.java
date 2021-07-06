package com.company.JuneLeetcodeChallenge;

import java.util.HashMap;
import java.util.Map;

public class TwoCityScheduling {
    private int[][] costs;
    private Map<String, Integer> memo;

    public int twoCitySchedCost(int[][] costs) {
        this.costs = costs;
        this.memo = new HashMap<>();
        return getMin(0, 0, 0);
    }

    private int getMin(int step, int countA, int countB) {
        if (countA > costs.length / 2 || countB > costs.length / 2)
            return Integer.MAX_VALUE / 2;
        if (countA == costs.length / 2 && countB == costs.length / 2)
            return 0;

        String key = getKey(step, countA, countB);
        if (memo.containsKey(key)) return memo.get(key);

        int takeA = costs[step][0] + getMin(step + 1, countA + 1, countB);
        int takeB = costs[step][1] + getMin(step + 1, countA, countB + 1);
        int result = Math.min(takeA, takeB);
        memo.put(key, result);
        return result;
    }

    private String getKey(int step, int countA, int countB) {
        return String.valueOf(step) + String.valueOf(countA) + String.valueOf(countB);
    }
}
