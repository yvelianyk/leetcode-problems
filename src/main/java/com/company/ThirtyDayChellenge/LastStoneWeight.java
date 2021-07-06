package com.company.ThirtyDayChellenge;

import java.util.PriorityQueue;
import java.util.Queue;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int stone : stones) pq.add(stone);

        while (pq.size() > 1) {
            int last = pq.poll();
            int prev = pq.poll();
            int newElem = Math.abs(last - prev);
            if (newElem != 0) pq.add(newElem);
        }
        return pq.size() == 0 ? 0 :pq.poll();
    }
}
