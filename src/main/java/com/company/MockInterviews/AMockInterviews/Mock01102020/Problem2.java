package com.company.MockInterviews.AMockInterviews.Mock01102020;

import com.company.KClosestPointstoOrigin973.KClosestPointstoOrigin;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Problem2 {
    public int[][] kClosest(int[][] points, int K) {
        Queue<int[]> heap = new PriorityQueue<int[]>(new Problem2.HeapComparator());
        for (int i = 0; i < points.length; i++) {
            int[] point = points[i];
            heap.add(point);
        }
        int[][] result = new int[K][2];
        for (int i = 0; i < K; i++) {
            result[i] = heap.poll();
        }
        return result;
    }

    class HeapComparator implements Comparator<int[]> {
        @Override
        public int compare(int[] val1, int[] val2) {
            double first = Math.sqrt(val1[0] * val1[0] + val1[1] * val1[1]);
            double second = Math.sqrt(val2[0] * val2[0] + val2[1] * val2[1]);
            if (first < second) return -1;
            if (first > second) return 1;
            return 0;
        }

    }

}