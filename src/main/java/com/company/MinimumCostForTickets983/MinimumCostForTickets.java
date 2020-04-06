package com.company.MinimumCostForTickets983;

public class MinimumCostForTickets {
    private int[] days;
    private int[] costs;
    private int[][] memo;

    public int mincostTickets(int[] days, int[] costs) {
        this.days = days;
        this.costs = costs;
        this.memo = new int[3][days.length];
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < costs.length; i++) {
            result = Math.min(result, getMinCost(i, 0));
        }
        return result;
    }

    private int getMinCost(int costIndex, int start) {
        if (start >= days.length) return 0;
        if (memo[costIndex][start] != 0) return memo[costIndex][start];

        int last = getLastDayIndex(costIndex, start);
        int price = costs[costIndex];
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < costs.length; i++) {
            result = Math.min(result, getMinCost(i, last));
        }
        memo[costIndex][start] = price + result;
        return memo[costIndex][start];
    }

    private int getLastDayIndex(int costIndex, int start) {
        if (costIndex == 0) return start + 1;
        int result = start;
        for (int i = start; i < days.length; i++) {
            int day = days[i];
            if (costIndex == 1 && day - days[start] < 7) {
                result = i + 1;
            }
            if (costIndex == 2 && day - days[start] < 30) {
                result = i + 1;
            }
        }
        return result;
    }
}
