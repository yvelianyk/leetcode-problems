package com.company.AugustLeetcodeChallenge;

import java.util.HashMap;
import java.util.Map;

public class MinDaysToEatNOranges {
    Map<Integer,Integer> memo;

    public int minDays(int n) {
        memo = new HashMap<>();
        return getMin(n);
    }

    private int getMin(int n) {
        if (n <= 0) return 0;
        if (memo.containsKey(n)) return memo.get(n);

        if (n % 3 == 0 && n % 2 == 0) {
            int res = Math.min(1 + getMin(n / 2), getMin(n / 3) + 1);
            memo.put(n, res);
            return res;
        } else if (n % 3 == 0) {
            int res =  Math.min(1 + getMin(n - 1), getMin(n / 3) + 1);
            memo.put(n, res);
            return res;
        } else if (n % 2 == 0) {
            int res = Math.min(1 + getMin(n - 1), getMin(n / 2) + 1);
            memo.put(n, res);
            return res;
        } else {
            int res = 1 + getMin(n - 1);
            memo.put(n, res);
            return res;
        }
    }
}
