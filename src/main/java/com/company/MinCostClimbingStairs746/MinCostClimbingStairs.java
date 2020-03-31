package com.company.MinCostClimbingStairs746;

import java.util.HashMap;
import java.util.Map;

public class MinCostClimbingStairs {

    Map<Integer, Integer> memo;

    public int minCostClimbingStairs(int[] cost) {
        memo = new HashMap<>();
        return Math.min(getMin(0, cost), getMin(1, cost));
    }

    private int getMin(int current, int[] cost) {
        if (memo.containsKey(current)) {
            return memo.get(current);
        }
        if (current >= cost.length) return 0;
        int value = cost[current];
        int next1 = getMin(current + 1, cost);
        int next2 = getMin(current + 2, cost);
        int result = value + Math.min(next1, next2);
        memo.put(current, result);
        return result;
    }
}
