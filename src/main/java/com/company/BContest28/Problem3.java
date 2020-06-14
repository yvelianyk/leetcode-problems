package com.company.BContest28;

import java.util.PriorityQueue;

// TODO: USE PREFIX AND SUFFIX SUMS
public class Problem3 {
    public int minSumOfLengths(int[] arr, int target) {
        int left = 0;
        int right = 0;
        int currSum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        if (pq.size() < 2) return -1;
        return pq.poll() + pq.poll();
    }
}
