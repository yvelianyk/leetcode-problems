package com.company.Contest183;

import java.util.Arrays;

public class Problem4 {
    private int[] memo;
    private int[] stoneValue;

    public String stoneGameIII(int[] stoneValue) {
        memo = new int[stoneValue.length];
        this.stoneValue = stoneValue;
        Arrays.fill(memo, -1);
        int max = getAliceDiff(0);
        if (max > 0) return "Alice";
        if (max < 0) return "Bob";
        return "Tie";
    }

    private int getAliceDiff(int index) {
        if (index >= stoneValue.length) return 0;
        if (memo[index] != -1) return memo[index];

        int result = Integer.MIN_VALUE;
        int total = 0;
        for (int i = index; i < index + 3; i++) {
            if (i == stoneValue.length) break;
            total += stoneValue[i];
            result = Math.max(result, total - getAliceDiff(i + 1));
        }

        memo[index] = result;
        return memo[index];
    }
}
