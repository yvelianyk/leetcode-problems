package com.company.PaintHouse256;

import java.util.HashMap;
import java.util.Map;

public class PaintHouse {
    Map<String, Integer> memo;
    public int minCost(int[][] costs) {
        memo = new HashMap<>();

        int red = getMin(0, costs, 0);
        int blue = getMin(0, costs, 1);
        int green = getMin(0, costs, 2);

        return Math.min(red, Math.min(blue, green));
    }

    private int getMin(int current, int[][] costs, int color) {
        if (current == costs.length) return 0;

        if (memo.containsKey(getKey(current, color))) {
            return memo.get(getKey(current, color));
        }

        int min = costs[current][color];
        int nextCurrent = current + 1;
        if (color == 0) {
            min += Math.min(getMin(nextCurrent, costs, 1), getMin(nextCurrent, costs, 2));
        } else if (color == 1) {
            min += Math.min(getMin(nextCurrent, costs, 0), getMin(nextCurrent, costs, 2));
        } else {
            min += Math.min(getMin(nextCurrent, costs, 0), getMin(nextCurrent, costs, 1));
        }

        memo.put(getKey(current, color), min);
        return min;
    }

    String getKey(int n, int i) {
        return String.valueOf(n).concat(String.valueOf(i));
    }
}
