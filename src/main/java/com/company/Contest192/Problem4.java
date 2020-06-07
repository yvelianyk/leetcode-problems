package com.company.Contest192;

import java.util.Arrays;

public class Problem4 {
    int[] houses;
    int[][] cost;
    int target;
    int[][][] memo;
    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        this.houses = houses;
        this.cost = cost;
        this.target = target;
        memo = new int[m + 1][n + 1][target + 1];
        int result = getMin(0, 0, 0);
        return result == Integer.MAX_VALUE / 2 ? -1 : result;
    }

    private int getMin(int current, int prev, int neighborhoods) {
        if (current == houses.length)
            return neighborhoods == target ? 0 : Integer.MAX_VALUE / 2;
        if (neighborhoods > target) return Integer.MAX_VALUE / 2;
        if (memo[current][prev][neighborhoods] != 0) return memo[current][prev][neighborhoods];

        int currentColor = houses[current];
        int result = Integer.MAX_VALUE / 2;
        if (currentColor == 0) {
            int[] houseCosts = cost[current];
            for (int i = 0; i < houseCosts.length; i++) {
                int cost1 = houseCosts[i];
                int nextNeighborhoods = prev == 0 ? 1 : prev == i + 1 ? neighborhoods : neighborhoods + 1;
                result = Math.min(result, getMin(current + 1, i + 1, nextNeighborhoods) + cost1);
            }
        } else {
            int nextNeighborhoods = prev == 0 ? 1 : prev == currentColor ? neighborhoods : neighborhoods + 1;
            result = getMin(current + 1, currentColor, nextNeighborhoods);
        }

        memo[current][prev][neighborhoods] = result;
        return result;
    }
}
