package com.company.Contest193;

public class Problem3 {

    int[] bloomDay;
    int m;
    int k;

    public int minDays(int[] bloomDay, int m, int k) {
        long flowers = m * k;
        if (flowers > bloomDay.length) return -1;
        this.bloomDay = bloomDay;
        this.m = m;
        this.k = k;

        int lo = Integer.MAX_VALUE;
        int hi = Integer.MIN_VALUE;
        for (int i1 : bloomDay) {
            lo = Math.min(lo, i1);
            hi = Math.max(hi, i1);
        }

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (check(mid)) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return lo;
    }

    private boolean check(int day) {
        int adj = 0;
        int number = 0;
        for (int i1 : bloomDay) {
            if (i1 <= day) {
                adj++;
                if (adj == k) {
                    number++;
                    adj = 0;
                }
            } else {
                adj = 0;
            }
        }
        return number >= m;
    }
}
