package com.company.Contest217;

public class Problem1 {
    public int maximumWealth(int[][] accounts) {
        int result = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int res = 0;
            for (int k : account) res += k;
            result = Math.max(result, res);
        }
        return result;
    }
}
