package com.company.Contest186;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// TODO: TLE. Could be solved by prefix sum
public class Problem2 {
    private int[] cardPoints;
    private int k;
    private Map<String, Integer> memo;
    public int maxScore(int[] cardPoints, int k) {
        memo = new HashMap<>();
        this.cardPoints = cardPoints;
        this.k = k;
        return getMax(0, 0, cardPoints.length - 1, 0);
    }

    private int getMax(int step, int left, int right, int result) {
        if (step == k) {
            return result;
        }
        String key = getKey(step,left,right);
        if (memo.containsKey(key)) return memo.get(key);

        int leftVal = cardPoints[left];
        int rightVal = cardPoints[right];

        int res1 = getMax(step + 1, left + 1, right, result + leftVal);
        int res2 = getMax(step + 1, left, right - 1, result + rightVal);
        memo.put(key, Math.max(res1, res2));
        return memo.get(key);

    }

    private String getKey(int step, int left, int right) {
        StringBuilder sb = new StringBuilder();
        sb.append(step);
        sb.append(left);
        sb.append(right);
        return new String(sb);
    }

}
