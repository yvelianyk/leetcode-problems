package com.company.MockInterviews.AmazonMockInterviews.Mock12242019;

import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/moving-average-from-data-stream/
public class MovingAverage {

    private int size;
    private Queue<Integer> queue;

    public MovingAverage(int size) {
        this.size = size;
        this.queue = new LinkedList<>();
    }

    public double next(int val) {
        int currSize = Math.min(queue.size(), size);

        double sum = 0;
        queue.add(val);
        currSize++;
        if (currSize > size) {
            queue.poll();
            currSize--;
        }

        for (Integer integer : queue) {
            sum += integer;
        }
        return (double) (sum / currSize);
    }
}