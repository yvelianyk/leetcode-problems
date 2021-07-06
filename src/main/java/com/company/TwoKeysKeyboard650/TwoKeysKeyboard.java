package com.company.TwoKeysKeyboard650;

import java.util.Arrays;

public class TwoKeysKeyboard {

    int memo[][];

    public int minSteps(int n) {
        memo = new int[n + 1][n + 1];
        for (int[] ints : memo) Arrays.fill(ints, -1);
        int res = getMinSteps(0, 1, 0, n);
        return res;
    }

    private int getMinSteps(int buffer, int current, int steps, int n) {
        if (current == n) {
            return steps;
        }
        if (current > n || buffer > n) return Integer.MAX_VALUE;

        if (memo[buffer][current] != -1) return memo[buffer][current];
        int minPaste = Integer.MAX_VALUE;
        int copyAll = Integer.MAX_VALUE;
        if (buffer != current) {
            copyAll = getMinSteps(current, current, steps + 1, n);
        }
        if (buffer > 0) {
            minPaste = getMinSteps(buffer, current + buffer, steps + 1, n);
        }

        memo[buffer][current] = Math.min(minPaste, copyAll);
        return memo[buffer][current];
    }
}
