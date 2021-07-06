package com.company.NumOfWaysToStaySame1269;

import java.util.HashMap;
import java.util.Map;

public class NumOfWaysToStaySame {
    private final int MOD = 1_000_000_007;
    private int steps;
    private int arrLen;
    private Map<String, Long> memo;

    public int numWays(int steps, int arrLen) {
        this.steps = steps;
        this.arrLen = arrLen;
        memo = new HashMap<>();

        return (int) getWays(0, 0);
    }

    private long getWays(int index, int step) {
        if (index < 0 || index >= arrLen) return 0;
        if (step == steps) return index == 0 ? 1 : 0;
        String key = getKey(index, step);
        if (memo.containsKey(key)) return memo.get(key);

        long result = getWays(index - 1, step + 1) % MOD;
        result = (result + getWays(index, step + 1)) % MOD;
        result = (result + getWays(index + 1, step + 1)) % MOD;

        memo.put(key, result);
        return result;
    }

    private String getKey(int index, int step) {
        return index + "#" + step;
    }
}
