package com.company.BContest16;

import java.util.PriorityQueue;

public class Problem1 {
    public int[] replaceElements(int[] arr) {
        int[] result = new int[arr.length];
        if(arr.length == 0) return result;
        if(arr.length == 1) {
            result[0] = -1;
            return result;
        }
        PriorityQueue<Point> pq = new PriorityQueue<>((a, b) -> (b.val - a.val));
        for (int i = 1; i < arr.length; i++) {
            int i1 = arr[i];
            pq.add(new Point(i, i1));
        }

        Point biggest = pq.peek();
        result[0] = biggest.val;
        for (int i = 0; i < arr.length - 1; i++) {
            if (biggest.i <= i) {
                while (i >= biggest.i) {
                    biggest = pq.poll();
                }
            }
            result[i] = biggest.val;
        }
        result[arr.length - 1] = -1;
        return result;
    }

    class Point {
        int i;
        int val;
        Point(int i, int val) {
            this.i = i;
            this.val = val;
        }
    }
}
