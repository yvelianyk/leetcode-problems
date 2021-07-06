package com.company.BContest34;

import java.util.Arrays;

public class Problem4 {
    private int[] locations;
    private int finish;
    private final long MOD = 1_000_000_007;
    private long[][] memo;

    public int countRoutes(int[] locations, int start, int finish, int fuel) {
        this.locations = locations;
        this.finish = finish;
        this.memo = new long[locations.length][200];
        for (long[] ints : memo) Arrays.fill(ints, -1);
        long result = getRoutes(start, fuel);
        return (int) (result % MOD);
    }

    private long getRoutes(int curr, int fuel) {
        if (fuel < 0) return 0;
        long result = 0;
        if (curr == finish) result = 1;
        if (memo[curr][fuel] != -1) return memo[curr][fuel];

        for (int i = 0; i < locations.length; i++) {
            if (i == curr) continue;
            result += getRoutes(i, fuel - Math.abs(locations[curr] - locations[i]));
        }
        memo[curr][fuel] = result % MOD;
        return memo[curr][fuel];
    }
}
