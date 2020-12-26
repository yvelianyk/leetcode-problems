package com.company.BContest42;

public class Problem2 {
    public double averageWaitingTime(int[][] customers) {
        double clock = 0;
        double total = 0;
        for (int[] customer : customers) {
            double start = Math.max(clock, 1.0 * customer[0]);
            clock = start + customer[1];
            total += clock - customer[0];
        }
        return 1.0 * total / customers.length;

    }
}
